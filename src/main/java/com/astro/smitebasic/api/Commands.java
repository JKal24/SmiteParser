package com.astro.smitebasic.api;

import com.astro.smitebasic.db.Controller;
import com.astro.smitebasic.db.Queries;
import com.astro.smitebasic.db.session.SessionController;
import com.astro.smitebasic.db.session.SessionInfo;
import com.astro.smitebasic.smite.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.stream.Stream;

@Component
public class Commands {

    @Value("${smite.api}")
    private String apiUri;

    @Value("${smite.dev-id}")
    private String devID;

    @Value("${smite.auth-key}")
    private String authKey;

    @Autowired
    private Config config;

    @Autowired
    private Queries queries;

    @Autowired
    private SessionController sessionController;

    private final Logger LOGGER = Logger.getLogger(Commands.class.getName());

    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

     // Checks to see if access to the API database is valid
    public String ping() {
        try {
            String pingRequest = config.makeRequestUri(apiUri, "pingJson");
            return restTemplate(new RestTemplateBuilder()).getForObject(pingRequest, String.class);
        } catch (Exception exception) {
            LOGGER.info("Could not access API");
        } finally {
            return "No information";
        }
    }

    // Sessions are created independently
    public String createSession(RestTemplate template) throws NoSuchAlgorithmException {
        String timeStamp = config.makeAPITimeStamp();
        String createSessionRequest = config.makeRequestUri(apiUri, "createsessionJson", devID,
                config.makeSignature("createsession", timeStamp, devID, authKey), timeStamp);

        SessionInfo info = template.getForObject(createSessionRequest, SessionInfo.class);
        sessionController.addConnection(info);
        return info.getSession_id();
    }

    public String getSessionID() throws NoSuchAlgorithmException {
        String[] currentTimeStamp = config.makeSignatureTimeStamp().split(" ");
        for (SessionInfo connection : sessionController.getConnections()) {
            if (config.verifySession(currentTimeStamp[0], currentTimeStamp[1], connection.getDate(), connection.getTime()))
                return connection.getSession_id();
            sessionController.deleteConnection(connection);
        }

        return createSession(restTemplate(new RestTemplateBuilder()));
    }

    // Makes any API request, requires POJO
    public <T> T makeRequestCall(Class<T> responseType, String request, String... additionalParams) throws NoSuchAlgorithmException {
        String timestamp = config.makeAPITimeStamp();
        String[] initialData = {apiUri, request + "json", devID, config.makeSignature(request, timestamp, devID, authKey), getSessionID(), timestamp};
        String[] requestData = Stream.concat(Arrays.stream(initialData), Arrays.stream(additionalParams.clone())).toArray(String[]::new);

        String requestUri = config.makeRequestUri(requestData);
        RestTemplate template = restTemplate(new RestTemplateBuilder());
        return template.getForObject(requestUri, responseType);

    }
}
