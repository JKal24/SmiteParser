package com.astro.smitebasic.db.player.friends;

import javax.persistence.*;

@Entity
@Table(name = "friends_info")
public class FriendsInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String player_id;
    private String portal;
    private String portal_id;
    private String privacy_flag;
    private String ret_msg;

    public FriendsInfo() { }

    public FriendsInfo(Integer id, String player_id, String portal, String portal_id, String privacy_flag, String ret_msg) {
        this.id = id;
        this.player_id = player_id;
        this.portal = portal;
        this.portal_id = portal_id;
        this.privacy_flag = privacy_flag;
        this.ret_msg = ret_msg;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(String player_id) {
        this.player_id = player_id;
    }

    public String getPortal() {
        return portal;
    }

    public void setPortal(String portal) {
        this.portal = portal;
    }

    public String getPortal_id() {
        return portal_id;
    }

    public void setPortal_id(String portal_id) {
        this.portal_id = portal_id;
    }

    public String getPrivacy_flag() {
        return privacy_flag;
    }

    public void setPrivacy_flag(String privacy_flag) {
        this.privacy_flag = privacy_flag;
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
                "id=" + id +
                ", player_id='" + player_id + '\'' +
                ", portal='" + portal + '\'' +
                ", portal_id='" + portal_id + '\'' +
                ", privacy_flag='" + privacy_flag + '\'' +
                ", ret_msg='" + ret_msg + '\'' +
                '}';
    }
}
