package com.astro.smitebasic.smite;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Info {

    @JsonProperty("ret_msg")
    public String ret_msg;

    public Info(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public Info() { }
}
