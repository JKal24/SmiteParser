package com.astro.smitebasic.objects.player.matches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayTimeStatistics {

    @JsonProperty("AssistedKills")
    private Integer assistedKills;

    @JsonProperty("CampsCleared")
    private Integer campsCleared;

    @JsonProperty("Deaths")
    private Integer Deaths;

    @JsonProperty("DivineSpree")
    private Integer divineSpree;

    @JsonProperty("DoubleKills")
    private Integer doubleKills;

    @JsonProperty("FireGiantKills")
    private Integer fireGiantKills;

    @JsonProperty("FirstBloods")
    private Integer firstBloods;

    @JsonProperty("GodLikeSpree")
    private Integer godLikeSpree;

    @JsonProperty("GoldFuryKills")
    private Integer goldFuryKills;

    @JsonProperty("Id")
    private Integer Id;

    @JsonProperty("ImmortalSpree")
    private Integer immortalSpree;

    @JsonProperty("KillingSpree")
    private Integer killingSpree;

    @JsonProperty("MinionKills")
    private Integer minionKills;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("PentaKills")
    private Integer pentaKills;

    @JsonProperty("PhoenixKills")
    private Integer phoenixKills;

    @JsonProperty("PlayerKills")
    private Integer playerKills;

    @JsonProperty("QuadraKills")
    private Integer quadraKills;

    @JsonProperty("RampageSpree")
    private Integer rampageSpree;

    @JsonProperty("ShutdownSpree")
    private Integer shutdownSpree;

    @JsonProperty("SiegeJuggernautKills")
    private Integer siegeJuggernautKills;

    @JsonProperty("TowerKills")
    private Integer towerKills;

    @JsonProperty("UnstoppableSpree")
    private Integer unstoppableSpree;

    @JsonProperty("WildJuggernautKills")
    private Integer wildJuggernautKills;

    @JsonProperty("ret_msg")
    private String ret_msg;

    public Integer getAssistedKills() {
        return assistedKills;
    }

    public void setAssistedKills(Integer assistedKills) {
        this.assistedKills = assistedKills;
    }

    public Integer getCampsCleared() {
        return campsCleared;
    }

    public void setCampsCleared(Integer campsCleared) {
        this.campsCleared = campsCleared;
    }

    public Integer getDeaths() {
        return Deaths;
    }

    public void setDeaths(Integer deaths) {
        Deaths = deaths;
    }

    public Integer getDivineSpree() {
        return divineSpree;
    }

    public void setDivineSpree(Integer divineSpree) {
        this.divineSpree = divineSpree;
    }

    public Integer getDoubleKills() {
        return doubleKills;
    }

    public void setDoubleKills(Integer doubleKills) {
        this.doubleKills = doubleKills;
    }

    public Integer getFireGiantKills() {
        return fireGiantKills;
    }

    public void setFireGiantKills(Integer fireGiantKills) {
        this.fireGiantKills = fireGiantKills;
    }

    public Integer getFirstBloods() {
        return firstBloods;
    }

    public void setFirstBloods(Integer firstBloods) {
        this.firstBloods = firstBloods;
    }

    public Integer getGodLikeSpree() {
        return godLikeSpree;
    }

    public void setGodLikeSpree(Integer godLikeSpree) {
        this.godLikeSpree = godLikeSpree;
    }

    public Integer getGoldFuryKills() {
        return goldFuryKills;
    }

    public void setGoldFuryKills(Integer goldFuryKills) {
        this.goldFuryKills = goldFuryKills;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getImmortalSpree() {
        return immortalSpree;
    }

    public void setImmortalSpree(Integer immortalSpree) {
        this.immortalSpree = immortalSpree;
    }

    public Integer getKillingSpree() {
        return killingSpree;
    }

    public void setKillingSpree(Integer killingSpree) {
        this.killingSpree = killingSpree;
    }

    public Integer getMinionKills() {
        return minionKills;
    }

    public void setMinionKills(Integer minionKills) {
        this.minionKills = minionKills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPentaKills() {
        return pentaKills;
    }

    public void setPentaKills(Integer pentaKills) {
        this.pentaKills = pentaKills;
    }

    public Integer getPhoenixKills() {
        return phoenixKills;
    }

    public void setPhoenixKills(Integer phoenixKills) {
        this.phoenixKills = phoenixKills;
    }

    public Integer getPlayerKills() {
        return playerKills;
    }

    public void setPlayerKills(Integer playerKills) {
        this.playerKills = playerKills;
    }

    public Integer getQuadraKills() {
        return quadraKills;
    }

    public void setQuadraKills(Integer quadraKills) {
        this.quadraKills = quadraKills;
    }

    public Integer getRampageSpree() {
        return rampageSpree;
    }

    public void setRampageSpree(Integer rampageSpree) {
        this.rampageSpree = rampageSpree;
    }

    public Integer getShutdownSpree() {
        return shutdownSpree;
    }

    public void setShutdownSpree(Integer shutdownSpree) {
        this.shutdownSpree = shutdownSpree;
    }

    public Integer getSiegeJuggernautKills() {
        return siegeJuggernautKills;
    }

    public void setSiegeJuggernautKills(Integer siegeJuggernautKills) {
        this.siegeJuggernautKills = siegeJuggernautKills;
    }

    public Integer getTowerKills() {
        return towerKills;
    }

    public void setTowerKills(Integer towerKills) {
        this.towerKills = towerKills;
    }

    public Integer getUnstoppableSpree() {
        return unstoppableSpree;
    }

    public void setUnstoppableSpree(Integer unstoppableSpree) {
        this.unstoppableSpree = unstoppableSpree;
    }

    public Integer getWildJuggernautKills() {
        return wildJuggernautKills;
    }

    public void setWildJuggernautKills(Integer wildJuggernautKills) {
        this.wildJuggernautKills = wildJuggernautKills;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    @Override
    public String toString() {
        return "PlayTimeStatistics{" +
                "assistedKills=" + assistedKills +
                ", campsCleared=" + campsCleared +
                ", Deaths=" + Deaths +
                ", divineSpree=" + divineSpree +
                ", doubleKills=" + doubleKills +
                ", fireGiantKills=" + fireGiantKills +
                ", firstBloods=" + firstBloods +
                ", godLikeSpree=" + godLikeSpree +
                ", goldFuryKills=" + goldFuryKills +
                ", Id=" + Id +
                ", immortalSpree=" + immortalSpree +
                ", killingSpree=" + killingSpree +
                ", minionKills=" + minionKills +
                ", name='" + name + '\'' +
                ", pentaKills=" + pentaKills +
                ", phoenixKills=" + phoenixKills +
                ", playerKills=" + playerKills +
                ", quadraKills=" + quadraKills +
                ", rampageSpree=" + rampageSpree +
                ", shutdownSpree=" + shutdownSpree +
                ", siegeJuggernautKills=" + siegeJuggernautKills +
                ", towerKills=" + towerKills +
                ", unstoppableSpree=" + unstoppableSpree +
                ", wildJuggernautKills=" + wildJuggernautKills +
                ", ret_msg='" + ret_msg + '\'' +
                '}';
    }
}
