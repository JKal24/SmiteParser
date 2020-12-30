package com.astro.smitebasic.objects.gamedata;

import com.astro.smitebasic.api.Config;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ServerInfo {

    @JsonProperty("entry_datetime")
    private String entry_datetime;

    @JsonProperty("environment")
    private String environment;

    @JsonProperty("limited_access")
    private String limited_access;

    @JsonProperty("platform")
    private String platform;

    @JsonProperty("ret_msg")
    private String ret_msg;

    @JsonProperty("status")
    private String status;

    @JsonProperty("version")
    private String version;

    private String date = Config.makeRecordTimeStamp();

    public ServerInfo() { }

    public ServerInfo(String entry_datetime, String environment, String limited_access, String platform, String ret_msg, String status, String version) {
        this.entry_datetime = entry_datetime;
        this.environment = environment;
        this.limited_access = limited_access;
        this.platform = platform;
        this.ret_msg = ret_msg;
        this.status = status;
        this.version = version;
    }

    public String getEntry_datetime() {
        return entry_datetime;
    }

    public void setEntry_datetime(String entry_datetime) {
        this.entry_datetime = entry_datetime;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getLimited_access() {
        return limited_access;
    }

    public void setLimited_access(String limited_access) {
        this.limited_access = limited_access;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "ServerInfo{" +
                "entry_datetime='" + entry_datetime + '\'' +
                ", environment='" + environment + '\'' +
                ", limited_access='" + limited_access + '\'' +
                ", platform='" + platform + '\'' +
                ", ret_msg='" + ret_msg + '\'' +
                ", status='" + status + '\'' +
                ", version='" + version + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
