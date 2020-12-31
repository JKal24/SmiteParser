package com.astro.smitebasic.objects.gamedata;

import com.astro.smitebasic.api.Config;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.tomcat.jni.Local;

import java.time.LocalDate;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PatchInfo {

    @JsonProperty("ret_msg")
    private String ret_msg;

    @JsonProperty("version_string")
    private String version_string;

    private String date = Config.makeRecordTimeStamp();

    public PatchInfo() { }

    public PatchInfo(String ret_msg, String version_string) {
        this.ret_msg = ret_msg;
        this.version_string = version_string;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public String getVersion_string() {
        return version_string;
    }

    public void setVersion_string(String version_string) {
        this.version_string = version_string;
    }

    @Override
    public String toString() {
        return "PatchInfo{" +
                "ret_msg='" + ret_msg + '\'' +
                ", version_string='" + version_string + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PatchInfo)) return false;
        PatchInfo patchInfo = (PatchInfo) o;
        // Gets the year, month and day format that the API provides
        String[] objMoment = patchInfo.date.split(" ")[0].split("/");
        LocalDate objDate = Config.subtractDays(objMoment[2], objMoment[1], objMoment[0], 0);

        String[] currentMoment = this.date.split(" ")[0].split("/");
        LocalDate currentDate = Config.subtractDays(currentMoment[2], currentMoment[1], currentMoment[0], 7);
        return currentDate.isBefore(objDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRet_msg(), getVersion_string(), date);
    }
}
