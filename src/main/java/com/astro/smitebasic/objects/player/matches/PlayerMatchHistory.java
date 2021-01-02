package com.astro.smitebasic.objects.player.matches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerMatchHistory {

    @JsonProperty("playerName")
    private String playerName;

    @JsonProperty("ActiveId1")
    private Integer activeItemID1;

    @JsonProperty("ActiveId2")
    private Integer activeItemID2;

    @JsonProperty("Active_1")
    private String activeItemName1;

    @JsonProperty("Active_2")
    private String activeItemName2;

    @JsonProperty("Assists")
    private Integer assists;

    @JsonProperty("Ban1")
    private String ban1;

    @JsonProperty("Ban1Id")
    private String ban1ID;

    @JsonProperty("Ban2")
    private String ban2;

    @JsonProperty("Ban2Id")
    private String ban2ID;

    @JsonProperty("Ban3")
    private String ban3;

    @JsonProperty("Ban3Id")
    private String ban3ID;

    @JsonProperty("Ban4")
    private String ban4;

    @JsonProperty("Ban4Id")
    private String ban4ID;

    @JsonProperty("Ban5")
    private String ban5;

    @JsonProperty("Ban5Id")
    private String ban5ID;

    @JsonProperty("Ban6")
    private String ban6;

    @JsonProperty("Ban6Id")
    private String ban6ID;

    @JsonProperty("Ban7")
    private String ban7;

    @JsonProperty("Ban7Id")
    private String ban7ID;

    @JsonProperty("Ban8")
    private String ban8;

    @JsonProperty("Ban8Id")
    private String ban8ID;

    @JsonProperty("Ban9")
    private String ban9;

    @JsonProperty("Ban9Id")
    private String ban9ID;

    @JsonProperty("Ban10")
    private String ban10;

    @JsonProperty("Ban10Id")
    private String ban10ID;

    @JsonProperty("Creeps")
    private Integer creeps;

    @JsonProperty("Damage")
    private Integer damage;

    @JsonProperty("Damage_Bot")
    private Integer minionDamage;

    @JsonProperty("Damage_Done_In_Hand")
    private Integer basicAttackDamage;

    @JsonProperty("Damage_Mitigated")
    private Integer damageMitigated;

    @JsonProperty("Damage_Structure")
    private Integer structureDamage;

    @JsonProperty("Damage_Taken")
    private Integer damageTakenTotal;

    @JsonProperty("Damage_Taken_Magical")
    private Integer magicalDamageTaken;

    @JsonProperty("Damage_Taken_Physical")
    private Integer physicalDamageTaken;

    @JsonProperty("Deaths")
    private Integer deaths;

    @JsonProperty("Distance_Traveled")
    private Integer distanceTraveled;

    @JsonProperty("First_Ban_Side")
    private String firstBans;

    @JsonProperty("God")
    private String godPlayed;

    @JsonProperty("GodID")
    private Integer godID;

    @JsonProperty("Gold")
    private Integer gold;

    @JsonProperty("Healing")
    private Integer healingDone;

    @JsonProperty("Healing_Bot")
    private Integer minionHealing;

    @JsonProperty("Healing_Player_Self")
    private Integer selfHealing;

    @JsonProperty("ItemId1")
    private Integer itemID1;

    @JsonProperty("Item_1")
    private String item1;

    @JsonProperty("ItemId2")
    private Integer itemId2;

    @JsonProperty("Item_2")
    private String item2;

    @JsonProperty("ItemId3")
    private Integer itemId3;

    @JsonProperty("Item_3")
    private String item3;

    @JsonProperty("ItemId4")
    private Integer itemId4;

    @JsonProperty("Item_4")
    private String item4;

    @JsonProperty("ItemId5")
    private Integer itemId5;

    @JsonProperty("Item_5")
    private String item5;

    @JsonProperty("ItemId6")
    private Integer itemId6;

    @JsonProperty("Item_6")
    private String item6;

    @JsonProperty("Killing_Spree")
    private Integer killingSpree;

    @JsonProperty("Kills")
    private Integer kills;

    @JsonProperty("Level")
    private Integer level;

    @JsonProperty("Map_Game")
    private String gameMode;

    @JsonProperty("Match")
    private Integer matchNumber;

    @JsonProperty("Match_Queue_Id")
    private Integer matchQueueID;

    @JsonProperty("Match_Time")
    private String matchTime;

    @JsonProperty("Minutes")
    private Integer minutes;

    @JsonProperty("Multi_kill_Max")
    private Integer maxMultiKills;

    @JsonProperty("Objective_Assists")
    private Integer objectiveAssists;

    @JsonProperty("Queue")
    private String Queue;

    @JsonProperty("Region")
    private String region;

    @JsonProperty("Skin")
    private String skin;

    @JsonProperty("SkinId")
    private Integer skinID;

    @JsonProperty("Surrendered")
    private Integer surrendered;

    @JsonProperty("TaskForce")
    private Integer sideSelection;

    @JsonProperty("Team1Score")
    private Integer team1Score;

    @JsonProperty("Team2Score")
    private Integer team2Score;

    @JsonProperty("Time_In_Match_Seconds")
    private Integer matchTimeSeconds;

    @JsonProperty("Wards_Placed")
    private Integer wardsPlaced;

    @JsonProperty("Win_Status")
    private String matchResult;

    @JsonProperty("Winning_TaskForce")
    private Integer winningSideSelection;

    @JsonProperty("playerId")
    private Integer playerID;

    @JsonProperty("ret_msg")
    private String ret_msg;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getActiveItemID1() {
        return activeItemID1;
    }

    public void setActiveItemID1(Integer activeItemID1) {
        this.activeItemID1 = activeItemID1;
    }

    public Integer getActiveItemID2() {
        return activeItemID2;
    }

    public void setActiveItemID2(Integer activeItemID2) {
        this.activeItemID2 = activeItemID2;
    }

    public String getActiveItemName1() {
        return activeItemName1;
    }

    public void setActiveItemName1(String activeItemName1) {
        this.activeItemName1 = activeItemName1;
    }

    public String getActiveItemName2() {
        return activeItemName2;
    }

    public void setActiveItemName2(String activeItemName2) {
        this.activeItemName2 = activeItemName2;
    }

    public Integer getAssists() {
        return assists;
    }

    public void setAssists(Integer assists) {
        this.assists = assists;
    }

    public String getBan1() {
        return ban1;
    }

    public void setBan1(String ban1) {
        this.ban1 = ban1;
    }

    public String getBan1ID() {
        return ban1ID;
    }

    public void setBan1ID(String ban1ID) {
        this.ban1ID = ban1ID;
    }

    public String getBan2() {
        return ban2;
    }

    public void setBan2(String ban2) {
        this.ban2 = ban2;
    }

    public String getBan2ID() {
        return ban2ID;
    }

    public void setBan2ID(String ban2ID) {
        this.ban2ID = ban2ID;
    }

    public String getBan3() {
        return ban3;
    }

    public void setBan3(String ban3) {
        this.ban3 = ban3;
    }

    public String getBan3ID() {
        return ban3ID;
    }

    public void setBan3ID(String ban3ID) {
        this.ban3ID = ban3ID;
    }

    public String getBan4() {
        return ban4;
    }

    public void setBan4(String ban4) {
        this.ban4 = ban4;
    }

    public String getBan4ID() {
        return ban4ID;
    }

    public void setBan4ID(String ban4ID) {
        this.ban4ID = ban4ID;
    }

    public String getBan5() {
        return ban5;
    }

    public void setBan5(String ban5) {
        this.ban5 = ban5;
    }

    public String getBan5ID() {
        return ban5ID;
    }

    public void setBan5ID(String ban5ID) {
        this.ban5ID = ban5ID;
    }

    public String getBan6() {
        return ban6;
    }

    public void setBan6(String ban6) {
        this.ban6 = ban6;
    }

    public String getBan6ID() {
        return ban6ID;
    }

    public void setBan6ID(String ban6ID) {
        this.ban6ID = ban6ID;
    }

    public String getBan7() {
        return ban7;
    }

    public void setBan7(String ban7) {
        this.ban7 = ban7;
    }

    public String getBan7ID() {
        return ban7ID;
    }

    public void setBan7ID(String ban7ID) {
        this.ban7ID = ban7ID;
    }

    public String getBan8() {
        return ban8;
    }

    public void setBan8(String ban8) {
        this.ban8 = ban8;
    }

    public String getBan8ID() {
        return ban8ID;
    }

    public void setBan8ID(String ban8ID) {
        this.ban8ID = ban8ID;
    }

    public String getBan9() {
        return ban9;
    }

    public void setBan9(String ban9) {
        this.ban9 = ban9;
    }

    public String getBan9ID() {
        return ban9ID;
    }

    public void setBan9ID(String ban9ID) {
        this.ban9ID = ban9ID;
    }

    public String getBan10() {
        return ban10;
    }

    public void setBan10(String ban10) {
        this.ban10 = ban10;
    }

    public String getBan10ID() {
        return ban10ID;
    }

    public void setBan10ID(String ban10ID) {
        this.ban10ID = ban10ID;
    }

    public Integer getCreeps() {
        return creeps;
    }

    public void setCreeps(Integer creeps) {
        this.creeps = creeps;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public Integer getMinionDamage() {
        return minionDamage;
    }

    public void setMinionDamage(Integer minionDamage) {
        this.minionDamage = minionDamage;
    }

    public Integer getBasicAttackDamage() {
        return basicAttackDamage;
    }

    public void setBasicAttackDamage(Integer basicAttackDamage) {
        this.basicAttackDamage = basicAttackDamage;
    }

    public Integer getDamageMitigated() {
        return damageMitigated;
    }

    public void setDamageMitigated(Integer damageMitigated) {
        this.damageMitigated = damageMitigated;
    }

    public Integer getStructureDamage() {
        return structureDamage;
    }

    public void setStructureDamage(Integer structureDamage) {
        this.structureDamage = structureDamage;
    }

    public Integer getDamageTakenTotal() {
        return damageTakenTotal;
    }

    public void setDamageTakenTotal(Integer damageTakenTotal) {
        this.damageTakenTotal = damageTakenTotal;
    }

    public Integer getMagicalDamageTaken() {
        return magicalDamageTaken;
    }

    public void setMagicalDamageTaken(Integer magicalDamageTaken) {
        this.magicalDamageTaken = magicalDamageTaken;
    }

    public Integer getPhysicalDamageTaken() {
        return physicalDamageTaken;
    }

    public void setPhysicalDamageTaken(Integer physicalDamageTaken) {
        this.physicalDamageTaken = physicalDamageTaken;
    }

    public Integer getDeaths() {
        return deaths;
    }

    public void setDeaths(Integer deaths) {
        this.deaths = deaths;
    }

    public Integer getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(Integer distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public String getFirstBans() {
        return firstBans;
    }

    public void setFirstBans(String firstBans) {
        this.firstBans = firstBans;
    }

    public String getGodPlayed() {
        return godPlayed;
    }

    public void setGodPlayed(String godPlayed) {
        this.godPlayed = godPlayed;
    }

    public Integer getGodID() {
        return godID;
    }

    public void setGodID(Integer godID) {
        this.godID = godID;
    }

    public Integer getGold() {
        return gold;
    }

    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public Integer getHealingDone() {
        return healingDone;
    }

    public void setHealingDone(Integer healingDone) {
        this.healingDone = healingDone;
    }

    public Integer getMinionHealing() {
        return minionHealing;
    }

    public void setMinionHealing(Integer minionHealing) {
        this.minionHealing = minionHealing;
    }

    public Integer getSelfHealing() {
        return selfHealing;
    }

    public void setSelfHealing(Integer selfHealing) {
        this.selfHealing = selfHealing;
    }

    public Integer getItemID1() {
        return itemID1;
    }

    public void setItemID1(Integer itemID1) {
        this.itemID1 = itemID1;
    }

    public String getItem1() {
        return item1;
    }

    public void setItem1(String item1) {
        this.item1 = item1;
    }

    public Integer getItemId2() {
        return itemId2;
    }

    public void setItemId2(Integer itemId2) {
        this.itemId2 = itemId2;
    }

    public String getItem2() {
        return item2;
    }

    public void setItem2(String item2) {
        this.item2 = item2;
    }

    public Integer getItemId3() {
        return itemId3;
    }

    public void setItemId3(Integer itemId3) {
        this.itemId3 = itemId3;
    }

    public String getItem3() {
        return item3;
    }

    public void setItem3(String item3) {
        this.item3 = item3;
    }

    public Integer getItemId4() {
        return itemId4;
    }

    public void setItemId4(Integer itemId4) {
        this.itemId4 = itemId4;
    }

    public String getItem4() {
        return item4;
    }

    public void setItem4(String item4) {
        this.item4 = item4;
    }

    public Integer getItemId5() {
        return itemId5;
    }

    public void setItemId5(Integer itemId5) {
        this.itemId5 = itemId5;
    }

    public String getItem5() {
        return item5;
    }

    public void setItem5(String item5) {
        this.item5 = item5;
    }

    public Integer getItemId6() {
        return itemId6;
    }

    public void setItemId6(Integer itemId6) {
        this.itemId6 = itemId6;
    }

    public String getItem6() {
        return item6;
    }

    public void setItem6(String item6) {
        this.item6 = item6;
    }

    public Integer getKillingSpree() {
        return killingSpree;
    }

    public void setKillingSpree(Integer killingSpree) {
        this.killingSpree = killingSpree;
    }

    public Integer getKills() {
        return kills;
    }

    public void setKills(Integer kills) {
        this.kills = kills;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }

    public Integer getMatchNumber() {
        return matchNumber;
    }

    public void setMatchNumber(Integer matchNumber) {
        this.matchNumber = matchNumber;
    }

    public Integer getMatchQueueID() {
        return matchQueueID;
    }

    public void setMatchQueueID(Integer matchQueueID) {
        this.matchQueueID = matchQueueID;
    }

    public String getMatchTime() {
        return matchTime;
    }

    public void setMatchTime(String matchTime) {
        this.matchTime = matchTime;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getMaxMultiKills() {
        return maxMultiKills;
    }

    public void setMaxMultiKills(Integer maxMultiKills) {
        this.maxMultiKills = maxMultiKills;
    }

    public Integer getObjectiveAssists() {
        return objectiveAssists;
    }

    public void setObjectiveAssists(Integer objectiveAssists) {
        this.objectiveAssists = objectiveAssists;
    }

    public String getQueue() {
        return Queue;
    }

    public void setQueue(String queue) {
        Queue = queue;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSkin() {
        return skin;
    }

    public void setSkin(String skin) {
        this.skin = skin;
    }

    public Integer getSkinID() {
        return skinID;
    }

    public void setSkinID(Integer skinID) {
        this.skinID = skinID;
    }

    public Integer getSurrendered() {
        return surrendered;
    }

    public void setSurrendered(Integer surrendered) {
        this.surrendered = surrendered;
    }

    public Integer getSideSelection() {
        return sideSelection;
    }

    public void setSideSelection(Integer sideSelection) {
        this.sideSelection = sideSelection;
    }

    public Integer getTeam1Score() {
        return team1Score;
    }

    public void setTeam1Score(Integer team1Score) {
        this.team1Score = team1Score;
    }

    public Integer getTeam2Score() {
        return team2Score;
    }

    public void setTeam2Score(Integer team2Score) {
        this.team2Score = team2Score;
    }

    public Integer getMatchTimeSeconds() {
        return matchTimeSeconds;
    }

    public void setMatchTimeSeconds(Integer matchTimeSeconds) {
        this.matchTimeSeconds = matchTimeSeconds;
    }

    public Integer getWardsPlaced() {
        return wardsPlaced;
    }

    public void setWardsPlaced(Integer wardsPlaced) {
        this.wardsPlaced = wardsPlaced;
    }

    public String getMatchResult() {
        return matchResult;
    }

    public void setMatchResult(String matchResult) {
        this.matchResult = matchResult;
    }

    public Integer getWinningSideSelection() {
        return winningSideSelection;
    }

    public void setWinningSideSelection(Integer winningSideSelection) {
        this.winningSideSelection = winningSideSelection;
    }

    public Integer getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Integer playerID) {
        this.playerID = playerID;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    @Override
    public String toString() {
        return "PlayerMatchHistory{" +
                "playerName='" + playerName + '\'' +
                ", activeItemID1=" + activeItemID1 +
                ", activeItemID2=" + activeItemID2 +
                ", activeItemName1='" + activeItemName1 + '\'' +
                ", activeItemName2='" + activeItemName2 + '\'' +
                ", assists=" + assists +
                ", ban1='" + ban1 + '\'' +
                ", ban1ID='" + ban1ID + '\'' +
                ", ban2='" + ban2 + '\'' +
                ", ban2ID='" + ban2ID + '\'' +
                ", ban3='" + ban3 + '\'' +
                ", ban3ID='" + ban3ID + '\'' +
                ", ban4='" + ban4 + '\'' +
                ", ban4ID='" + ban4ID + '\'' +
                ", ban5='" + ban5 + '\'' +
                ", ban5ID='" + ban5ID + '\'' +
                ", ban6='" + ban6 + '\'' +
                ", ban6ID='" + ban6ID + '\'' +
                ", ban7='" + ban7 + '\'' +
                ", ban7ID='" + ban7ID + '\'' +
                ", ban8='" + ban8 + '\'' +
                ", ban8ID='" + ban8ID + '\'' +
                ", ban9='" + ban9 + '\'' +
                ", ban9ID='" + ban9ID + '\'' +
                ", ban10='" + ban10 + '\'' +
                ", ban10ID='" + ban10ID + '\'' +
                ", creeps=" + creeps +
                ", damage=" + damage +
                ", minionDamage=" + minionDamage +
                ", basicAttackDamage=" + basicAttackDamage +
                ", damageMitigated=" + damageMitigated +
                ", structureDamage=" + structureDamage +
                ", damageTakenTotal=" + damageTakenTotal +
                ", magicalDamageTaken=" + magicalDamageTaken +
                ", physicalDamageTaken=" + physicalDamageTaken +
                ", deaths=" + deaths +
                ", distanceTraveled=" + distanceTraveled +
                ", firstBans='" + firstBans + '\'' +
                ", godPlayed='" + godPlayed + '\'' +
                ", godID=" + godID +
                ", gold=" + gold +
                ", healingDone=" + healingDone +
                ", minionHealing=" + minionHealing +
                ", selfHealing=" + selfHealing +
                ", itemID1=" + itemID1 +
                ", item1='" + item1 + '\'' +
                ", itemId2=" + itemId2 +
                ", item2='" + item2 + '\'' +
                ", itemId3=" + itemId3 +
                ", item3='" + item3 + '\'' +
                ", itemId4=" + itemId4 +
                ", item4='" + item4 + '\'' +
                ", itemId5=" + itemId5 +
                ", item5='" + item5 + '\'' +
                ", itemId6=" + itemId6 +
                ", item6='" + item6 + '\'' +
                ", killingSpree=" + killingSpree +
                ", kills=" + kills +
                ", level=" + level +
                ", gameMode='" + gameMode + '\'' +
                ", matchNumber=" + matchNumber +
                ", matchQueueID=" + matchQueueID +
                ", matchTime='" + matchTime + '\'' +
                ", minutes=" + minutes +
                ", maxMultiKills=" + maxMultiKills +
                ", objectiveAssists=" + objectiveAssists +
                ", Queue='" + Queue + '\'' +
                ", region='" + region + '\'' +
                ", skin='" + skin + '\'' +
                ", skinID=" + skinID +
                ", surrendered=" + surrendered +
                ", sideSelection=" + sideSelection +
                ", team1Score=" + team1Score +
                ", team2Score=" + team2Score +
                ", matchTimeSeconds=" + matchTimeSeconds +
                ", wardsPlaced=" + wardsPlaced +
                ", matchResult='" + matchResult + '\'' +
                ", winningSideSelection=" + winningSideSelection +
                ", playerID=" + playerID +
                '}';
    }
}
