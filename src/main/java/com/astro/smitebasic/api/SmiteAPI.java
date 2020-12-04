package com.astro.smitebasic.api;

import com.astro.smitebasic.db.player.PlayerController;
import com.astro.smitebasic.db.player.PlayerInfo;
import com.astro.smitebasic.db.session.SessionController;
import com.astro.smitebasic.db.session.SessionInfo;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

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
    private PlayerController playerController;

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

    public PlayerInfo getPlayerInfo(RestTemplate template) throws Exception {
        String timeStamp = config.makeTimeStamp("yyyyMMddHHmmss");
        String playerInfo = config.makeRequestUri(apiUri, "getplayerJson", devID, config.makeSignature("getplayer", timeStamp, devID, authKey), getSessionID(), timeStamp, mainAcc);
//        PlayerInfo info = template.getForObject(playerInfo, PlayerInfo.class);
//        System.out.println(info);

        String info = template.getForObject(playerInfo, String.class);
        PlayerInfo info1 = template.getForObject(playerInfo, PlayerInfo.class);
        JSONParser parser = new JSONParser(info);

        System.out.println(parser.parse());
        System.out.println(info);
        return info1;
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
        String[] currentTimeStamp = config.makeTimeStamp("MM/dd/yyyy HH:mm:ss:a").split(" ");
        String currentDate = currentTimeStamp[0];
        String currentTime = currentTimeStamp[1];

        Iterable<SessionInfo> allConnectionInfo = sessionController.getConnections();
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

        PlayerInfo playerInfo = getPlayerInfo(restTemplate(new RestTemplateBuilder()));
//        playerController.addConnection(playerInfo);
        System.out.println(playerInfo.toString());
    }
}
