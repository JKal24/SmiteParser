package com.astro.smitebasic.objects.player.matches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerQueueStatistics {

    @JsonProperty("Assists")
    private Integer assists;

    @JsonProperty("Deaths")
    private Integer deaths;

    @JsonProperty("God")
    private String godPlayed;

    @JsonProperty("GodId")
    private Integer godPlayedID;

    @JsonProperty("Gold")
    private Integer goldAccumulated;

    @JsonProperty("Kills")
    private Integer kills;

    @JsonProperty("LastPlayed")
    private String lastPlayed;

    @JsonProperty("Losses")
    private Integer losses;

    @JsonProperty("Matches")
    private Integer matches;

    @JsonProperty("Minutes")
    private Integer minutes;

    @JsonProperty("Queue")
    private String queue;

    @JsonProperty("Wins")
    private Integer wins;

    @JsonProperty("player_id")
    private Integer playerID;

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

    public String getGodPlayed() {
        return godPlayed;
    }

    public void setGodPlayed(String godPlayed) {
        this.godPlayed = godPlayed;
    }

    public Integer getGodPlayedID() {
        return godPlayedID;
    }

    public void setGodPlayedID(Integer godPlayedID) {
        this.godPlayedID = godPlayedID;
    }

    public Integer getGoldAccumulated() {
        return goldAccumulated;
    }

    public void setGoldAccumulated(Integer goldAccumulated) {
        this.goldAccumulated = goldAccumulated;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public String getLastPlayed() {
        return lastPlayed;
    }

    public void setLastPlayed(String lastPlayed) {
        this.lastPlayed = lastPlayed;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    public Integer getMatches() {
        return matches;
    }

    public void setMatches(Integer matches) {
        this.matches = matches;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Integer playerID) {
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
        return "PlayerQueueStatistics{" +
                "assists=" + assists +
                ", deaths=" + deaths +
                ", godPlayed='" + godPlayed + '\'' +
                ", godPlayedID=" + godPlayedID +
                ", goldAccumulated=" + goldAccumulated +
                ", kills=" + kills +
                ", lastPlayed='" + lastPlayed + '\'' +
                ", losses=" + losses +
                ", matches=" + matches +
                ", minutes=" + minutes +
                ", queue='" + queue + '\'' +
                ", wins=" + wins +
                ", playerID=" + playerID +
                '}';
    }
}
