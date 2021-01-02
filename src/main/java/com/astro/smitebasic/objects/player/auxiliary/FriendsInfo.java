package com.astro.smitebasic.objects.player.auxiliary;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FriendsInfo {

    @JsonProperty("account_id")
    private String accountID;

    @JsonProperty("avatar_url")
    private String avatarURL;

    @JsonProperty("friend_flags")
    private String friendFlags;

    @JsonProperty("name")
    private String name;

    @JsonProperty("player_id")
    private Integer playerID;

    @JsonProperty("portal_id")
    private String portalID;

    @JsonProperty("status")
    private String status;

    @JsonProperty("ret_msg")
    private String ret_msg;


    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    public String getFriendFlags() {
        return friendFlags;
    }

    public void setFriendFlags(String friendFlags) {
        this.friendFlags = friendFlags;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Integer playerID) {
        this.playerID = playerID;
    }

    public String getPortalID() {
        return portalID;
    }

    public void setPortalID(String portalID) {
        this.portalID = portalID;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    @Override
    public String toString() {
        return "FriendsInfo{" +
                "accountID='" + accountID + '\'' +
                ", avatarURL='" + avatarURL + '\'' +
                ", friendFlags='" + friendFlags + '\'' +
                ", name='" + name + '\'' +
                ", playerID=" + playerID +
                ", portalID='" + portalID + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
