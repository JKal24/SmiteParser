package com.astro.smitebasic.info;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "session_info")
public class ConnectionInfo {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String ret_msg;
    private String session_id;
    private String timestamp;

    public ConnectionInfo() {

    }

    public ConnectionInfo(String ret_msg, String session_id, String timestamp) {
        this.ret_msg = ret_msg;
        this.session_id = session_id;
        this.timestamp = timestamp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public String getSession_id() {
        return session_id;
    }

    public void setSession_id(String session_id) {
        this.session_id = session_id;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return ret_msg + ", session_id: " + session_id + "timestamp: " + timestamp;
    }
}
