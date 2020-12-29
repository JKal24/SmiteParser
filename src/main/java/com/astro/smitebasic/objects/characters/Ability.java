package com.astro.smitebasic.objects.characters;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

public class Ability {

    private String cooldown;
    private String cost;
    private String description;
    private List<AbilityDescription> abilityType;
    private List<AbilityDescription> abilityDamage;

    @SuppressWarnings("unchecked")
    @JsonProperty("itemDescription")
    private void unpackNested(Map<String, Object> description) {
        this.cooldown = (String) description.get("cooldown");
        this.cost = (String) description.get("cost");
        this.description = (String) description.get("description");
        this.abilityType = (List<AbilityDescription>) description.get("menuitems");
        this.abilityDamage = (List<AbilityDescription>) description.get("rankitems");
    }

    public String getCooldown() {
        return cooldown;
    }

    public void setCooldown(String cooldown) {
        this.cooldown = cooldown;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AbilityDescription> getAbilityType() {
        return abilityType;
    }

    public void setAbilityType(List<AbilityDescription> abilityType) {
        this.abilityType = abilityType;
    }

    public List<AbilityDescription> getAbilityDamage() {
        return abilityDamage;
    }

    public void setAbilityDamage(List<AbilityDescription> abilityDamage) {
        this.abilityDamage = abilityDamage;
    }

    @Override
    public String toString() {
        return "Ability{" +
                "cooldown='" + cooldown + '\'' +
                ", cost='" + cost + '\'' +
                ", description='" + description + '\'' +
                ", abilityType=" + abilityType +
                ", abilityDamage=" + abilityDamage +
                '}';
    }
}
