package com.astro.smitebasic.objects.player;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerStatistics {

    @JsonProperty("Assists")
    private Integer assists;

    @JsonProperty("Deaths")
    private Integer deaths;

    @JsonProperty("Kills")
    private Integer kills;

    @JsonProperty("Losses")
    private Integer losses;

    @JsonProperty("MinionKills")
    private Integer minionKills;

    @JsonProperty("Rank")
    private Integer rank;

    @JsonProperty("Wins")
    private Integer wins;

    @JsonProperty("Worshippers")
    private Integer worshippers;

    @JsonProperty("god")
    private String name;

    @JsonProperty("god_id")
    private Integer godID;

    @JsonProperty("ret_msg")
    private String ret_msg;

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getMinionKills() {
        return minionKills;
    }

    public void setMinionKills(Integer minionKills) {
        this.minionKills = minionKills;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getWorshippers() {
        return worshippers;
    }

    public void setWorshippers(Integer worshippers) {
        this.worshippers = worshippers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGodID() {
        return godID;
    }

    public void setGodID(Integer godID) {
        this.godID = godID;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }
}
