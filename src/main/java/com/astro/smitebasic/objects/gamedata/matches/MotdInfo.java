package com.astro.smitebasic.objects.gamedata.matches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MotdInfo {

    @JsonProperty("description")
    private String description;

    @JsonProperty("gameMode")
    private String modeType;

    @JsonProperty("maxPlayers")
    private Integer maxPlayers;

    @JsonProperty("name")
    private String matchName;

    @JsonProperty("ret_msg")
    private String ret_msg;

    @JsonProperty("startDateTime")
    private String startDatetime;

    @JsonProperty("team1GodsCSV")
    private String team1GodsCSV;

    @JsonProperty("team2GodsCSV")
    private String team2GodsCSV;

    @JsonProperty("title")
    private String title;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getModeType() {
        return modeType;
    }

    public void setModeType(String modeType) {
        this.modeType = modeType;
    }

    public Integer getMaxPlayers() {
        return maxPlayers;
    }

    public void setMaxPlayers(Integer maxPlayers) {
        this.maxPlayers = maxPlayers;
    }

    public String getMatchName() {
        return matchName;
    }

    public void setMatchName(String matchName) {
        this.matchName = matchName;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public String getStartDatetime() {
        return startDatetime;
    }

    public void setStartDatetime(String startDatetime) {
        this.startDatetime = startDatetime;
    }

    public String getTeam1GodsCSV() {
        return team1GodsCSV;
    }

    public void setTeam1GodsCSV(String team1GodsCSV) {
        this.team1GodsCSV = team1GodsCSV;
    }

    public String getTeam2GodsCSV() {
        return team2GodsCSV;
    }

    public void setTeam2GodsCSV(String team2GodsCSV) {
        this.team2GodsCSV = team2GodsCSV;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "MotdInfo{" +
                "description='" + description + '\'' +
                ", modeType='" + modeType + '\'' +
                ", maxPlayers=" + maxPlayers +
                ", matchName='" + matchName + '\'' +
                ", startDatetime='" + startDatetime + '\'' +
                ", team1GodsCSV='" + team1GodsCSV + '\'' +
                ", team2GodsCSV='" + team2GodsCSV + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
