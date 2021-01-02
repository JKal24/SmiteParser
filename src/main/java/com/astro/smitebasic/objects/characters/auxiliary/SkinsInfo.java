package com.astro.smitebasic.objects.characters.auxiliary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SkinsInfo {

    @JsonProperty("godIcon_URL")
    private String godIcon_URL;

    @JsonProperty("godSkin_URL")
    private String godSkin_URL;

    @JsonProperty("god_id")
    private Integer god_id;

    @JsonProperty("god_name")
    private String god_name;

    @JsonProperty("obtainability")
    private String obtainability;

    @JsonProperty("price_favor")
    private Integer price_favor;

    @JsonProperty("price_gems")
    private Integer price_gems;

    @JsonProperty("skin_id1")
    private Integer skin_id1;

    @JsonProperty("skin_id2")
    private Integer skin_id2;

    @JsonProperty("skin_name")
    private String skin_name;

    public String getGodIcon_URL() {
        return godIcon_URL;
    }

    public void setGodIcon_URL(String godIcon_URL) {
        this.godIcon_URL = godIcon_URL;
    }

    public String getGodSkin_URL() {
        return godSkin_URL;
    }

    public void setGodSkin_URL(String godSkin_URL) {
        this.godSkin_URL = godSkin_URL;
    }

    public Integer getGod_id() {
        return god_id;
    }

    public void setGod_id(Integer god_id) {
        this.god_id = god_id;
    }

    public String getGod_name() {
        return god_name;
    }

    public void setGod_name(String god_name) {
        this.god_name = god_name;
    }

    public String getObtainability() {
        return obtainability;
    }

    public void setObtainability(String obtainability) {
        this.obtainability = obtainability;
    }

    public Integer getPrice_favor() {
        return price_favor;
    }

    public void setPrice_favor(Integer price_favor) {
        this.price_favor = price_favor;
    }

    public Integer getPrice_gems() {
        return price_gems;
    }

    public void setPrice_gems(Integer price_gems) {
        this.price_gems = price_gems;
    }

    public Integer getSkin_id1() {
        return skin_id1;
    }

    public void setSkin_id1(Integer skin_id1) {
        this.skin_id1 = skin_id1;
    }

    public Integer getSkin_id2() {
        return skin_id2;
    }

    public void setSkin_id2(Integer skin_id2) {
        this.skin_id2 = skin_id2;
    }

    public String getSkin_name() {
        return skin_name;
    }

    public void setSkin_name(String skin_name) {
        this.skin_name = skin_name;
    }

    @Override
    public String toString() {
        return "SkinsInfo{" +
                "godIcon_URL='" + godIcon_URL + '\'' +
                ", godSkin_URL='" + godSkin_URL + '\'' +
                ", god_id=" + god_id +
                ", god_name='" + god_name + '\'' +
                ", obtainability='" + obtainability + '\'' +
                ", price_favor=" + price_favor +
                ", price_gems=" + price_gems +
                ", skin_id1=" + skin_id1 +
                ", skin_id2=" + skin_id2 +
                ", skin_name='" + skin_name + '\'' +
                '}';
    }
}
