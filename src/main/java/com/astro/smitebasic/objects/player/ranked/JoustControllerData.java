package com.astro.smitebasic.objects.player.ranked;

import com.astro.smitebasic.objects.player.PlayerInfo;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name = "player_info_joust_controller_data")
public class JoustControllerData implements GameModeData {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "joust_controller_id")
    private Integer id;

    @JsonProperty("Leaves")
    @Column(name = "joust_controller_leaves")
    private String Leaves;

    @JsonProperty("Losses")
    @Column(name = "joust_controller_losses")
    private String Losses;

    @JsonProperty("Name")
    @Column(name = "joust_controller_name")
    private String Name;

    @JsonProperty("Points")
    @Column(name = "joust_controller_points")
    private String Points;

    @JsonProperty("PrevRank")
    @Column(name = "joust_controller_prev_rank")
    private String PrevRank;

    @JsonProperty("Rank")
    @Column(name = "joust_controller_rank")
    private String Rank;

    @JsonProperty("Rank_Stat")
    @Column(name = "joust_controller_rank_stat")
    private String Rank_Stat;

    @JsonProperty("Rank_Variance")
    @Column(name = "joust_controller_rank_variance")
    private String Rank_Variance;

    @JsonProperty("Season")
    @Column(name = "joust_controller_season")
    private String Season;

    @JsonProperty("Tier")
    @Column(name = "joust_controller_tier")
    private String Tier;

    @JsonProperty("Trend")
    @Column(name = "joust_controller_trend")
    private String Trend;

    @JsonProperty("Wins")
    @Column(name = "joust_controller_wins")
    private String Wins;

    @JsonProperty("player_id")
    @Column(name = "joust_controller_player_id")
    private String player_id;

    @JsonProperty("ret_msg")
    @Column(name = "joust_controller_ret_msg")
    private String ret_msg;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "joust_controller_id")
    private PlayerInfo info;

    public JoustControllerData() { }

    public JoustControllerData(Integer id, String leaves, String losses, String name, String points, String prevRank,
                     String rank, String rank_Stat, String rank_Variance, String season, String tier,
                     String trend, String wins, String player_id, String ret_msg, PlayerInfo info) {
        this.id = id;
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
        this.info = info;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLeaves() {
        return Leaves;
    }

    public void setLeaves(String leaves) {
        Leaves = leaves;
    }

    public String getLosses() {
        return Losses;
    }

    public void setLosses(String losses) {
        Losses = losses;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPoints() {
        return Points;
    }

    public void setPoints(String points) {
        Points = points;
    }

    public String getPrevRank() {
        return PrevRank;
    }

    public void setPrevRank(String prevRank) {
        PrevRank = prevRank;
    }

    public String getRank() {
        return Rank;
    }

    public void setRank(String rank) {
        Rank = rank;
    }

    public String getRank_Stat() {
        return Rank_Stat;
    }

    public void setRank_Stat(String rank_Stat) {
        Rank_Stat = rank_Stat;
    }

    public String getRank_Variance() {
        return Rank_Variance;
    }

    public void setRank_Variance(String rank_Variance) {
        Rank_Variance = rank_Variance;
    }

    public String getSeason() {
        return Season;
    }

    public void setSeason(String season) {
        Season = season;
    }

    public String getTier() {
        return Tier;
    }

    public void setTier(String tier) {
        Tier = tier;
    }

    public String getTrend() {
        return Trend;
    }

    public void setTrend(String trend) {
        Trend = trend;
    }

    public String getWins() {
        return Wins;
    }

    public void setWins(String wins) {
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

    public PlayerInfo getInfo() { return info; }

    public void setInfo(PlayerInfo info) { this.info = info; }

    @Override
    public String toString() {
        return "JoustControllerData{" +
                " Leaves=" + Leaves +
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
                ", info=" + info +
                '}';
    }
}
