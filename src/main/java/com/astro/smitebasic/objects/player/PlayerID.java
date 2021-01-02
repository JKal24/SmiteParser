package com.astro.smitebasic.objects.player;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PlayerID {

    @JsonProperty("player_id")
    private Integer playerID;

    @JsonProperty("portal")
    private String portal;

    @JsonProperty("portal_id")
    private String portalID;

    @JsonProperty("privacy_flag")
    private String privacyFlag;

    @JsonProperty("ret_msg")
    private String ret_msg;

    public Integer getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Integer playerID) {
        this.playerID = playerID;
    }

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public String getPortalID() {
        return portalID;
    }

    public void setPortalID(String portalID) {
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
}
