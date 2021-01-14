package com.astro.smitebasic.api;

import com.astro.smitebasic.objects.session.SessionService;
import com.astro.smitebasic.objects.session.SessionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

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
    private SessionService sessionService;

    @Autowired
    private RestTemplate restTemplate;

    private final Logger LOGGER = Logger.getLogger(Commands.class.getName());

     // Checks to see if access to the API database is valid
    public String ping() {
        try {
            String pingRequest = Utils.makeRequestUri(apiUri, "pingJson");
            return restTemplate.getForObject(pingRequest, String.class);
        } catch (Exception exception) {
            LOGGER.info("Could not access API");
        }
        return "No information";
    }

    // Sessions are created independently
    public String createSession(RestTemplate template) {
        String timeStamp = Utils.makeAPITimeStamp();
        String createSessionRequest = Utils.makeRequestUri(apiUri, "createsessionJson", devID,
                Utils.makeSignature("createsession", timeStamp, devID, authKey), timeStamp);

        SessionInfo info = template.getForObject(createSessionRequest, SessionInfo.class);
        sessionService.addConnection(info);
        return info.getSession_id();
    }

    public String getSessionID() {
        for (SessionInfo connection : sessionService.getConnections()) {
            if (Utils.verifySession(connection.getDate(), connection.getTime()))
                return connection.getSession_id();
            sessionService.deleteConnection(connection);
        }

        return createSession(restTemplate);
    }

    // Makes any API request, requires POJO
    public <T> T makeRequestCall(Class<T> responseType, String request, String... additionalParams) {
        String timestamp = Utils.makeAPITimeStamp();
        String[] initialData = {apiUri, request + "json", devID, Utils.makeSignature(request, timestamp, devID, authKey), getSessionID(), timestamp};
        String requestUri = Utils.makeRequestUri(
                Stream.concat(Arrays.stream(initialData),
                        Arrays.stream(additionalParams.clone())).toArray(String[]::new)
        );

        String info = restTemplate.getForObject(requestUri, String.class);
        return Utils.parseJSONData(responseType, info);
    }

    public String makeRequestCall(String request, String... additionalParams) {
        String timestamp = Utils.makeAPITimeStamp();
        String[] initialData = {apiUri, request + "json", devID, Utils.makeSignature(request, timestamp, devID, authKey), getSessionID(), timestamp};
        String requestUri = Utils.makeRequestUri(
                Stream.concat(Arrays.stream(initialData),
                        Arrays.stream(additionalParams.clone())).toArray(String[]::new)
        );

        return restTemplate.getForObject(requestUri, String.class);
    }
}
