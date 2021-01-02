package com.astro.smitebasic.objects.player.auxiliary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchedPlayer {

    @JsonProperty("Name")
    private String playerName;

    @JsonProperty("hz_player_name")
    private String hzPlayerName;

    @JsonProperty("player_id")
    private Integer playerID;

    @JsonProperty("portal_id")
    private Integer portalID;

    @JsonProperty("privacy_flag")
    private String privacyFlag;

    @JsonProperty("ret_msg")
    private String ret_msg;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getHzPlayerName() {
        return hzPlayerName;
    }

    public void setHzPlayerName(String hzPlayerName) {
        this.hzPlayerName = hzPlayerName;
    }

    public Integer getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Integer playerID) {
        this.playerID = playerID;
    }

    public Integer getPortalID() {
        return portalID;
    }

    public void setPortalID(Integer portalID) {
        this.portalID = portalID;
    }

    public String getPrivacyFlag() {
        return privacyFlag;
    }

    public void setPrivacyFlag(String privacyFlag) {
        this.privacyFlag = privacyFlag;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    @Override
    public String toString() {
        return "SearchedPlayer{" +
                "playerName='" + playerName + '\'' +
                ", hzPlayerName='" + hzPlayerName + '\'' +
                ", playerID=" + playerID +
                ", portalID=" + portalID +
                ", privacyFlag='" + privacyFlag + '\'' +
                '}';
    }
}
