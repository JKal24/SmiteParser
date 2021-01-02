package com.astro.smitebasic.objects.player;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerStatus {

    @JsonProperty("Match")
    private Integer matchStatus;

    @JsonProperty("match_queue_id")
    private Integer matchQueueID;

    @JsonProperty("personal_status_message")
    private String personalStatusMessage;

    @JsonProperty("ret_msg")
    private String ret_msg;

    @JsonProperty("status")
    private Integer playerStatus;

    @JsonProperty("status_string")
    private Integer playerStatusDescription;

    public Integer getMatchStatus() {
        return matchStatus;
    }

    public void setMatchStatus(Integer matchStatus) {
        this.matchStatus = matchStatus;
    }

    public Integer getMatchQueueID() {
        return matchQueueID;
    }

    public void setMatchQueueID(Integer matchQueueID) {
        this.matchQueueID = matchQueueID;
    }

    public String getPersonalStatusMessage() {
        return personalStatusMessage;
    }

    public void setPersonalStatusMessage(String personalStatusMessage) {
        this.personalStatusMessage = personalStatusMessage;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public Integer getPlayerStatus() {
        return playerStatus;
    }

    public void setPlayerStatus(Integer playerStatus) {
        this.playerStatus = playerStatus;
    }

    public Integer getPlayerStatusDescription() {
        return playerStatusDescription;
    }

    public void setPlayerStatusDescription(Integer playerStatusDescription) {
        this.playerStatusDescription = playerStatusDescription;
    }

    @Override
    public String toString() {
        return "PlayerStatus{" +
                "matchStatus=" + matchStatus +
                ", matchQueueID=" + matchQueueID +
                ", personalStatusMessage='" + personalStatusMessage + '\'' +
                ", ret_msg='" + ret_msg + '\'' +
                ", playerStatus=" + playerStatus +
                ", playerStatusDescription=" + playerStatusDescription +
                '}';
    }
}
