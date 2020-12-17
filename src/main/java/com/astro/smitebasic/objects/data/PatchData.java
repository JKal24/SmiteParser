package com.astro.smitebasic.objects.data;

import com.astro.smitebasic.api.Config;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "patch_data")
public class PatchData {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @JsonProperty("ret_msg")
    private String ret_msg;

    @JsonProperty("version_string")
    private String version_string;

    private String date = Config.makeRecordTimeStamp();

    public PatchData() { }

    public PatchData(String ret_msg, String version_string) {
        this.ret_msg = ret_msg;
        this.version_string = version_string;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    public String getVersion_string() {
        return version_string;
    }

    public void setVersion_string(String version_string) {
        this.version_string = version_string;
    }

    @Override
    public String toString() {
        return "PatchData{" +
                "ret_msg='" + ret_msg + '\'' +
                ", version_string='" + version_string + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
