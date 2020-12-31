package com.astro.smitebasic.api;

import com.astro.smitebasic.objects.session.SessionService;
import com.astro.smitebasic.objects.session.SessionInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
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
    private SessionService sessionController;

    private final Logger LOGGER = Logger.getLogger(Commands.class.getName());

    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

     // Checks to see if access to the API database is valid
    public String ping() {
        try {
            String pingRequest = Config.makeRequestUri(apiUri, "pingJson");
            return restTemplate(new RestTemplateBuilder()).getForObject(pingRequest, String.class);
        } catch (Exception exception) {
            LOGGER.info("Could not access API");
        }
        return "No information";
    }

    // Sessions are created independently
    public String createSession(RestTemplate template) throws NoSuchAlgorithmException {
        String timeStamp = Config.makeAPITimeStamp();
        String createSessionRequest = Config.makeRequestUri(apiUri, "createsessionJson", devID,
                Config.makeSignature("createsession", timeStamp, devID, authKey), timeStamp);

        SessionInfo info = template.getForObject(createSessionRequest, SessionInfo.class);
        sessionController.addConnection(info);
        return info.getSession_id();
    }

    public String getSessionID() throws NoSuchAlgorithmException {
        for (SessionInfo connection : sessionController.getConnections()) {
            if (Config.verifySession(connection.getDate(), connection.getTime()))
                return connection.getSession_id();
            sessionController.deleteConnection(connection);
        }

        return createSession(restTemplate(new RestTemplateBuilder()));
    }

    // Makes any API request, requires POJO
    public <T> T makeRequestCall(Class<T> responseType, String request, String... additionalParams) throws JsonProcessingException, NoSuchAlgorithmException {
        String timestamp = Config.makeAPITimeStamp();
        String[] initialData = {apiUri, request + "json", devID, Config.makeSignature(request, timestamp, devID, authKey), getSessionID(), timestamp};
        String requestUri = Config.makeRequestUri(
                Stream.concat(Arrays.stream(initialData),
                        Arrays.stream(additionalParams.clone())).toArray(String[]::new)
        );

        String info = restTemplate(new RestTemplateBuilder()).getForObject(requestUri, String.class);
        return Config.parseJSONData(responseType, info);
    }

    public String makeRequestCall(String request, String... additionalParams) throws NoSuchAlgorithmException {
        String timestamp = Config.makeAPITimeStamp();
        String[] initialData = {apiUri, request + "json", devID, Config.makeSignature(request, timestamp, devID, authKey), getSessionID(), timestamp};
        String requestUri = Config.makeRequestUri(
                Stream.concat(Arrays.stream(initialData),
                        Arrays.stream(additionalParams.clone())).toArray(String[]::new)
        );

        return restTemplate(new RestTemplateBuilder()).getForObject(requestUri, String.class);
    }
}
