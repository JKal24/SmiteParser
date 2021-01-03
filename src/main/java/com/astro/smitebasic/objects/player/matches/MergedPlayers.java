package com.astro.smitebasic.objects.player.matches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class MergedPlayers {

    @JsonProperty("merge_datetime")
    private String mergeDatetime;

    @JsonProperty("playerId")
    private Integer playerID;

    @JsonProperty("portalId")
    private Float portalID;

    public String getMergeDatetime() {
        return mergeDatetime;
    }

    public void setMergeDatetime(String mergeDatetime) {
        this.mergeDatetime = mergeDatetime;
    }

    public Integer getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Integer playerID) {
        this.playerID = playerID;
    }

    public Float getPortalID() {
        return portalID;
    }

    public void setPortalID(Float portalID) {
        this.portalID = portalID;
    }

    @Override
    public String toString() {
        return "MergedPlayers{" +
                "mergeDatetime='" + mergeDatetime + '\'' +
                ", playerID=" + playerID +
                ", portalID=" + portalID +
                '}';
    }
}
