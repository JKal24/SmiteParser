package com.astro.smitebasic.objects.player.matches;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GameModeData {

    @JsonProperty("Leaves")
    private String leaves;

    @JsonProperty("Losses")
    private String losses;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Points")
    private String points;

    @JsonProperty("PrevRank")
    private String prevRank;

    @JsonProperty("Rank")
    private String rank;

    @JsonProperty("Rank_Stat")
    private String rankStat;

    @JsonProperty("Rank_Variance")
    private String rankVariance;

    @JsonProperty("Season")
    private String season;

    @JsonProperty("Tier")
    private String tier;

    @JsonProperty("Trend")
    private String trend;

    @JsonProperty("Wins")
    private String wins;

    @JsonProperty("player_id")
    private String playerID;

    @JsonProperty("ret_msg")
    private String ret_msg;

    public String getLeaves() {
        return leaves;
    }

    public void setLeaves(String leaves) {
        this.leaves = leaves;
    }

    public String getLosses() {
        return losses;
    }

    public void setLosses(String losses) {
        this.losses = losses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    public String getPrevRank() {
        return prevRank;
    }

    public void setPrevRank(String prevRank) {
        this.prevRank = prevRank;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getRankStat() {
        return rankStat;
    }

    public void setRankStat(String rankStat) {
        this.rankStat = rankStat;
    }

    public String getRankVariance() {
        return rankVariance;
    }

    public void setRankVariance(String rankVariance) {
        this.rankVariance = rankVariance;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    public String getTrend() {
        return trend;
    }

    public void setTrend(String trend) {
        this.trend = trend;
    }

    public String getWins() {
        return wins;
    }

    public void setWins(String wins) {
        this.wins = wins;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    @Override
    public String toString() {
        return "GameModeData{" +
                "leaves='" + leaves + '\'' +
                ", losses='" + losses + '\'' +
                ", name='" + name + '\'' +
                ", points='" + points + '\'' +
                ", prevRank='" + prevRank + '\'' +
                ", rank='" + rank + '\'' +
                ", rankStat='" + rankStat + '\'' +
                ", rankVariance='" + rankVariance + '\'' +
                ", season='" + season + '\'' +
                ", tier='" + tier + '\'' +
                ", trend='" + trend + '\'' +
                ", wins='" + wins + '\'' +
                ", playerID='" + playerID + '\'' +
                ", ret_msg='" + ret_msg + '\'' +
                '}';
    }
}
