package com.astro.smitebasic.objects.gamedata;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClanInfo {

    @JsonProperty("Founder")
    private String clanLeader;

    @JsonProperty("FounderId")
    private String founderID;

    @JsonProperty("Losses")
    private Integer losses;

    @JsonProperty("Name")
    private String clanName;

    @JsonProperty("Players")
    private Integer players;

    @JsonProperty("Rating")
    private Integer rating;

    @JsonProperty("Tag")
    private String clanTag;

    @JsonProperty("TeamId")
    private Integer teamID;

    @JsonProperty("Wins")
    private Integer wins;

    @JsonProperty("ret_msg")
    private String ret_msg;

    public String getClanLeader() {
        return clanLeader;
    }

    public void setClanLeader(String clanLeader) {
        this.clanLeader = clanLeader;
    }

    public String getClanName() {
        return clanName;
    }

    public void setClanName(String clanName) {
        this.clanName = clanName;
    }

    public Integer getPlayers() {
        return players;
    }

    public void setPlayers(Integer players) {
        this.players = players;
    }

    public String getClanTag() {
        return clanTag;
    }

    public void setClanTag(String clanTag) {
        this.clanTag = clanTag;
    }

    public Integer getTeamID() {
        return teamID;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    @Override
    public String toString() {
        return "ClanInfo{" +
                "clanLeader='" + clanLeader + '\'' +
                ", clanName='" + clanName + '\'' +
                ", players=" + players +
                ", clanTag='" + clanTag + '\'' +
                ", teamID=" + teamID +
                '}';
    }
}
