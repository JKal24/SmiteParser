package com.astro.smitebasic.objects.gamedata.matches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LeaderboardRanking {

    @JsonProperty("Leaves")
    private Integer leaves;

    @JsonProperty("Losses")
    private Integer losses;

    @JsonProperty("Name")
    private String playerName;

    @JsonProperty("player_id")
    private Integer playerID;

    @JsonProperty("Points")
    private Integer points;

    @JsonProperty("PrevRank")
    private Integer prevRank;

    @JsonProperty("Rank")
    private Integer rank;

    @JsonProperty("Rank_Stat")
    private Float rankStat;

    @JsonProperty("Rank_Variance")
    private Float rankVariance;

    @JsonProperty("ret_msg")
    private String ret_msg;

    @JsonProperty("Season")
    private Integer season;

    @JsonProperty("Tier")
    private Integer tier;

    @JsonProperty("Trend")
    private Integer trend;

    @JsonProperty("Wins")
    private Integer wins;

    public Integer getLeaves() {
        return leaves;
    }

    public void setLeaves(Integer leaves) {
        this.leaves = leaves;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Integer playerID) {
        this.playerID = playerID;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getPrevRank() {
        return prevRank;
    }

    public void setPrevRank(Integer prevRank) {
        this.prevRank = prevRank;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Float getRankStat() {
        return rankStat;
    }

    public void setRankStat(Float rankStat) {
        this.rankStat = rankStat;
    }

    public Float getRankVariance() {
        return rankVariance;
    }

    public void setRankVariance(Float rankVariance) {
        this.rankVariance = rankVariance;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public Integer getSeason() {
        return season;
    }

    public void setSeason(Integer season) {
        this.season = season;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public Integer getTrend() {
        return trend;
    }

    public void setTrend(Integer trend) {
        this.trend = trend;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    @Override
    public String toString() {
        return "LeaderboardRanking{" +
                "leaves=" + leaves +
                ", losses=" + losses +
                ", playerName='" + playerName + '\'' +
                ", playerID=" + playerID +
                ", points=" + points +
                ", prevRank=" + prevRank +
                ", rank=" + rank +
                ", rankStat=" + rankStat +
                ", rankVariance=" + rankVariance +
                ", season=" + season +
                ", tier=" + tier +
                ", trend=" + trend +
                ", wins=" + wins +
                '}';
    }
}
