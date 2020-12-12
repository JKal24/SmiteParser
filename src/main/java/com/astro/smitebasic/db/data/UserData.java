package com.astro.smitebasic.db.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserData {

    @JsonProperty("Active_Sessions")
    private Integer Active_Sessions;

    @JsonProperty("Concurrent_Sessions")
    private Integer Concurrent_Sessions;

    @JsonProperty("Request_Limit_Daily")
    private String Request_Limit_Daily;

    @JsonProperty("Session_Cap")
    private String Session_Cap;

    @JsonProperty("Session_Time_Limit")
    private String Session_Time_Limit;

    @JsonProperty("Total_Requests_Today")
    private String Total_Requests_Today;

    @JsonProperty("Total_Sessions_Today")
    private String Total_Sessions_Today;

    @JsonProperty("ret_msg")
    private String ret_msg;

    public UserData() { }

    public UserData(Integer active_Sessions, Integer concurrent_Sessions, String request_Limit_Daily, String session_Cap,
                    String session_Time_Limit, String total_Requests_Today, String total_Sessions_Today, String ret_msg) {
        Active_Sessions = active_Sessions;
        Concurrent_Sessions = concurrent_Sessions;
        Request_Limit_Daily = request_Limit_Daily;
        Session_Cap = session_Cap;
        Session_Time_Limit = session_Time_Limit;
        Total_Requests_Today = total_Requests_Today;
        Total_Sessions_Today = total_Sessions_Today;
        this.ret_msg = ret_msg;
    }

    public Integer getActive_Sessions() {
        return Active_Sessions;
    }

    public void setActive_Sessions(Integer active_Sessions) {
        Active_Sessions = active_Sessions;
    }

    public Integer getConcurrent_Sessions() {
        return Concurrent_Sessions;
    }

    public void setConcurrent_Sessions(Integer concurrent_Sessions) {
        Concurrent_Sessions = concurrent_Sessions;
    }

    public String getRequest_Limit_Daily() {
        return Request_Limit_Daily;
    }

    public void setRequest_Limit_Daily(String request_Limit_Daily) {
        Request_Limit_Daily = request_Limit_Daily;
    }

    public String getSession_Cap() {
        return Session_Cap;
    }

    public void setSession_Cap(String session_Cap) {
        Session_Cap = session_Cap;
    }

    public String getSession_Time_Limit() {
        return Session_Time_Limit;
    }

    public void setSession_Time_Limit(String session_Time_Limit) {
        Session_Time_Limit = session_Time_Limit;
    }

    public String getTotal_Requests_Today() {
        return Total_Requests_Today;
    }

    public void setTotal_Requests_Today(String total_Requests_Today) {
        Total_Requests_Today = total_Requests_Today;
    }

    public String getTotal_Sessions_Today() {
        return Total_Sessions_Today;
    }

    public void setTotal_Sessions_Today(String total_Sessions_Today) {
        Total_Sessions_Today = total_Sessions_Today;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }
}
