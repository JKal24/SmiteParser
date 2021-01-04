package com.astro.smitebasic.objects.gamedata.matches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MatchInfo {

    @JsonProperty("Active_Flag")
    private Boolean isGameActive;

    @JsonProperty("Match")
    private Integer matchID;

    @JsonProperty("ret_msg")
    private String ret_msg;

    public Boolean getIsGameActive() {
        return isGameActive;
    }

    public void setIsGameActive(String isGameActive) {
        this.isGameActive = isGameActive.equals("y");
    }

    public Integer getMatchID() {
        return matchID;
    }

    public void setMatchID(Integer matchID) {
        this.matchID = matchID;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    @Override
    public String toString() {
        return "MatchInfo{" +
                "isGameActive='" + isGameActive + '\'' +
                ", matchID=" + matchID +
                '}';
    }
}
