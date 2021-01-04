package com.astro.smitebasic.objects.gamedata.matches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EsportsMatchInfo {

    @JsonProperty("away_team_clan_id")
    private Integer awayTeamClanID;

    @JsonProperty("away_team_name")
    private String awayTeamName;

    @JsonProperty("away_team_tagname")
    private String awayTeamTagName;

    @JsonProperty("home_team_clan_id")
    private Integer homeTeamClanID;

    @JsonProperty("home_team_name")
    private String homeTeamName;

    @JsonProperty("home_team_tagname")
    private String homeTeamTagName;

    @JsonProperty("map_instance_id")
    private Integer mapInstanceID;

    @JsonProperty("match_date")
    private String matchDate;

    @JsonProperty("match_number")
    private Integer matchNumber;

    @JsonProperty("match_status")
    private String matchStatus;

    @JsonProperty("matchup_id")
    private Integer matchupID;

    @JsonProperty("region")
    private String region;

    @JsonProperty("ret_msg")
    private String ret_msg;

    @JsonProperty("tournament_name")
    private String tournamentName;

    @JsonProperty("winning_team_clan_id")
    private Integer winningTeam;

    public Integer getAwayTeamClanID() {
        return awayTeamClanID;
    }

    public void setAwayTeamClanID(Integer awayTeamClanID) {
        this.awayTeamClanID = awayTeamClanID;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public String getAwayTeamTagName() {
        return awayTeamTagName;
    }

    public void setAwayTeamTagName(String awayTeamTagName) {
        this.awayTeamTagName = awayTeamTagName;
    }

    public Integer getHomeTeamClanID() {
        return homeTeamClanID;
    }

    public void setHomeTeamClanID(Integer homeTeamClanID) {
        this.homeTeamClanID = homeTeamClanID;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getHomeTeamTagName() {
        return homeTeamTagName;
    }

    public void setHomeTeamTagName(String homeTeamTagName) {
        this.homeTeamTagName = homeTeamTagName;
    }

    public Integer getMapInstanceID() {
        return mapInstanceID;
    }

    public void setMapInstanceID(Integer mapInstanceID) {
        this.mapInstanceID = mapInstanceID;
    }

    public String getMatchDate() {
        return matchDate;
    }

    public void setMatchDate(String matchDate) {
        this.matchDate = matchDate;
    }

    public Integer getMatchNumber() {
        return matchNumber;
    }

    public void setMatchNumber(Integer matchNumber) {
        this.matchNumber = matchNumber;
    }

    public String getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(String matchStatus) {
        this.matchStatus = matchStatus;
    }

    public Integer getMatchupID() {
        return matchupID;
    }

    public void setMatchupID(Integer matchupID) {
        this.matchupID = matchupID;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public String getTournamentName() {
        return tournamentName;
    }

    public void setTournamentName(String tournamentName) {
        this.tournamentName = tournamentName;
    }

    public Integer getWinningTeam() {
        return winningTeam;
    }

    public void setWinningTeam(Integer winningTeam) {
        this.winningTeam = winningTeam;
    }

    @Override
    public String toString() {
        return "EsportsMatchInfo{" +
                "awayTeamClanID=" + awayTeamClanID +
                ", awayTeamName='" + awayTeamName + '\'' +
                ", awayTeamTagName='" + awayTeamTagName + '\'' +
                ", homeTeamClanID=" + homeTeamClanID +
                ", homeTeamName='" + homeTeamName + '\'' +
                ", homeTeamTagName='" + homeTeamTagName + '\'' +
                ", mapInstanceID=" + mapInstanceID +
                ", matchDate='" + matchDate + '\'' +
                ", matchNumber=" + matchNumber +
                ", matchStatus='" + matchStatus + '\'' +
                ", matchupID=" + matchupID +
                ", region='" + region + '\'' +
                ", ret_msg='" + ret_msg + '\'' +
                ", tournamentName='" + tournamentName + '\'' +
                ", winningTeam='" + winningTeam + '\'' +
                '}';
    }
}
