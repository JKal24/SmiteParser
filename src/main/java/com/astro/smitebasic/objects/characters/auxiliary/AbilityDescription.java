package com.astro.smitebasic.objects.characters.auxiliary;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AbilityDescription {

    @JsonProperty("Description")
    private Ability ability;

    @JsonProperty("Id")
    private Integer abilityID;

    @JsonProperty("Summary")
    private String summary;

    @JsonProperty("URL")
    private String URL;

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public Integer getAbilityID() {
        return abilityID;
    }

    public void setAbilityID(Integer abilityID) {
        this.abilityID = abilityID;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public String toString() {
        return "AbilityDescription{" +
                "ability=" + ability +
                ", id=" + abilityID +
                ", summary='" + summary + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }
}
