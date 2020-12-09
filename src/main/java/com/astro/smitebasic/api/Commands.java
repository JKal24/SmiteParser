package com.astro.smitebasic.api;

import com.astro.smitebasic.db.session.SessionController;
import com.astro.smitebasic.db.session.SessionInfo;
import com.astro.smitebasic.smite.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.security.NoSuchAlgorithmException;

@Component
public class Commands {

    @Value("${smite.api}")
    private String apiUri;

    @Value("${smite.dev-id}")
    private String devID;

    @Value("${smite.auth-key}")
    private String authKey;

    @Value("${smite.acc}")
    private String mainAccName;

    @Autowired
    private Config config;

    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    public String ping() throws NoSuchAlgorithmException {
        String pingRequest = config.makeRequestUri(apiUri, "pingJson");
        return restTemplate(new RestTemplateBuilder()).getForObject(pingRequest, String.class);
    }

    public <T extends Info> T makeRequestCall(Class<T> returnType, String request, SessionController sessionController) throws NoSuchAlgorithmException {
        String timestamp = config.makeAPITimeStamp();
        String requestUri = config.makeRequestUri(request + "json", devID, config.makeSignature(request, timestamp, devID, authKey),
                getSessionID(sessionController), timestamp);
        return restTemplate(new RestTemplateBuilder()).getForObject(requestUri, returnType);
    }

    public String getSessionID(SessionController sessionController) throws NoSuchAlgorithmException {
        String[] currentTimeStamp = config.makeSignatureTimeStamp().split(" ");
        for (SessionInfo connection : sessionController.getConnections()) {
            if (config.verifySession(currentTimeStamp[0], currentTimeStamp[1], connection.getDate(), connection.getTime()))
                return connection.getSession_id();
        }

        SessionInfo info = makeRequestCall(SessionInfo.class, "createsession", sessionController);
        sessionController.addConnection(info);
        return info.getSession_id();
    }
}
