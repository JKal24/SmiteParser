package com.astro.smitebasic.api;

import com.astro.smitebasic.info.ConnectionInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.web.client.RestTemplate;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class SmiteAPI implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(Commands.class);
    private ConnectionInfo currentInfo;

    @Value("${smite.api}")
    private String apiUri;
    @Value("${smite.dev-id}")
    private String devID;
    @Value("${smite.auth-key}")
    private String authKey;
    @Value("${smite.acc}")
    private String mainAcc;

    public String makeTimeStamp() {
        Instant instant = Instant.now();
        DateTimeFormatter formatterUTC = DateTimeFormatter.ofPattern("yyyyMMddHHmmss").withZone(ZoneId.of("UTC"));
        return formatterUTC.format(instant);
    }

    public String makeSignature(String time) throws NoSuchAlgorithmException {
        String sig = "3665" + "createsession" + "D328B92A2C9A44FCB01854A300ACE310" + time;
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update((sig).getBytes());

        byte[] signature = md.digest();
        StringBuilder sb = new StringBuilder();
        for (byte x : signature) {
            sb.append(String.format("%02X", x).toLowerCase());
        }

        return sb.toString();
    }

    public String makeRequestUri(String... components) {
        return String.join("/", components);
    }

    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    public void runAPI(RestTemplate template) throws Exception {
        String timeStamp = makeTimeStamp();
        String createSession = makeRequestUri(apiUri, "createsessionJson", devID, makeSignature(timeStamp), timeStamp);
        currentInfo = template.getForObject(createSession, ConnectionInfo.class);
        log.info(currentInfo.toString());
    }

    @Override
    public void run(String... args) throws Exception {
        runAPI(restTemplate(new RestTemplateBuilder()));
    }
}
