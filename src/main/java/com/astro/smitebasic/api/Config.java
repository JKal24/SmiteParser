package com.astro.smitebasic.api;

import org.springframework.stereotype.Component;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

@Component
public class Config {

    public String makeTimeStamp(String format) {
        Instant instant = Instant.now();
        DateTimeFormatter formatterUTC = DateTimeFormatter.ofPattern(format).withZone(ZoneId.of("UTC"));
        return formatterUTC.format(instant);
    }

    public String makeSignature(String request, String time, String devID, String authKey) throws NoSuchAlgorithmException {
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

    public String makeRequestUri(String... components) {
        return String.join("/", components);
    }

    public Boolean compareDate(String currentDate, String pastDate) {
        String[] currentDateArr = currentDate.split("/");
        String[] pastDateArr = pastDate.split("/");

        for (int parse = 0; parse < Math.min(currentDateArr.length, pastDateArr.length); parse++) {
            if (Integer.parseInt(currentDateArr[parse].replaceFirst("^0+(?!$)", "")) !=
                    Integer.parseInt(pastDateArr[parse].replaceFirst("^0+(?!$)", "")))
                return false;
        }
        return true;
    }

    public Boolean compareTime(String currentTime, String pastTime) {
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
            compareHours = compareHours == 12 ? 1 : compareHours + 1;
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

    public boolean verifySession(String currentDate, String currentTime, String pastDate, String pastTime) {
        if (compareDate(currentDate, pastDate)) {
            if (compareTime(currentTime, pastTime)) {
                return true;
            }
        }
        return false;
    }

    private String[] sliceTimeArr(String time) {
        return time.replaceAll(" ", ":").split(":");
    }

    private String customAMOrPM(String time) {
        return time.replaceAll(".", "").toUpperCase();
    }

    private Integer customTimeTrim(String timeElement) {
        return Integer.parseInt(timeElement.replaceFirst("^0+(?!$)", ""));
    }

}
