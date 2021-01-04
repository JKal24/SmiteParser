package com.astro.smitebasic.objects.player.matches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerLiveMatchData {

    @JsonProperty("Account_Gods_Played")
    private Integer accountGodsPlayed;

    @JsonProperty("Account_Level")
    private Integer accountLevel;

    @JsonProperty("GodId")
    private Integer godID;

    @JsonProperty("GodLevel")
    private Integer godLevel;

    @JsonProperty("GodName")
    private String godName;

    @JsonProperty("mapGame")
    private String mapGame;

    @JsonProperty("Mastery_Level")
    private Integer masteryLevel;

    @JsonProperty("Match")
    private Integer match;

    @JsonProperty("playerCreated")
    private String playerCreated;

    @JsonProperty("playerId")
    private String playerID;

    @JsonProperty("playerName")
    private String playerName;

    @JsonProperty("playerRegion")
    private String playerRegion;

    @JsonProperty("Queue")
    private String queue;

    @JsonProperty("Rank_Stat")
    private Integer rankStat;

    @JsonProperty("ret_msg")
    private String ret_msg;

    @JsonProperty("SkinId")
    private Integer skinID;

    @JsonProperty("taskForce")
    private Integer taskForce;

    @JsonProperty("Tier")
    private Integer tier;

    @JsonProperty("tierLosses")
    private Integer tierLosses;

    @JsonProperty("tierWins")
    private Integer tierWins;

    public Integer getAccountGodsPlayed() {
        return accountGodsPlayed;
    }

    public void setAccountGodsPlayed(Integer accountGodsPlayed) {
        this.accountGodsPlayed = accountGodsPlayed;
    }

    public Integer getAccountLevel() {
        return accountLevel;
    }

    public void setAccountLevel(Integer accountLevel) {
        this.accountLevel = accountLevel;
    }

    public Integer getGodID() {
        return godID;
    }

    public void setGodID(Integer godID) {
        this.godID = godID;
    }

    public Integer getGodLevel() {
        return godLevel;
    }

    public void setGodLevel(Integer godLevel) {
        this.godLevel = godLevel;
    }

    public String getGodName() {
        return godName;
    }

    public void setGodName(String godName) {
        this.godName = godName;
    }

    public String getMapGame() {
        return mapGame;
    }

    public void setMapGame(String mapGame) {
        this.mapGame = mapGame;
    }

    public Integer getMasteryLevel() {
        return masteryLevel;
    }

    public void setMasteryLevel(Integer masteryLevel) {
        this.masteryLevel = masteryLevel;
    }

    public Integer getMatch() {
        return match;
    }

    public void setMatch(Integer match) {
        this.match = match;
    }

    public String getPlayerCreated() {
        return playerCreated;
    }

    public void setPlayerCreated(String playerCreated) {
        this.playerCreated = playerCreated;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerRegion() {
        return playerRegion;
    }

    public void setPlayerRegion(String playerRegion) {
        this.playerRegion = playerRegion;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public Integer getRankStat() {
        return rankStat;
    }

    public void setRankStat(Integer rankStat) {
        this.rankStat = rankStat;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public Integer getSkinID() {
        return skinID;
    }

    public void setSkinID(Integer skinID) {
        this.skinID = skinID;
    }

    public Integer getTaskForce() {
        return taskForce;
    }

    public void setTaskForce(Integer taskForce) {
        this.taskForce = taskForce;
    }

    public Integer getTier() {
        return tier;
    }

    public void setTier(Integer tier) {
        this.tier = tier;
    }

    public Integer getTierLosses() {
        return tierLosses;
    }

    public void setTierLosses(Integer tierLosses) {
        this.tierLosses = tierLosses;
    }

    public Integer getTierWins() {
        return tierWins;
    }

    public void setTierWins(Integer tierWins) {
        this.tierWins = tierWins;
    }

    @Override
    public String toString() {
        return "PlayerLiveMatchData{" +
                "accountGodsPlayed=" + accountGodsPlayed +
                ", accountLevel=" + accountLevel +
                ", godID=" + godID +
                ", godLevel=" + godLevel +
                ", godName='" + godName + '\'' +
                ", mapGame='" + mapGame + '\'' +
                ", masteryLevel=" + masteryLevel +
                ", match=" + match +
                ", playerCreated='" + playerCreated + '\'' +
                ", playerID='" + playerID + '\'' +
                ", playerName='" + playerName + '\'' +
                ", playerRegion='" + playerRegion + '\'' +
                ", queue='" + queue + '\'' +
                ", rankStat=" + rankStat +
                ", skinID=" + skinID +
                ", taskForce=" + taskForce +
                ", tier=" + tier +
                ", tierLosses=" + tierLosses +
                ", tierWins=" + tierWins +
                '}';
    }
}
