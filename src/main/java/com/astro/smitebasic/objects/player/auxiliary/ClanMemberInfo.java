package com.astro.smitebasic.objects.player.auxiliary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ClanMemberInfo {

    @JsonProperty("AccountLevel")
    private Integer accountLevel;

    @JsonProperty("JoinedDatetime")
    private String joinedDatetime;

    @JsonProperty("LastLoginDatetime")
    private String lastLoginDatetime;

    @JsonProperty("Name")
    private String playerName;

    @JsonProperty("ret_msg")
    private String ret_msg;

    public Integer getAccountLevel() {
        return accountLevel;
    }

    public void setAccountLevel(Integer accountLevel) {
        this.accountLevel = accountLevel;
    }

    public String getJoinedDatetime() {
        return joinedDatetime;
    }

    public void setJoinedDatetime(String joinedDatetime) {
        this.joinedDatetime = joinedDatetime;
    }

    public String getLastLoginDatetime() {
        return lastLoginDatetime;
    }

    public void setLastLoginDatetime(String lastLoginDatetime) {
        this.lastLoginDatetime = lastLoginDatetime;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    @Override
    public String toString() {
        return "ClanMemberInfo{" +
                "accountLevel=" + accountLevel +
                ", joinedDatetime='" + joinedDatetime + '\'' +
                ", lastLoginDatetime='" + lastLoginDatetime + '\'' +
                ", playerName='" + playerName + '\'' +
                '}';
    }
}
