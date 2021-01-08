package com.astro.smitebasic.objects.gamedata.matches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TopMatchInfo {

    @JsonProperty("Ban1")
    private String ban1;

    @JsonProperty("Ban1Id")
    private Integer ban1ID;

    @JsonProperty("Ban2")
    private String ban2;

    @JsonProperty("Ban2Id")
    private Integer ban2ID;

    @JsonProperty("Entry_Datetime")
    private String entryDatetime;

    @JsonProperty("LiveSpectators")
    private Integer liveSpectators;

    @JsonProperty("Match")
    private Integer match;

    @JsonProperty("Match_Time")
    private Integer matchTime;

    @JsonProperty("OfflineSpectators")
    private Integer offlineSpectators;

    @JsonProperty("Queue")
    private String queue;

    @JsonProperty("RecordingFinished")
    private String recordingFinishedDate;

    @JsonProperty("RecordingStarted")
    private String recordingStartedDate;

    @JsonProperty("ret_msg")
    private String ret_msg;

    @JsonProperty("Team1_AvgLevel")
    private Integer team1AverageLevel;

    @JsonProperty("Team1_Gold")
    private Integer team1Gold;

    @JsonProperty("Team1_Kills")
    private Integer team1Kills;

    @JsonProperty("Team1_Score")
    private Integer team1Score;

    @JsonProperty("Team2_AvgLevel")
    private Integer team2AverageLevel;

    @JsonProperty("Team2_Gold")
    private Integer team2Gold;

    @JsonProperty("Team2_Kills")
    private Integer team2Kills;

    @JsonProperty("Team2_Score")
    private Integer team2Score;

    @JsonProperty("WinningTeam")
    private Integer winningTeam;

    public String getBan1() {
        return ban1;
    }

    public void setBan1(String ban1) {
        this.ban1 = ban1;
    }

    public Integer getBan1ID() {
        return ban1ID;
    }

    public void setBan1ID(Integer ban1ID) {
        this.ban1ID = ban1ID;
    }

    public String getBan2() {
        return ban2;
    }

    public void setBan2(String ban2) {
        this.ban2 = ban2;
    }

    public Integer getBan2ID() {
        return ban2ID;
    }

    public void setBan2ID(Integer ban2ID) {
        this.ban2ID = ban2ID;
    }

    public String getEntryDatetime() {
        return entryDatetime;
    }

    public void setEntryDatetime(String entryDatetime) {
        this.entryDatetime = entryDatetime;
    }

    public Integer getLiveSpectators() {
        return liveSpectators;
    }

    public void setLiveSpectators(Integer liveSpectators) {
        this.liveSpectators = liveSpectators;
    }

    public Integer getMatch() {
        return match;
    }

    public void setMatch(Integer match) {
        this.match = match;
    }

    public Integer getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(Integer matchTime) {
        this.matchTime = matchTime;
    }

    public Integer getOfflineSpectators() {
        return offlineSpectators;
    }

    public void setOfflineSpectators(Integer offlineSpectators) {
        this.offlineSpectators = offlineSpectators;
    }

    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public String getRecordingFinishedDate() {
        return recordingFinishedDate;
    }

    public void setRecordingFinishedDate(String recordingFinishedDate) {
        this.recordingFinishedDate = recordingFinishedDate;
    }

    public String getRecordingStartedDate() {
        return recordingStartedDate;
    }

    public void setRecordingStartedDate(String recordingStartedDate) {
        this.recordingStartedDate = recordingStartedDate;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public Integer getTeam1AverageLevel() {
        return team1AverageLevel;
    }

    public void setTeam1AverageLevel(Integer team1AverageLevel) {
        this.team1AverageLevel = team1AverageLevel;
    }

    public Integer getTeam1Gold() {
        return team1Gold;
    }

    public void setTeam1Gold(Integer team1Gold) {
        this.team1Gold = team1Gold;
    }

    public Integer getTeam1Kills() {
        return team1Kills;
    }

    public void setTeam1Kills(Integer team1Kills) {
        this.team1Kills = team1Kills;
    }

    public Integer getTeam1Score() {
        return team1Score;
    }

    public void setTeam1Score(Integer team1Score) {
        this.team1Score = team1Score;
    }

    public Integer getTeam2AverageLevel() {
        return team2AverageLevel;
    }

    public void setTeam2AverageLevel(Integer team2AverageLevel) {
        this.team2AverageLevel = team2AverageLevel;
    }

    public Integer getTeam2Gold() {
        return team2Gold;
    }

    public void setTeam2Gold(Integer team2Gold) {
        this.team2Gold = team2Gold;
    }

    public Integer getTeam2Kills() {
        return team2Kills;
    }

    public void setTeam2Kills(Integer team2Kills) {
        this.team2Kills = team2Kills;
    }

    public Integer getTeam2Score() {
        return team2Score;
    }

    public void setTeam2Score(Integer team2Score) {
        this.team2Score = team2Score;
    }

    public Integer getWinningTeam() {
        return winningTeam;
    }

    public void setWinningTeam(Integer winningTeam) {
        this.winningTeam = winningTeam;
    }

    @Override
    public String toString() {
        return "TopMatchInfo{" +
                "ban1=" + ban1 +
                ", ban1ID='" + ban1ID + '\'' +
                ", ban2=" + ban2 +
                ", ban2ID='" + ban2ID + '\'' +
                ", entryDatetime='" + entryDatetime + '\'' +
                ", liveSpectators=" + liveSpectators +
                ", match=" + match +
                ", matchTime=" + matchTime +
                ", offlineSpectators=" + offlineSpectators +
                ", queue='" + queue + '\'' +
                ", recordingFinishedDate='" + recordingFinishedDate + '\'' +
                ", recordingStartedDate='" + recordingStartedDate + '\'' +
                ", team1AverageLevel=" + team1AverageLevel +
                ", team1Gold=" + team1Gold +
                ", team1Kills=" + team1Kills +
                ", team1Score=" + team1Score +
                ", team2AverageLevel=" + team2AverageLevel +
                ", team2Gold=" + team2Gold +
                ", team2Kills=" + team2Kills +
                ", team2Score=" + team2Score +
                ", winningTeam=" + winningTeam +
                '}';
    }
}
