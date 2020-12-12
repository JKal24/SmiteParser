package com.astro.smitebasic.db.data;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PatchData {

    @JsonProperty("ret_msg")
    private String ret_msg;

    @JsonProperty("version_string")
    private String version_string;

}
