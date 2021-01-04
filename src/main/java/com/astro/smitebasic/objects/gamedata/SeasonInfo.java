package com.astro.smitebasic.objects.gamedata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SeasonInfo {

    @JsonProperty("complete")
    private Boolean isComplete;

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("league_description")
    private String leagueDescription;

    @JsonProperty("name")
    private String seasonName;

    @JsonProperty("ret_msg")
    private String ret_msg;

    @JsonProperty("round")
    private Integer round;

    @JsonProperty("season")
    private Integer season;

    public Boolean getComplete() {
        return isComplete;
    }

    public void setComplete(Boolean complete) {
        isComplete = complete;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLeagueDescription() {
        return leagueDescription;
    }

    public void setLeagueDescription(String leagueDescription) {
        this.leagueDescription = leagueDescription;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public void setSeasonName(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "SeasonInfo{" +
                "isComplete=" + isComplete +
                ", id=" + id +
                ", leagueDescription='" + leagueDescription + '\'' +
                ", seasonName='" + seasonName + '\'' +
                ", round=" + round +
                ", season=" + season +
                '}';
    }
}
