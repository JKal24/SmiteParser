package com.astro.smitebasic.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Utils {

    @Value("${smite.api}")
    private String apiUri;

    @Value("${smite.dev-id}")
    private String devID;

    @Value("${smite.auth-key}")
    private String authKey;

    // API Signature with valid devID and authentication key

    public static String makeSignature(String request, String time, String devID, String authKey) {
        try {
            String sig = devID + request + authKey + time;
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update((sig).getBytes());

            byte[] signature = md.digest();
            StringBuilder sb = new StringBuilder();
            for (byte x : signature) {
                sb.append(String.format("%02X", x).toLowerCase());
            }

            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String makeRequestUri(String... components) {
        return String.join("/", components);
    }

    public static boolean verifySession(String pastDate, String pastTime) {
        String[] currentTimeStamp = Utils.makeSignatureTimeStamp().split(" ");
        if (compareDate(currentTimeStamp[0], pastDate, 0)) {
            if (compareTime(currentTimeStamp[1], pastTime, 15)) {
                return true;
            }
        }
        return false;
    }

    // Custom timestamps used for API requests

    public static String makeAPITimeStamp() {
        return makeTimeStamp("yyyyMMddHHmmss");
    }

    public static String makeAPIDate() {
        return makeTimeStamp("yyyyMMdd");
    }

    public static String makeAPIDate(LocalDate date) {
        return makeTimeStamp(date, "yyyyMMdd");
    }

    public static String makeSignatureTimeStamp() {
        return makeTimeStamp("MM/dd/yyyy HH:mm:ss:a");
    }

    public static String makeRecordTimeStamp() { return makeTimeStamp("dd/MM/yy HH:mm:ss:a"); }

    public static String makeCustomTimeStamp(Instant instant, String format) {
        return makeTimeStamp(instant, format);
    }

    private static String makeTimeStamp(String format) {
        Instant instant = Instant.now();
        DateTimeFormatter formatterUTC = DateTimeFormatter.ofPattern(format).withZone(ZoneId.of("UTC"));
        return formatterUTC.format(instant);
    }

    private static String makeTimeStamp(Instant instant, String format) {
        DateTimeFormatter formatterUTC = DateTimeFormatter.ofPattern(format).withZone(ZoneId.of("UTC"));
        return formatterUTC.format(instant);
    }

    private static String makeTimeStamp(LocalDate date, String format) {
        DateTimeFormatter formatterUTC = DateTimeFormatter.ofPattern(format).withZone(ZoneId.of("UTC"));
        return date.format(formatterUTC);
    }

    public static Boolean compareDate(String currentDate, String pastDate, int daysBetween) {
        String[] currentDateArr = currentDate.split("/");
        String[] pastDateArr = pastDate.split("/");

        for (int parse = 0; parse < Math.min(currentDateArr.length, pastDateArr.length); parse++) {
            if (Integer.parseInt(currentDateArr[parse].replaceFirst("^0+(?!$)", "")) !=
                    Integer.parseInt(pastDateArr[parse].replaceFirst("^0+(?!$)", "")))
                return false;
        }
        return true;
    }

    public static LocalDate subtractDays(String recordedYear, String recordedMonth, String recordedDay, int difference) {
        LocalDate date = LocalDate.of(Integer.parseInt(recordedYear), Integer.parseInt(recordedMonth), Integer.parseInt(recordedDay));
        return date.minusDays(difference);
    }

    public static Boolean compareTime(String currentTime, String pastTime, int timeBetween) {
        String[] currentTimeArr = sliceTimeArr(currentTime);
        String[] pastTimeArr = sliceTimeArr(pastTime);

        // Check if the last session request sent was less than 'timeBetween' minutes ago

        int compareHours = customTimeTrim(pastTimeArr[0]);
        int compareMinutes = customTimeTrim(pastTimeArr[1]);
        int compareSeconds = customTimeTrim(pastTimeArr[2]);
        String AMOrPM = customAMOrPM(pastTimeArr[3]);

        if (compareMinutes < (60 - timeBetween)) {
            compareMinutes += timeBetween;
            compareHours %= 12;
        } else {
            compareMinutes = (compareMinutes + timeBetween) % 60;
            compareHours = (compareHours + 1) % 12;
        }

        // Compares hours, must be equal after changes and AM or PM
        if (compareHours == customTimeTrim(currentTimeArr[0]) % 12 && AMOrPM.equals(customAMOrPM(currentTimeArr[3]))) {

            // Evaluate the amount of minutes left before expiring
            if (compareMinutes > customTimeTrim(currentTimeArr[1])) {

                return true;
            } else if (compareMinutes == customTimeTrim(currentTimeArr[1])) {

                // Evaluate the amount of seconds left before expiring, must have at least 5 seconds to spare
                compareSeconds = compareSeconds > 55 ? -1 : compareSeconds + 5;
                return compareSeconds > customTimeTrim(currentTimeArr[2]);
            }
        }

        return false;
    }

    private static String[] sliceTimeArr(String time) {
        return time.replaceAll(" ", ":").split(":");
    }

    private static String customAMOrPM(String time) {
        return time.replaceAll("\\.", "").toUpperCase();
    }

    private static Integer customTimeTrim(String timeElement) {
        return Integer.parseInt(timeElement.replaceFirst("^0+(?!$)", ""));
    }

    // Will parse JSON data, regardless of whether it is a JSON array or object
    public static <T> T parseJSONData(Class<T> responseType, String data) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            return mapper.readValue(data, responseType);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T> T parseSingleEntry(T[] arr) {
        return arr[0];
    }

    public static <T> T parseSingleEntry(T[] arr, int index) {
        return arr[index];
    }

}
