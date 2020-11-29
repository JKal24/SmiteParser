package com.astro.smitebasic.api;

import com.astro.smitebasic.db.Commands;
import com.astro.smitebasic.db.session.SessionController;
import com.astro.smitebasic.api.session.SessionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.support.NullValue;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.security.NoSuchAlgorithmException;

@Component
public class SmiteAPI implements CommandLineRunner {

    @Value("${smite.api}")
    private String apiUri;

    @Value("${smite.dev-id}")
    private String devID;

    @Value("${smite.auth-key}")
    private String authKey;

    @Value("${smite.acc}")
    private String mainAcc;

    @Autowired
    private SessionController sessionController;

    @Autowired
    private Commands commands;

    @Autowired
    private Config config;

    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    public SessionInfo createSession(RestTemplate template) throws Exception {
        String timeStamp = config.makeTimeStamp("yyyyMMddHHmmss");
        String createSession = config.makeRequestUri(apiUri, "createsessionJson", devID, config.makeSignature("createsession", timeStamp, devID, authKey), timeStamp);
        return template.getForObject(createSession, SessionInfo.class);
    }

    public String getPlayerInfo(RestTemplate template) throws Exception {
        String timeStamp = config.makeTimeStamp("yyyyMMddHHmmss");
        String playerInfo = config.makeRequestUri(apiUri, "getplayerJson", devID, config.makeSignature("getplayer", timeStamp, devID, authKey), getSessionID(), timeStamp, mainAcc);
        String info = template.getForObject(playerInfo, String.class);
        return info;
    }

    public String getSessionID() throws Exception {
        String[] currentTimeStamp = config.makeTimeStamp("MM/dd/yyyy HH:mm:ss:a").split(" ");
        for (SessionInfo connection : sessionController.getConnections()) {
            if (config.verifySession(currentTimeStamp[0], currentTimeStamp[1], connection.getDate(), connection.getTime()))
                return connection.getSession_id();
        }
        throw new Exception("Could not find a suitable session, please create a new one");
    }

    @Override
    public void run(String... args) throws Exception {
        Iterable<SessionInfo> allConnectionInfo = sessionController.getConnections();
        String[] currentTimeStamp = config.makeTimeStamp("MM/dd/yyyy HH:mm:ss:a").split(" ");
        String currentDate = currentTimeStamp[0];
        String currentTime = currentTimeStamp[1];

        SessionInfo info = null;

        for (SessionInfo connection : allConnectionInfo) {
            if (config.verifySession(currentDate, currentTime, connection.getDate(), connection.getTime())) {
                info = connection;
                break;
            }
            sessionController.deleteConnection(connection);
        }

        if (info == null) {
            info = createSession(restTemplate(new RestTemplateBuilder()));
            sessionController.addConnection(info);
        }

        String playerInfo = getPlayerInfo(restTemplate(new RestTemplateBuilder()));
        System.out.println(playerInfo);
    }
}
