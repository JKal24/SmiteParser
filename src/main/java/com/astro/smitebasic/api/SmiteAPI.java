package com.astro.smitebasic.api;

import com.astro.smitebasic.db.player.PlayerController;
import com.astro.smitebasic.db.player.PlayerInfo;
import com.astro.smitebasic.db.player.friends.FriendsInfo;
import com.astro.smitebasic.db.session.SessionController;
import com.astro.smitebasic.db.session.SessionInfo;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.security.NoSuchAlgorithmException;
import java.util.Objects;

@Component
public class SmiteAPI implements CommandLineRunner {

    @Value("${smite.api}")
    private String apiUri;

    @Value("${smite.dev-id}")
    private String devID;

    @Value("${smite.auth-key}")
    private String authKey;

    @Value("${smite.acc}")
    private String mainAccName;

    @Autowired
    private SessionController sessionController;

    @Autowired
    private PlayerController playerController;

    @Autowired
    private Config config;

    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    public String ping(RestTemplate template) throws NoSuchAlgorithmException {
        String timeStamp = config.makeAPITimeStamp();
        String pingRequest = config.makeRequestUri(apiUri, "pingJson");

        return template.getForObject(pingRequest, String.class);
    }

    public SessionInfo createSession(RestTemplate template) throws NoSuchAlgorithmException {
        String timeStamp = config.makeAPITimeStamp();
        String createSessionRequest = config.makeRequestUri(apiUri, "createsessionJson", devID,
                config.makeSignature("createsession", timeStamp, devID, authKey), timeStamp);

        return template.getForObject(createSessionRequest, SessionInfo.class);
    }

    public String getSessionID() throws NoSuchAlgorithmException {
        String[] currentTimeStamp = config.makeSignatureTimeStamp().split(" ");
        for (SessionInfo connection : sessionController.getConnections()) {
            if (config.verifySession(currentTimeStamp[0], currentTimeStamp[1], connection.getDate(), connection.getTime()))
                return connection.getSession_id();
        }

        SessionInfo info = createSession(restTemplate(new RestTemplateBuilder()));
        sessionController.addConnection(info);
        return info.getSession_id();
    }

    public PlayerInfo getPlayerInfo(RestTemplate template) throws NoSuchAlgorithmException {
        String timeStamp = config.makeAPITimeStamp();
        String playerInfoRequest = config.makeRequestUri(apiUri, "getplayerJson", devID,
                config.makeSignature("getplayer", timeStamp, devID, authKey), getSessionID(), timeStamp, mainAccName);

        return (Objects.requireNonNull(template.getForObject(playerInfoRequest, PlayerInfo[].class)))[0];
    }

    public FriendsInfo getFriendsInfo(RestTemplate template) throws NoSuchAlgorithmException {
        String timeStamp = config.makeAPITimeStamp();
        String friendsInfoRequest = config.makeRequestUri(apiUri, "getplayeridbynameJson", devID,
                config.makeSignature("getplayeridbyname", timeStamp, devID, authKey), getSessionID(), timeStamp, mainAccName);

        return (Objects.requireNonNull(template.getForObject(friendsInfoRequest, FriendsInfo[].class)))[0];
    }

    @Override
    public void run(String... args) throws Exception {
        RestTemplate template = restTemplate(new RestTemplateBuilder());
        String timeStamp = config.makeAPITimeStamp();

    }
}
