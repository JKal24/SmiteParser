package com.astro.smitebasic.db.player;

import java.io.Serializable;

public class GameModeData implements Serializable {
    private Integer Leaves;
    private Integer Losses;
    private String Name;
    private Integer Points;
    private Integer PrevRank;
    private Integer Rank;
    private Integer Rank_Stat;
    private Integer Rank_Variance;
    private Integer Season;
    private Integer Tier;
    private Integer Trend;
    private Integer Wins;
    private String player_id;
    private String ret_msg;

    public GameModeData() { }

    public GameModeData(Integer leaves, Integer losses, String name, Integer points, Integer prevRank, Integer rank, Integer rank_Stat,
                        Integer rank_Variance, Integer season, Integer tier, Integer trend, Integer wins, String player_id, String ret_msg)
    {
        Leaves = leaves;
        Losses = losses;
        Name = name;
        Points = points;
        PrevRank = prevRank;
        Rank = rank;
        Rank_Stat = rank_Stat;
        Rank_Variance = rank_Variance;
        Season = season;
        Tier = tier;
        Trend = trend;
        Wins = wins;
        this.player_id = player_id;
        this.ret_msg = ret_msg;
    }

    public Integer getLeaves() {
        return Leaves;
    }

    public void setLeaves(Integer leaves) {
        Leaves = leaves;
    }

    public Integer getLosses() {
        return Losses;
    }

    public void setLosses(Integer losses) {
        Losses = losses;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Integer getPoints() {
        return Points;
    }

    public void setPoints(Integer points) {
        Points = points;
    }

    public Integer getPrevRank() {
        return PrevRank;
    }

    public void setPrevRank(Integer prevRank) {
        PrevRank = prevRank;
    }

    public Integer getRank() {
        return Rank;
    }

    public void setRank(Integer rank) {
        Rank = rank;
    }

    public Integer getRank_Stat() {
        return Rank_Stat;
    }

    public void setRank_Stat(Integer rank_Stat) {
        Rank_Stat = rank_Stat;
    }

    public Integer getRank_Variance() {
        return Rank_Variance;
    }

    public void setRank_Variance(Integer rank_Variance) {
        Rank_Variance = rank_Variance;
    }

    public Integer getSeason() {
        return Season;
    }

    public void setSeason(Integer season) {
        Season = season;
    }

    public Integer getTier() {
        return Tier;
    }

    public void setTier(Integer tier) {
        Tier = tier;
    }

    public Integer getTrend() {
        return Trend;
    }

    public void setTrend(Integer trend) {
        Trend = trend;
    }

    public Integer getWins() {
        return Wins;
    }

    public void setWins(Integer wins) {
        Wins = wins;
    }

    public String getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(String player_id) {
        this.player_id = player_id;
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
                "Leaves=" + Leaves +
                ", Losses=" + Losses +
                ", Name='" + Name + '\'' +
                ", Points=" + Points +
                ", PrevRank=" + PrevRank +
                ", Rank=" + Rank +
                ", Rank_Stat=" + Rank_Stat +
                ", Rank_Variance=" + Rank_Variance +
                ", Season=" + Season +
                ", Tier=" + Tier +
                ", Trend=" + Trend +
                ", Wins=" + Wins +
                ", player_id='" + player_id + '\'' +
                ", ret_msg='" + ret_msg + '\'' +
                '}';
    }
}
