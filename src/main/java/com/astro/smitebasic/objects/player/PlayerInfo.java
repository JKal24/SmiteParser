package com.astro.smitebasic.objects.player;

import com.astro.smitebasic.objects.player.ranked.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "player_info")
public class PlayerInfo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @JsonProperty("ActivePlayerId")
    private String ActivePlayerId;

    @JsonProperty("Created_Datetime")
    private String Created_Datetime;

    @JsonProperty("HoursPlayed")
    private String HoursPlayed;

    @JsonProperty("Last_Login_Datetime")
    private String Last_Login_Datetime;

    @JsonProperty("Leaves")
    private String Leaves;

    @JsonProperty("Level")
    @Column(name = "player_level")
    private String Level;

    @JsonProperty("Losses")
    private String Losses;

    @JsonProperty("MasteryLevel")
    private String MasteryLevel;

    @JsonProperty("MergedPlayers")
    private String MergedPlayers;

    @JsonProperty("MinutesPlayed")
    private String MinutesPlayed;

    @JsonProperty("Name")
    private String Name;

    @JsonProperty("Personal_Status_Message")
    private String Personal_Status_Message;

    @JsonProperty("Platform")
    private String Platform;

    @JsonProperty("Rank_Stat_Conquest")
    private String Rank_Stat_Conquest;

    @JsonProperty("Rank_Stat_Conquest_Controller")
    private String Rank_Stat_Conquest_Controller;

    @JsonProperty("Rank_Stat_Duel")
    private String Rank_Stat_Duel;

    @JsonProperty("Rank_Stat_duel_Controller")
    private String Rank_Stat_duel_Controller;

    @JsonProperty("Rank_Stat_Joust")
    private String Rank_Stat_Joust;

    @JsonProperty("Rank_Stat_Joust_Controller")
    private String Rank_Stat_Joust_Controller;

    @JsonProperty("RankedConquest")
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "info", cascade=CascadeType.ALL)
    private ConquestData RankedConquest;

    @JsonProperty("RankedConquestController")
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "info", cascade=CascadeType.ALL)
    private ConquestControllerData RankedConquestController;

    @JsonProperty("RankedDuel")
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "info", cascade=CascadeType.ALL)
    private DuelData RankedDuel;

    @JsonProperty("RankedDuelController")
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "info", cascade=CascadeType.ALL)
    private DuelControllerData RankedDuelController;

    @JsonProperty("RankedJoust")
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "info", cascade=CascadeType.ALL)
    private JoustData RankedJoust;

    @JsonProperty("RankedJoustController")
    @OneToOne(fetch = FetchType.LAZY, mappedBy = "info", cascade=CascadeType.ALL)
    private JoustControllerData RankedJoustController;

    @JsonProperty("Region")
    private String Region;

    @JsonProperty("TeamId")
    private String TeamId;

    @JsonProperty("Team_Name")
    private String Team_Name;

    @JsonProperty("Tier_Conquest")
    private String Tier_Conquest;

    @JsonProperty("Tier_Duel")
    private String Tier_Duel;

    @JsonProperty("Tier_Joust")
    private String Tier_Joust;

    @JsonProperty("Total_Achievements")
    private String Total_Achievements;

    @JsonProperty("Total_Worshippers")
    private String Total_Worshippers;

    @JsonProperty("Wins")
    private String Wins;

    @JsonProperty("hz_gamer_tag")
    private String hz_gamer_tag;

    @JsonProperty("hz_player_name")
    private String hz_player_name;

    @JsonProperty("ret_msg")
    private String ret_msg;

    public PlayerInfo() { }

    public PlayerInfo(Integer id, String activePlayerId, String created_Datetime, String hoursPlayed, String last_Login_Datetime,
                      String leaves, String level, String losses, String masteryLevel, String mergedPlayers, String minutesPlayed,
                      String name, String personal_Status_Message, String platform, String rank_Stat_Conquest,
                      String rank_Stat_Conquest_Controller, String rank_Stat_Duel, String rank_Stat_duel_Controller, String rank_Stat_Joust,
                      String rank_Stat_Joust_Controller, ConquestData rankedConquest, ConquestControllerData rankedConquestController,
                      DuelData rankedDuel, DuelControllerData rankedDuelController, JoustData rankedJoust, JoustControllerData rankedJoustController,
                      String region, String teamId, String team_Name, String tier_Conquest, String tier_Duel, String tier_Joust,
                      String total_Achievements, String total_Worshippers, String wins, String hz_gamer_tag, String hz_player_name, String ret_msg) {
        this.id = id;
        ActivePlayerId = activePlayerId;
        Created_Datetime = created_Datetime;
        HoursPlayed = hoursPlayed;
        Last_Login_Datetime = last_Login_Datetime;
        Leaves = leaves;
        Level = level;
        Losses = losses;
        MasteryLevel = masteryLevel;
        MergedPlayers = mergedPlayers;
        MinutesPlayed = minutesPlayed;
        Name = name;
        Personal_Status_Message = personal_Status_Message;
        Platform = platform;
        Rank_Stat_Conquest = rank_Stat_Conquest;
        Rank_Stat_Conquest_Controller = rank_Stat_Conquest_Controller;
        Rank_Stat_Duel = rank_Stat_Duel;
        Rank_Stat_duel_Controller = rank_Stat_duel_Controller;
        Rank_Stat_Joust = rank_Stat_Joust;
        Rank_Stat_Joust_Controller = rank_Stat_Joust_Controller;
        RankedConquest = rankedConquest;
        RankedConquestController = rankedConquestController;
        RankedDuel = rankedDuel;
        RankedDuelController = rankedDuelController;
        RankedJoust = rankedJoust;
        RankedJoustController = rankedJoustController;
        Region = region;
        TeamId = teamId;
        Team_Name = team_Name;
        Tier_Conquest = tier_Conquest;
        Tier_Duel = tier_Duel;
        Tier_Joust = tier_Joust;
        Total_Achievements = total_Achievements;
        Total_Worshippers = total_Worshippers;
        Wins = wins;
        this.hz_gamer_tag = hz_gamer_tag;
        this.hz_player_name = hz_player_name;
        this.ret_msg = ret_msg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActivePlayerId() {
        return ActivePlayerId;
    }

    public void setActivePlayerId(String activePlayerId) {
        ActivePlayerId = activePlayerId;
    }

    public String getCreated_Datetime() {
        return Created_Datetime;
    }

    public void setCreated_Datetime(String created_Datetime) {
        Created_Datetime = created_Datetime;
    }

    public String getHoursPlayed() {
        return HoursPlayed;
    }

    public void setHoursPlayed(String hoursPlayed) {
        HoursPlayed = hoursPlayed;
    }

    public String getLast_Login_Datetime() {
        return Last_Login_Datetime;
    }

    public void setLast_Login_Datetime(String last_Login_Datetime) {
        Last_Login_Datetime = last_Login_Datetime;
    }

    public String getLeaves() {
        return Leaves;
    }

    public void setLeaves(String leaves) {
        Leaves = leaves;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public String getLosses() {
        return Losses;
    }

    public void setLosses(String losses) {
        Losses = losses;
    }

    public String getMasteryLevel() {
        return MasteryLevel;
    }

    public void setMasteryLevel(String masteryLevel) {
        MasteryLevel = masteryLevel;
    }

    public String getMergedPlayers() {
        return MergedPlayers;
    }

    public void setMergedPlayers(String mergedPlayers) {
        MergedPlayers = mergedPlayers;
    }

    public String getMinutesPlayed() {
        return MinutesPlayed;
    }

    public void setMinutesPlayed(String minutesPlayed) {
        MinutesPlayed = minutesPlayed;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPersonal_Status_Message() {
        return Personal_Status_Message;
    }

    public void setPersonal_Status_Message(String personal_Status_Message) {
        Personal_Status_Message = personal_Status_Message;
    }

    public String getPlatform() {
        return Platform;
    }

    public void setPlatform(String platform) {
        Platform = platform;
    }

    public String getRank_Stat_Conquest() {
        return Rank_Stat_Conquest;
    }

    public void setRank_Stat_Conquest(String rank_Stat_Conquest) {
        Rank_Stat_Conquest = rank_Stat_Conquest;
    }

    public String getRank_Stat_Conquest_Controller() {
        return Rank_Stat_Conquest_Controller;
    }

    public void setRank_Stat_Conquest_Controller(String rank_Stat_Conquest_Controller) {
        Rank_Stat_Conquest_Controller = rank_Stat_Conquest_Controller;
    }

    public String getRank_Stat_Duel() {
        return Rank_Stat_Duel;
    }

    public void setRank_Stat_Duel(String rank_Stat_Duel) {
        Rank_Stat_Duel = rank_Stat_Duel;
    }

    public String getRank_Stat_duel_Controller() {
        return Rank_Stat_duel_Controller;
    }

    public void setRank_Stat_duel_Controller(String rank_Stat_duel_Controller) {
        Rank_Stat_duel_Controller = rank_Stat_duel_Controller;
    }

    public String getRank_Stat_Joust() {
        return Rank_Stat_Joust;
    }

    public void setRank_Stat_Joust(String rank_Stat_Joust) {
        Rank_Stat_Joust = rank_Stat_Joust;
    }

    public String getRank_Stat_Joust_Controller() {
        return Rank_Stat_Joust_Controller;
    }

    public void setRank_Stat_Joust_Controller(String rank_Stat_Joust_Controller) {
        Rank_Stat_Joust_Controller = rank_Stat_Joust_Controller;
    }

    public ConquestData getRankedConquest() {
        return RankedConquest;
    }

    public void setRankedConquest(ConquestData rankedConquest) {
        RankedConquest = rankedConquest;
    }

    public ConquestControllerData getRankedConquestController() {
        return RankedConquestController;
    }

    public void setRankedConquestController(ConquestControllerData rankedConquestController) {
        RankedConquestController = rankedConquestController;
    }

    public DuelData getRankedDuel() {
        return RankedDuel;
    }

    public void setRankedDuel(DuelData rankedDuel) {
        RankedDuel = rankedDuel;
    }

    public DuelControllerData getRankedDuelController() {
        return RankedDuelController;
    }

    public void setRankedDuelController(DuelControllerData rankedDuelController) {
        RankedDuelController = rankedDuelController;
    }

    public JoustData getRankedJoust() {
        return RankedJoust;
    }

    public void setRankedJoust(JoustData rankedJoust) {
        RankedJoust = rankedJoust;
    }

    public JoustControllerData getRankedJoustController() {
        return RankedJoustController;
    }

    public void setRankedJoustController(JoustControllerData rankedJoustController) {
        RankedJoustController = rankedJoustController;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public String getTeamId() {
        return TeamId;
    }

    public void setTeamId(String teamId) {
        TeamId = teamId;
    }

    public String getTeam_Name() {
        return Team_Name;
    }

    public void setTeam_Name(String team_Name) {
        Team_Name = team_Name;
    }

    public String getTier_Conquest() {
        return Tier_Conquest;
    }

    public void setTier_Conquest(String tier_Conquest) {
        Tier_Conquest = tier_Conquest;
    }

    public String getTier_Duel() {
        return Tier_Duel;
    }

    public void setTier_Duel(String tier_Duel) {
        Tier_Duel = tier_Duel;
    }

    public String getTier_Joust() {
        return Tier_Joust;
    }

    public void setTier_Joust(String tier_Joust) {
        Tier_Joust = tier_Joust;
    }

    public String getTotal_Achievements() {
        return Total_Achievements;
    }

    public void setTotal_Achievements(String total_Achievements) {
        Total_Achievements = total_Achievements;
    }

    public String getTotal_Worshippers() {
        return Total_Worshippers;
    }

    public void setTotal_Worshippers(String total_Worshippers) {
        Total_Worshippers = total_Worshippers;
    }

    public String getWins() {
        return Wins;
    }

    public void setWins(String wins) {
        Wins = wins;
    }

    public String getHz_gamer_tag() {
        return hz_gamer_tag;
    }

    public void setHz_gamer_tag(String hz_gamer_tag) {
        this.hz_gamer_tag = hz_gamer_tag;
    }

    public String getHz_player_name() {
        return hz_player_name;
    }

    public void setHz_player_name(String hz_player_name) {
        this.hz_player_name = hz_player_name;
    }

    public String getRet_msg() { return ret_msg; }

    public void setRet_msg(String ret_msg) { this.ret_msg = ret_msg; }

    @Override
    public String toString() {
        return "PlayerInfo{" +
                " ActivePlayerId='" + ActivePlayerId + '\'' +
                ", Created_Datetime='" + Created_Datetime + '\'' +
                ", HoursPlayed='" + HoursPlayed + '\'' +
                ", Last_Login_Datetime='" + Last_Login_Datetime + '\'' +
                ", Leaves='" + Leaves + '\'' +
                ", Level='" + Level + '\'' +
                ", Losses='" + Losses + '\'' +
                ", MasteryLevel='" + MasteryLevel + '\'' +
                ", MergedPlayers='" + MergedPlayers + '\'' +
                ", MinutesPlayed='" + MinutesPlayed + '\'' +
                ", Name='" + Name + '\'' +
                ", Personal_Status_Message='" + Personal_Status_Message + '\'' +
                ", Platform='" + Platform + '\'' +
                ", Rank_Stat_Conquest='" + Rank_Stat_Conquest + '\'' +
                ", Rank_Stat_Conquest_Controller='" + Rank_Stat_Conquest_Controller + '\'' +
                ", Rank_Stat_Duel='" + Rank_Stat_Duel + '\'' +
                ", Rank_Stat_duel_Controller='" + Rank_Stat_duel_Controller + '\'' +
                ", Rank_Stat_Joust='" + Rank_Stat_Joust + '\'' +
                ", Rank_Stat_Joust_Controller='" + Rank_Stat_Joust_Controller + '\'' +
                ", RankedConquest=" + RankedConquest +
                ", RankedConquestController=" + RankedConquestController +
                ", RankedDuel=" + RankedDuel +
                ", RankedDuelController=" + RankedDuelController +
                ", RankedJoust=" + RankedJoust +
                ", RankedJoustController=" + RankedJoustController +
                ", Region='" + Region + '\'' +
                ", TeamId='" + TeamId + '\'' +
                ", Team_Name='" + Team_Name + '\'' +
                ", Tier_Conquest='" + Tier_Conquest + '\'' +
                ", Tier_Duel='" + Tier_Duel + '\'' +
                ", Tier_Joust='" + Tier_Joust + '\'' +
                ", Total_Achievements='" + Total_Achievements + '\'' +
                ", Total_Worshippers='" + Total_Worshippers + '\'' +
                ", Wins='" + Wins + '\'' +
                ", hz_gamer_tag='" + hz_gamer_tag + '\'' +
                ", hz_player_name='" + hz_player_name + '\'' +
                ", ret_msg='" + ret_msg + '\'' +
                '}';
    }
}
