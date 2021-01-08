package com.astro.smitebasic.objects.player;

import com.astro.smitebasic.objects.player.matches.GameModeData;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "player_info")
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerInfo {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @JsonProperty("ActivePlayerId")
    private Integer ActivePlayerId;

    @JsonProperty("Created_Datetime")
    private String Created_Datetime;

    @JsonProperty("HoursPlayed")
    private Integer hoursPlayed;

    @JsonProperty("Id")
    private Integer playerID;

    @JsonProperty("Last_Login_Datetime")
    private String lastLoginDatetime;

    @JsonProperty("Leaves")
    private Integer leaves;

    @JsonProperty("Level")
    private Integer Level;

    @JsonProperty("Losses")
    private Integer Losses;

    @JsonProperty("MasteryLevel")
    private Integer MasteryLevel;

    @JsonProperty("MergedPlayers")
    private String mergedPlayers;

    @JsonProperty("MinutesPlayed")
    private Integer minutesPlayed;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Personal_Status_Message")
    private String personalStatusMessage;

    @JsonProperty("Platform")
    private String platform;

    @JsonProperty("Rank_Stat_Conquest")
    private String rankStatConquest;

    @JsonProperty("Rank_Stat_Conquest_Controller")
    private String rankStatRank_Stat_Conquest_ControllerGameController;

    @JsonProperty("Rank_Stat_Duel")
    private String rankStatDuel;

    @JsonProperty("Rank_Stat_Duel_Controller")
    private String rankStatDuelGameController;

    @JsonProperty("Rank_Stat_Joust")
    private String rankStatJoust;

    @JsonProperty("Rank_Stat_Joust_Controller")
    private String rankStatJoustGameController;

    private List<GameModeData> rankedData;

    @JsonProperty("RankedConquest")
    private GameModeData rankedConquest;

    @JsonProperty("RankedConquestController")
    private GameModeData rankedConquestGameController;

    @JsonProperty("RankedDuel")
    private GameModeData rankedDuel;

    @JsonProperty("RankedDuelController")
    private GameModeData rankedDuelGameController;

    @JsonProperty("RankedJoust")
    private GameModeData rankedJoust;

    @JsonProperty("RankedJoustController")
    private GameModeData rankedJoustGameController;

    @JsonProperty("Region")
    private String region;

    @JsonProperty("TeamId")
    private Integer teamID;

    @JsonProperty("Team_Name")
    private String teamName;

    @JsonProperty("Tier_Conquest")
    private String tierConquest;

    @JsonProperty("Tier_Duel")
    private String tierDuel;

    @JsonProperty("Tier_Joust")
    private String tierJoust;

    @JsonProperty("Total_Achievements")
    private Integer totalAchievements;

    @JsonProperty("Total_Worshippers")
    private Integer totalWorshippers;

    @JsonProperty("Wins")
    private Integer wins;

    @JsonProperty("hz_gamer_tag")
    private String hzGamerTag;

    @JsonProperty("hz_player_name")
    private String hzPlayerName;

    @JsonProperty("ret_msg")
    private String ret_msg;

    public Integer getActivePlayerId() {
        return ActivePlayerId;
    }

    public void setActivePlayerId(Integer activePlayerId) {
        ActivePlayerId = activePlayerId;
    }

    public String getCreated_Datetime() {
        return Created_Datetime;
    }

    public void setCreated_Datetime(String created_Datetime) {
        Created_Datetime = created_Datetime;
    }

    public Integer getHoursPlayed() {
        return hoursPlayed;
    }

    public void setHoursPlayed(Integer hoursPlayed) {
        this.hoursPlayed = hoursPlayed;
    }

    public Integer getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Integer playerID) {
        this.playerID = playerID;
    }

    public String getLastLoginDatetime() {
        return lastLoginDatetime;
    }

    public void setLastLoginDatetime(String lastLoginDatetime) {
        this.lastLoginDatetime = lastLoginDatetime;
    }

    public Integer getLeaves() {
        return leaves;
    }

    public void setLeaves(Integer leaves) {
        this.leaves = leaves;
    }

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
        return mergedPlayers;
    }

    public void setMergedPlayers(String mergedPlayers) {
        this.mergedPlayers = mergedPlayers;
    }

    public Integer getMinutesPlayed() {
        return minutesPlayed;
    }

    public void setMinutesPlayed(Integer minutesPlayed) {
        this.minutesPlayed = minutesPlayed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonalStatusMessage() {
        return personalStatusMessage;
    }

    public void setPersonalStatusMessage(String personalStatusMessage) {
        this.personalStatusMessage = personalStatusMessage;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getRankStatConquest() {
        return rankStatConquest;
    }

    public void setRankStatConquest(String rankStatConquest) {
        this.rankStatConquest = rankStatConquest;
    }

    public String getRankStatRank_Stat_Conquest_ControllerGameController() {
        return rankStatRank_Stat_Conquest_ControllerGameController;
    }

    public void setRankStatRank_Stat_Conquest_ControllerGameController(String rankStatRank_Stat_Conquest_ControllerGameController) {
        this.rankStatRank_Stat_Conquest_ControllerGameController = rankStatRank_Stat_Conquest_ControllerGameController;
    }

    public String getRankStatDuel() {
        return rankStatDuel;
    }

    public void setRankStatDuel(String rankStatDuel) {
        this.rankStatDuel = rankStatDuel;
    }

    public String getRankStatDuelGameController() {
        return rankStatDuelGameController;
    }

    public void setRankStatDuelGameController(String rankStatDuelGameController) {
        this.rankStatDuelGameController = rankStatDuelGameController;
    }

    public String getRankStatJoust() {
        return rankStatJoust;
    }

    public void setRankStatJoust(String rankStatJoust) {
        this.rankStatJoust = rankStatJoust;
    }

    public String getRankStatJoustGameController() {
        return rankStatJoustGameController;
    }

    public void setRankStatJoustGameController(String rankStatJoustGameController) {
        this.rankStatJoustGameController = rankStatJoustGameController;
    }

    public GameModeData getRankedConquest() {
        return rankedConquest;
    }

    public void setRankedConquest(GameModeData rankedConquest) {
        this.rankedConquest = rankedConquest;
    }

    public GameModeData getRankedConquestGameController() {
        return rankedConquestGameController;
    }

    public void setRankedConquestGameController(GameModeData rankedConquestGameController) {
        this.rankedConquestGameController = rankedConquestGameController;
    }

    public GameModeData getRankedDuel() {
        return rankedDuel;
    }

    public void setRankedDuel(GameModeData rankedDuel) {
        this.rankedDuel = rankedDuel;
    }

    public GameModeData getRankedDuelGameController() {
        return rankedDuelGameController;
    }

    public void setRankedDuelGameController(GameModeData rankedDuelGameController) {
        this.rankedDuelGameController = rankedDuelGameController;
    }

    public GameModeData getRankedJoust() {
        return rankedJoust;
    }

    public void setRankedJoust(GameModeData rankedJoust) {
        this.rankedJoust = rankedJoust;
    }

    public GameModeData getRankedJoustGameController() {
        return rankedJoustGameController;
    }

    public void setRankedJoustGameController(GameModeData rankedJoustGameController) {
        this.rankedJoustGameController = rankedJoustGameController;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getTeamID() {
        return teamID;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getTierConquest() {
        return tierConquest;
    }

    public void setTierConquest(String tierConquest) {
        this.tierConquest = tierConquest;
    }

    public String getTierDuel() {
        return tierDuel;
    }

    public void setTierDuel(String tierDuel) {
        this.tierDuel = tierDuel;
    }

    public String getTierJoust() {
        return tierJoust;
    }

    public void setTierJoust(String tierJoust) {
        this.tierJoust = tierJoust;
    }

    public Integer getTotalAchievements() {
        return totalAchievements;
    }

    public void setTotalAchievements(Integer totalAchievements) {
        this.totalAchievements = totalAchievements;
    }

    public Integer getTotalWorshippers() {
        return totalWorshippers;
    }

    public void setTotalWorshippers(Integer totalWorshippers) {
        this.totalWorshippers = totalWorshippers;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public String getHzGamerTag() {
        return hzGamerTag;
    }

    public void setHzGamerTag(String hzGamerTag) {
        this.hzGamerTag = hzGamerTag;
    }

    public String getHzPlayerName() {
        return hzPlayerName;
    }

    public void setHzPlayerName(String hzPlayerName) {
        this.hzPlayerName = hzPlayerName;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    @Override
    public String toString() {
        return "PlayerInfo{" +
                "ActivePlayerId=" + ActivePlayerId +
                ", Created_Datetime='" + Created_Datetime + '\'' +
                ", hoursPlayed=" + hoursPlayed +
                ", id=" + playerID +
                ", lastLoginDatetime='" + lastLoginDatetime + '\'' +
                ", leaves=" + leaves +
                ", Level=" + Level +
                ", Losses=" + Losses +
                ", MasteryLevel=" + MasteryLevel +
                ", mergedPlayers='" + mergedPlayers + '\'' +
                ", minutesPlayed=" + minutesPlayed +
                ", name='" + name + '\'' +
                ", personalStatusMessage='" + personalStatusMessage + '\'' +
                ", platform='" + platform + '\'' +
                ", rankStatConquest='" + rankStatConquest + '\'' +
                ", rankStatRank_Stat_Conquest_ControllerGameController='" + rankStatRank_Stat_Conquest_ControllerGameController + '\'' +
                ", rankStatDuel='" + rankStatDuel + '\'' +
                ", rankStatDuelGameController='" + rankStatDuelGameController + '\'' +
                ", rankStatJoust='" + rankStatJoust + '\'' +
                ", rankStatJoustGameController='" + rankStatJoustGameController + '\'' +
                ", rankedConquest=" + rankedConquest +
                ", rankedConquestGameController=" + rankedConquestGameController +
                ", rankedDuel=" + rankedDuel +
                ", rankedDuelGameController=" + rankedDuelGameController +
                ", rankedJoust=" + rankedJoust +
                ", rankedJoustGameController=" + rankedJoustGameController +
                ", region='" + region + '\'' +
                ", teamID='" + teamID + '\'' +
                ", teamName='" + teamName + '\'' +
                ", tierConquest='" + tierConquest + '\'' +
                ", tierDuel='" + tierDuel + '\'' +
                ", tierJoust='" + tierJoust + '\'' +
                ", totalAchievements='" + totalAchievements + '\'' +
                ", totalWorshippers='" + totalWorshippers + '\'' +
                ", wins='" + wins + '\'' +
                ", hzGamerTag='" + hzGamerTag + '\'' +
                ", hzPlayerName='" + hzPlayerName + '\'' +
                ", ret_msg='" + ret_msg + '\'' +
                '}';
    }
}
