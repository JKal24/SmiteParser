package com.astro.smitebasic.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Config {

    @Value("${smite.api}")
    private String apiUri;

    @Value("${smite.dev-id}")
    private String devID;

    @Value("${smite.auth-key}")
    private String authKey;

    // API Signature with valid devID and authentication key

    public static String makeSignature(String request, String time, String devID, String authKey) throws NoSuchAlgorithmException {
        String sig = devID + request + authKey + time;
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update((sig).getBytes());

        byte[] signature = md.digest();
        StringBuilder sb = new StringBuilder();
        for (byte x : signature) {
            sb.append(String.format("%02X", x).toLowerCase());
        }

        return sb.toString();
    }

    public static String makeRequestUri(String... components) {
        return String.join("/", components);
    }

    public static boolean verifySession(String currentDate, String currentTime, String pastDate, String pastTime) {
        if (compareDate(currentDate, pastDate)) {
            if (compareTime(currentTime, pastTime)) {
                return true;
            }
        }
        return false;
    }

    // Custom timestamps used for API requests

    public static String makeAPITimeStamp() {
        return makeTimeStamp("yyyyMMddHHmmss");
    }

    public static String makeSignatureTimeStamp() {
        return makeTimeStamp("MM/dd/yyyy HH:mm:ss:a");
    }

    public static String makeRecordTimeStamp() { return makeTimeStamp("dd/MM/yy HH:mm:ss:a"); }

    private static String makeTimeStamp(String format) {
        Instant instant = Instant.now();
        DateTimeFormatter formatterUTC = DateTimeFormatter.ofPattern(format).withZone(ZoneId.of("UTC"));
        return formatterUTC.format(instant);
    }

    public static Boolean compareDate(String currentDate, String pastDate) {
        String[] currentDateArr = currentDate.split("/");
        String[] pastDateArr = pastDate.split("/");

        for (int parse = 0; parse < Math.min(currentDateArr.length, pastDateArr.length); parse++) {
            if (Integer.parseInt(currentDateArr[parse].replaceFirst("^0+(?!$)", "")) !=
                    Integer.parseInt(pastDateArr[parse].replaceFirst("^0+(?!$)", "")))
                return false;
        }
        return true;
    }

    public static Boolean compareTime(String currentTime, String pastTime) {
        String[] currentTimeArr = sliceTimeArr(currentTime);
        String[] pastTimeArr = sliceTimeArr(pastTime);

        // Check if the last session request sent was less than 15 minutes ago

        int compareHours = customTimeTrim(pastTimeArr[0]);
        int compareMinutes = customTimeTrim(pastTimeArr[1]);
        int compareSeconds = customTimeTrim(pastTimeArr[2]);
        String AMOrPM = customAMOrPM(pastTimeArr[3]);

        if (compareMinutes < 45) {
            compareMinutes += 15;
        } else {
            compareMinutes = (compareMinutes + 15) % 60;
            compareHours = compareHours >= 12 ? compareHours % 12 : compareHours + 1;
        }

        // Compares hours, must be equal after changes and AM or PM
        if (compareHours == customTimeTrim(currentTimeArr[0]) && AMOrPM.equals(customAMOrPM(currentTimeArr[3]))) {

            // Evaluate the amount of minutes left before expiring
            if (compareMinutes > customTimeTrim(currentTimeArr[1])) {

                return true;
            } else if (compareMinutes == customTimeTrim(currentTimeArr[1])) {

                // Evaluate the amount of seconds left before expiring, must have at least 5 seconds to spare
                compareSeconds = compareSeconds > 55 ? -1 : compareSeconds + 5;
                if (compareSeconds > customTimeTrim(currentTimeArr[2])) {
                    return true;
                }
            }
        }

        return false;
    }

    private static String[] sliceTimeArr(String time) {
        return time.replaceAll(" ", ":").split(":");
    }

    private static String customAMOrPM(String time) {
        return time.replaceAll(".", "").toUpperCase();
    }

    private static Integer customTimeTrim(String timeElement) {
        return Integer.parseInt(timeElement.replaceFirst("^0+(?!$)", ""));
    }

    // Will parse JSON data, regardless of whether it is a JSON array or object
    public static <T> T parseJSONData(Class<T> responseType, String data) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY,true);
        return mapper.readValue(data, responseType);
    }

}
