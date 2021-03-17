package com.astro.smitebasic.objects.gamedata;

import com.astro.smitebasic.api.Utils;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PatchInfo {

    @JsonProperty("ret_msg")
    private String ret_msg;

    @JsonProperty("version_string")
    private Double version;

    private String date = Utils.makeRecordTimeStamp();

    public PatchInfo() { }

    public PatchInfo(String ret_msg, Double version) {
        this.ret_msg = ret_msg;
        this.version = version;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public Double getVersion() {
        return version;
    }

    public void setVersion(Double version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "PatchInfo{" +
                "ret_msg='" + ret_msg + '\'' +
                ", version_string='" + version + '\'' +
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
        LocalDate objDate = Utils.subtractDays(objMoment[2], objMoment[1], objMoment[0], 0);

        String[] currentMoment = this.date.split(" ")[0].split("/");
        LocalDate currentDate = Utils.subtractDays(currentMoment[2], currentMoment[1], currentMoment[0], 7);
        return currentDate.isBefore(objDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRet_msg(), getVersion(), date);
    }
}
