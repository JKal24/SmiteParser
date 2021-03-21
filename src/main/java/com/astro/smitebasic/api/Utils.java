package com.astro.smitebasic.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Value;

import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Utils {

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
            return compareTime(currentTimeStamp[1], pastTime, 15);
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
        int currentMonth = getDateAttribute(currentDateArr[0]);
        int currentDay = getDateAttribute(currentDateArr[1]);
        int currentYear = getDateAttribute(currentDateArr[2]);

        String[] pastDateArr = pastDate.split("/");
        int pastMonth = getDateAttribute(pastDateArr[0]);
        int pastDay = getDateAttribute(pastDateArr[1]);
        int pastYear = getDateAttribute(pastDateArr[2]);

        return pastMonth == currentMonth && pastYear == currentYear && (pastDay + daysBetween) == currentDay;
    }

    private static int getDateAttribute(String val) {
        return Integer.parseInt(val.replaceFirst("^0+(?!$)", ""));
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

    public static <T> T[] appendArray(T[] arr1, T[] arr2) {
        int arr1Len = arr1.length;
        int arr2Len = arr2.length;

        @SuppressWarnings("unchecked")
        T[] newArr = (T[]) Array.newInstance(arr1.getClass().getComponentType(), arr1Len + arr2Len);
        System.arraycopy(arr1, 0, newArr, 0, arr1Len);
        System.arraycopy(arr2, 0, newArr, arr1Len, arr2Len);

        return newArr;
    }

    public static <T> T parseSingleEntry(T[] arr) {
        return arr[0];
    }

    public static <T> T parseSingleEntry(T[] arr, int index) {
        return arr[index];
    }

}
