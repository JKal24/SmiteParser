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

    public SessionInfo createSession(RestTemplate template) throws Exception {
        String timeStamp = config.makeTimeStamp("yyyyMMddHHmmss");
        String createSession = config.makeRequestUri(apiUri, "createsessionJson", devID, config.makeSignature("createsession", timeStamp, devID, authKey), timeStamp);
        String sessionInfo = template.getForObject(createSession, String.class);
        return template.getForObject(createSession, SessionInfo.class);
    }

    public String getSessionID() throws Exception {
        String[] currentTimeStamp = config.makeTimeStamp("MM/dd/yyyy HH:mm:ss:a").split(" ");
        for (SessionInfo connection : sessionController.getConnections()) {
            if (config.verifySession(currentTimeStamp[0], currentTimeStamp[1], connection.getDate(), connection.getTime()))
                return connection.getSession_id();
        }

        SessionInfo info = createSession(restTemplate(new RestTemplateBuilder()));
        sessionController.addConnection(info);
        return info.getSession_id();
    }

    public PlayerInfo[] getPlayerInfo(RestTemplate template) throws Exception {
        String timeStamp = config.makeTimeStamp("yyyyMMddHHmmss");
        String playerInfo = config.makeRequestUri(apiUri, "getplayerJson", devID, config.makeSignature("getplayer", timeStamp, devID, authKey), getSessionID(), timeStamp, mainAccName);
        return template.getForObject(playerInfo, PlayerInfo[].class);
    }

    @Override
    public void run(String... args) throws Exception {
        RestTemplate template = restTemplate(new RestTemplateBuilder());
        String timeStamp = config.makeTimeStamp("yyyyMMddHHmmss");

        String friendsInfoRequest = config.makeRequestUri(apiUri, "getplayeridbynameJson", devID, config.makeSignature("getplayeridbyname", timeStamp, devID, authKey),
                getSessionID(), timeStamp, mainAccName);

        String friendsInfoString = template.getForObject(friendsInfoRequest, String.class);
        FriendsInfo[] friendsInfo = template.getForObject(friendsInfoRequest, FriendsInfo[].class);
        for (FriendsInfo info : friendsInfo) {
            System.out.println(info);
        }
        System.out.println(friendsInfoString);

        PlayerInfo[] playerInfo = getPlayerInfo(restTemplate(new RestTemplateBuilder()));
        for (PlayerInfo info : playerInfo) {
            playerController.addConnection(info);
            System.out.println(info);
        }

        String playerInfoRequest = config.makeRequestUri(apiUri, "getplayerJson", devID, config.makeSignature("getplayer", timeStamp, devID, authKey), getSessionID(), timeStamp, mainAccName);
        String playerInfoString = template.getForObject(playerInfoRequest, String.class);
        System.out.println(playerInfoString);
    }
}
