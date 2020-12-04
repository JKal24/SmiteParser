package com.astro.smitebasic.db.player;

import com.astro.smitebasic.db.player.ranked.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "player_info")
public class PlayerInfo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String ActivePlayerId;
    private String Created_Datetime;
    private Integer HoursPlayed;
    private String Last_Login_Datetime;
    private Integer Leaves;

    @Column(name = "player_level")
    private Integer Level;
    private Integer Losses;
    private Integer MasteryLevel;
    private String MergedPlayers;
    private Integer MinutesPlayed;
    private String Name;
    private String Personal_Status_Message;
    private String Platform;
    private Integer Rank_Stat_Conquest;
    private Integer Rank_Stat_Conquest_Controller;
    private Integer Rank_Stat_Duel;
    private Integer Rank_Stat_duel_Controller;
    private Integer Rank_Stat_Joust;
    private Integer Rank_Stat_Joust_Controller;
    private ConquestData RankedConquest;
    private ConquestControllerData RankedConquestController;
    private DuelData RankedDuel;
    private DuelControllerData RankedDuelController;
    private JoustData RankedJoust;
    private JoustControllerData RankedJoustController;
    private String Region;
    private Integer TeamId;
    private String Team_Name;
    private Integer Tier_Conquest;
    private Integer Tier_Duel;
    private Integer Tier_Joust;
    private Integer Total_Achievements;
    private Integer Total_Worshippers;
    private Integer Wins;
    private String hz_gamer_tag;
    private String hz_player_name;
    private String ret_msg;

    public PlayerInfo() { }

    public PlayerInfo(Integer id, String activePlayerId, String created_Datetime, Integer hoursPlayed, String last_Login_Datetime,
                      Integer leaves, Integer level, Integer losses, Integer masteryLevel, String mergedPlayers, Integer minutesPlayed,
                      String name, String personal_Status_Message, String platform, Integer rank_Stat_Conquest, Integer rank_Stat_Conquest_Controller,
                      Integer rank_Stat_Duel, Integer rank_Stat_duel_Controller, Integer rank_Stat_Joust, Integer rank_Stat_Joust_Controller,
                      ConquestData rankedConquest, ConquestControllerData rankedConquestController, DuelData rankedDuel, DuelControllerData rankedDuelController,
                      JoustData rankedJoust, JoustControllerData rankedJoustController, String region, Integer teamId, String team_Name, Integer tier_Conquest,
                      Integer tier_Duel, Integer tier_Joust, Integer total_Achievements, Integer total_Worshippers, Integer wins, String hz_gamer_tag,
                      String hz_player_name, String ret_msg) {
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

    public Integer getHoursPlayed() {
        return HoursPlayed;
    }

    public void setHoursPlayed(Integer hoursPlayed) {
        HoursPlayed = hoursPlayed;
    }

    public String getLast_Login_Datetime() {
        return Last_Login_Datetime;
    }

    public void setLast_Login_Datetime(String last_Login_Datetime) {
        Last_Login_Datetime = last_Login_Datetime;
    }

    public Integer getLeaves() {
        return Leaves;
    }

    public void setLeaves(Integer leaves) {
        Leaves = leaves;
    }

    @Column(name = "Player_Level")
    public Integer getLevel() {
        return Level;
    }

    public void setLevel(Integer level) {
        Level = level;
    }

    public Integer getLosses() {
        return Losses;
    }

    public void setLosses(Integer losses) {
        Losses = losses;
    }

    public Integer getMasteryLevel() {
        return MasteryLevel;
    }

    public void setMasteryLevel(Integer masteryLevel) {
        MasteryLevel = masteryLevel;
    }

    public String getMergedPlayers() {
        return MergedPlayers;
    }

    public void setMergedPlayers(String mergedPlayers) {
        MergedPlayers = mergedPlayers;
    }

    public Integer getMinutesPlayed() {
        return MinutesPlayed;
    }

    public void setMinutesPlayed(Integer minutesPlayed) {
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

    public Integer getRank_Stat_Conquest() {
        return Rank_Stat_Conquest;
    }

    public void setRank_Stat_Conquest(Integer rank_Stat_Conquest) {
        Rank_Stat_Conquest = rank_Stat_Conquest;
    }

    public Integer getRank_Stat_Conquest_Controller() {
        return Rank_Stat_Conquest_Controller;
    }

    public void setRank_Stat_Conquest_Controller(Integer rank_Stat_Conquest_Controller) {
        Rank_Stat_Conquest_Controller = rank_Stat_Conquest_Controller;
    }

    public Integer getRank_Stat_Duel() {
        return Rank_Stat_Duel;
    }

    public void setRank_Stat_Duel(Integer rank_Stat_Duel) {
        Rank_Stat_Duel = rank_Stat_Duel;
    }

    public Integer getRank_Stat_duel_Controller() {
        return Rank_Stat_duel_Controller;
    }

    public void setRank_Stat_duel_Controller(Integer rank_Stat_duel_Controller) {
        Rank_Stat_duel_Controller = rank_Stat_duel_Controller;
    }

    public Integer getRank_Stat_Joust() {
        return Rank_Stat_Joust;
    }

    public void setRank_Stat_Joust(Integer rank_Stat_Joust) {
        Rank_Stat_Joust = rank_Stat_Joust;
    }

    public Integer getRank_Stat_Joust_Controller() {
        return Rank_Stat_Joust_Controller;
    }

    public void setRank_Stat_Joust_Controller(Integer rank_Stat_Joust_Controller) {
        Rank_Stat_Joust_Controller = rank_Stat_Joust_Controller;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String region) {
        Region = region;
    }

    public Integer getTeamId() {
        return TeamId;
    }

    public void setTeamId(Integer teamId) {
        TeamId = teamId;
    }

    public String getTeam_Name() {
        return Team_Name;
    }

    public void setTeam_Name(String team_Name) {
        Team_Name = team_Name;
    }

    public Integer getTier_Conquest() {
        return Tier_Conquest;
    }

    public void setTier_Conquest(Integer tier_Conquest) {
        Tier_Conquest = tier_Conquest;
    }

    public Integer getTier_Duel() {
        return Tier_Duel;
    }

    public void setTier_Duel(Integer tier_Duel) {
        Tier_Duel = tier_Duel;
    }

    public Integer getTier_Joust() {
        return Tier_Joust;
    }

    public void setTier_Joust(Integer tier_Joust) {
        Tier_Joust = tier_Joust;
    }

    public Integer getTotal_Achievements() {
        return Total_Achievements;
    }

    public void setTotal_Achievements(Integer total_Achievements) {
        Total_Achievements = total_Achievements;
    }

    public Integer getTotal_Worshippers() {
        return Total_Worshippers;
    }

    public void setTotal_Worshippers(Integer total_Worshippers) {
        Total_Worshippers = total_Worshippers;
    }

    public Integer getWins() {
        return Wins;
    }

    public void setWins(Integer wins) {
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

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
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

    @Override
    public String toString() {
        return "PlayerInfo{" +
                "id=" + id +
                ", ActivePlayerId='" + ActivePlayerId + '\'' +
                ", Created_Datetime='" + Created_Datetime + '\'' +
                ", HoursPlayed=" + HoursPlayed +
                ", Last_Login_Datetime='" + Last_Login_Datetime + '\'' +
                ", Leaves=" + Leaves +
                ", Level=" + Level +
                ", Losses=" + Losses +
                ", MasteryLevel=" + MasteryLevel +
                ", MergedPlayers='" + MergedPlayers + '\'' +
                ", MinutesPlayed=" + MinutesPlayed +
                ", Name='" + Name + '\'' +
                ", Personal_Status_Message='" + Personal_Status_Message + '\'' +
                ", Platform='" + Platform + '\'' +
                ", Rank_Stat_Conquest=" + Rank_Stat_Conquest +
                ", Rank_Stat_Conquest_Controller=" + Rank_Stat_Conquest_Controller +
                ", Rank_Stat_Duel=" + Rank_Stat_Duel +
                ", Rank_Stat_duel_Controller=" + Rank_Stat_duel_Controller +
                ", Rank_Stat_Joust=" + Rank_Stat_Joust +
                ", Rank_Stat_Joust_Controller=" + Rank_Stat_Joust_Controller +
                ", RankedConquest=" + RankedConquest +
                ", RankedConquestController=" + RankedConquestController +
                ", RankedDuel=" + RankedDuel +
                ", RankedDuelController=" + RankedDuelController +
                ", RankedJoust=" + RankedJoust +
                ", RankedJoustController=" + RankedJoustController +
                ", Region='" + Region + '\'' +
                ", TeamId=" + TeamId +
                ", Team_Name='" + Team_Name + '\'' +
                ", Tier_Conquest=" + Tier_Conquest +
                ", Tier_Duel=" + Tier_Duel +
                ", Tier_Joust=" + Tier_Joust +
                ", Total_Achievements=" + Total_Achievements +
                ", Total_Worshippers=" + Total_Worshippers +
                ", Wins=" + Wins +
                ", hz_gamer_tag='" + hz_gamer_tag + '\'' +
                ", hz_player_name='" + hz_player_name + '\'' +
                ", ret_msg='" + ret_msg + '\'' +
                '}';
    }
}
