package com.astro.smitebasic.objects.player.matches;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PlayerMatchData {

    @JsonProperty("Account_Level")
    private Integer accountLevel;

    @JsonProperty("ActiveId1")
    private Integer activeId1;

    @JsonProperty("ActiveId2")
    private Integer activeId2;

    @JsonProperty("ActiveId3")
    private Integer activeId3;

    @JsonProperty("ActiveId4")
    private Integer activeId4;

    @JsonProperty("ActivePlayerId")
    private Integer activePlayerID;

    @JsonProperty("Assists")
    private Integer assists;

    @JsonProperty("Ban1")
    private String ban1;

    @JsonProperty("Ban1Id")
    private Integer ban1ID;

    @JsonProperty("Ban2")
    private String ban2;

    @JsonProperty("Ban3Id")
    private Integer ban3ID;

    @JsonProperty("Ban4")
    private String ban4;

    @JsonProperty("Ban4Id")
    private Integer ban4ID;

    @JsonProperty("Ban5")
    private String ban5;

    @JsonProperty("Ban5Id")
    private Integer ban5ID;

    @JsonProperty("Ban6")
    private String ban6;

    @JsonProperty("Ban6Id")
    private Integer ban6ID;

    @JsonProperty("Ban7")
    private String ban7;

    @JsonProperty("Ban7Id")
    private Integer ban7ID;

    @JsonProperty("Ban8")
    private String ban8;

    @JsonProperty("Ban8Id")
    private Integer ban8ID;

    @JsonProperty("Ban9")
    private String ban9;

    @JsonProperty("Ban9Id")
    private Integer ban9ID;

    @JsonProperty("Ban10")
    private String ban10;

    @JsonProperty("Ban10Id")
    private Integer ban10ID;

    @JsonProperty("Camps_Cleared")
    private Integer campsCleared;

    @JsonProperty("Conquest_Losses")
    private Integer conquestLosses;

    @JsonProperty("Conquest_Points")
    private Integer conquestPoints;

    @JsonProperty("Conquest_Tier")
    private Integer conquestTier;

    @JsonProperty("Conquest_Wins")
    private Integer conquestWins;

    @JsonProperty("Damage_Bot")
    private Integer minionDamage;

    @JsonProperty("Damage_Done_In_Hand")
    private Integer basicAttackDamage;

    @JsonProperty("Damage_Done_Magical")
    private Integer magicalDamageDone;

    @JsonProperty("Damage_Done_Physical")
    private Integer physicalDamageDone;

    @JsonProperty("Damage_Mitigated")
    private Integer damageMitigated;

    @JsonProperty("Damage_Player")
    private Integer damagePlayer;

    @JsonProperty("Damage_Taken")
    private Integer damageTaken;

    @JsonProperty("Damage_Taken_Magical")
    private Integer damageTakenMagical;

    @JsonProperty("Damage_Taken_Physical")
    private Integer damageTakenPhysical;

    @JsonProperty("Deaths")
    private Integer deaths;

    @JsonProperty("Distance_Traveled")
    private Integer distanceTraveled;

    @JsonProperty("Duel_Losses")
    private Integer duelLosses;

    @JsonProperty("Duel_Points")
    private Integer duelPoints;

    @JsonProperty("Duel_Tier")
    private Integer duelTier;

    @JsonProperty("Duel_Wins")
    private Integer duelWins;

    @JsonProperty("Entry_Datetime")
    private String entryDatetime;

    @JsonProperty("Final_Match_Level")
    private Integer finalMatchLevel;

    @JsonProperty("First_Ban_Side")
    private String firstBanSide;

    @JsonProperty("GodId")
    private Integer godID;

    @JsonProperty("Gold_Earned")
    private Integer goldEarned;

    @JsonProperty("Gold_Per_Minute")
    private Integer goldPerMinute;

    @JsonProperty("Healing")
    private Integer healing;

    @JsonProperty("Healing_Bot")
    private Integer minionHealing;

    @JsonProperty("Healing_Player_Self")
    private Integer healingPlayerSelf;

    @JsonProperty("ItemId1")
    private Integer itemID1;

    @JsonProperty("ItemId2")
    private Integer itemID2;

    @JsonProperty("ItemId3")
    private Integer itemID3;

    @JsonProperty("ItemId4")
    private Integer itemID4;

    @JsonProperty("ItemId5")
    private Integer itemID5;

    @JsonProperty("ItemId6")
    private Integer itemID6;

    @JsonProperty("Item_Active_1")
    private String itemActive1;

    @JsonProperty("Item_Active_2")
    private String itemActive2;

    @JsonProperty("Item_Active_3")
    private String itemActive3;

    @JsonProperty("Item_Active_4")
    private String itemActive4;

    @JsonProperty("Item_Purch_1")
    private String itemPurch1;

    @JsonProperty("Item_Purch_2")
    private String itemPurch2;

    @JsonProperty("Item_Purch_3")
    private String itemPurch3;

    @JsonProperty("Item_Purch_4")
    private String itemPurch4;

    @JsonProperty("Item_Purch_5")
    private String itemPurch5;

    @JsonProperty("Item_Purch_6")
    private String itemPurch6;

    @JsonProperty("Joust_Losses")
    private Integer joustLosses;

    @JsonProperty("Joust_Points")
    private Integer joustPoints;

    @JsonProperty("Joust_Tier")
    private Integer joustTier;

    @JsonProperty("Joust_Wins")
    private Integer joustWins;

    @JsonProperty("Killing_Spree")
    private Integer killingSpree;

    @JsonProperty("Kills_Bot")
    private Integer killsBot;

    @JsonProperty("Kills_Double")
    private Integer killsDouble;

    @JsonProperty("Kills_Fire_Giant")
    private Integer killsFireGiant;

    @JsonProperty("Kills_First_Blood")
    private Integer killsFirstBlood;

    @JsonProperty("Kills_Gold_Fury")
    private Integer killsGoldFury;

    @JsonProperty("Kills_Penta")
    private Integer killsPenta;

    @JsonProperty("Kills_Phoenix")
    private Integer killsPhoenix;

    @JsonProperty("Kills_Player")
    private Integer killsPlayer;

    @JsonProperty("Kills_Quadra")
    private Integer killsQuadra;

    @JsonProperty("Kills_Siege_Juggernaut")
    private Integer killsSiegeJuggernaut;

    @JsonProperty("Kills_Single")
    private Integer killsSingle;

    @JsonProperty("Kills_Triple")
    private Integer killsTriple;

    @JsonProperty("Kills_Wild_Juggernaut")
    private Integer killsWildJuggernaut;

    @JsonProperty("Map_Game")
    private String mapGame;

    @JsonProperty("Mastery_Level")
    private Integer masteryLevel;

    @JsonProperty("Match")
    private Integer match;

    @JsonProperty("Match_Duration")
    private Integer matchDuration;

    @JsonProperty("MergedPlayers")
    private List<MergedPlayers> mergedPlayers;

    @JsonProperty("Minutes")
    private Integer minutes;

    @JsonProperty("Multi_kill_Max")
    private Integer multiKillMax;

    @JsonProperty("Objective_Assists")
    private Integer objectiveAssists;

    @JsonProperty("PartyId")
    private Integer partyID;

    @JsonProperty("Rank_Stat_Conquest")
    private Float rankStatConquest;

    @JsonProperty("Rank_Stat_Duel")
    private Float rankStatDuel;

    @JsonProperty("Rank_Stat_Joust")
    private Float rankStatJoust;

    @JsonProperty("Reference_Name")
    private String referenceName;

    @JsonProperty("Region")
    private String region;

    @JsonProperty("Skin")
    private String skin;

    @JsonProperty("SkinId")
    private Integer skinID;

    @JsonProperty("Structure_Damage")
    private Integer structureDamage;

    @JsonProperty("Surrendered")
    private Integer surrendered;

    @JsonProperty("TaskForce")
    private Integer sideSelection;

    @JsonProperty("Team1Score")
    private Integer team1Score;

    @JsonProperty("Team2Score")
    private Integer team2Score;

    @JsonProperty("TeamId")
    private Integer teamID;

    @JsonProperty("Team_Name")
    private String teamName;

    @JsonProperty("Time_Dead_Seconds")
    private Integer timeDeadSeconds;

    @JsonProperty("Time_In_Match_Seconds")
    private Integer timeInMatchSeconds;

    @JsonProperty("Towers_Destroyed")
    private Integer towersDestroyed;

    @JsonProperty("Wards_Placed")
    private Integer wardsPlaced;

    @JsonProperty("Win_Status")
    private String winStatus;

    @JsonProperty("Winning_TaskForce")
    private Integer winningSide;

    @JsonProperty("hasReplay")
    private Boolean hasReplay;

    @JsonProperty("hz_gamer_tag")
    private String hzGamerTag;

    @JsonProperty("hz_player_name")
    private String hzPlayerName;

    @JsonProperty("match_queue_id")
    private Integer matchQueueID;

    @JsonProperty("name")
    private String name;

    @JsonProperty("playerId")
    private Integer playerID;

    @JsonProperty("playerName")
    private String playerName;

    @JsonProperty("playerPortalId")
    private Float playerPortalID;

    @JsonProperty("playerPortalUserId")
    private Float playerPortalUserID;

    @JsonProperty("ret_msg")
    private String ret_msg;

    public Integer getAccountLevel() {
        return accountLevel;
    }

    public void setAccountLevel(Integer accountLevel) {
        this.accountLevel = accountLevel;
    }

    public Integer getActiveId1() {
        return activeId1;
    }

    public void setActiveId1(Integer activeId1) {
        this.activeId1 = activeId1;
    }

    public Integer getActiveId2() {
        return activeId2;
    }

    public void setActiveId2(Integer activeId2) {
        this.activeId2 = activeId2;
    }

    public Integer getActiveId3() {
        return activeId3;
    }

    public void setActiveId3(Integer activeId3) {
        this.activeId3 = activeId3;
    }

    public Integer getActiveId4() {
        return activeId4;
    }

    public void setActiveId4(Integer activeId4) {
        this.activeId4 = activeId4;
    }

    public Integer getActivePlayerID() {
        return activePlayerID;
    }

    public void setActivePlayerID(Integer activePlayerID) {
        this.activePlayerID = activePlayerID;
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

    public Integer getBan1ID() {
        return ban1ID;
    }

    public void setBan1ID(Integer ban1ID) {
        this.ban1ID = ban1ID;
    }

    public String getBan2() {
        return ban2;
    }

    public void setBan2(String ban2) {
        this.ban2 = ban2;
    }

    public Integer getBan3ID() {
        return ban3ID;
    }

    public void setBan3ID(Integer ban3ID) {
        this.ban3ID = ban3ID;
    }

    public String getBan4() {
        return ban4;
    }

    public void setBan4(String ban4) {
        this.ban4 = ban4;
    }

    public Integer getBan4ID() {
        return ban4ID;
    }

    public void setBan4ID(Integer ban4ID) {
        this.ban4ID = ban4ID;
    }

    public String getBan5() {
        return ban5;
    }

    public void setBan5(String ban5) {
        this.ban5 = ban5;
    }

    public Integer getBan5ID() {
        return ban5ID;
    }

    public void setBan5ID(Integer ban5ID) {
        this.ban5ID = ban5ID;
    }

    public String getBan6() {
        return ban6;
    }

    public void setBan6(String ban6) {
        this.ban6 = ban6;
    }

    public Integer getBan6ID() {
        return ban6ID;
    }

    public void setBan6ID(Integer ban6ID) {
        this.ban6ID = ban6ID;
    }

    public String getBan7() {
        return ban7;
    }

    public void setBan7(String ban7) {
        this.ban7 = ban7;
    }

    public Integer getBan7ID() {
        return ban7ID;
    }

    public void setBan7ID(Integer ban7ID) {
        this.ban7ID = ban7ID;
    }

    public String getBan8() {
        return ban8;
    }

    public void setBan8(String ban8) {
        this.ban8 = ban8;
    }

    public Integer getBan8ID() {
        return ban8ID;
    }

    public void setBan8ID(Integer ban8ID) {
        this.ban8ID = ban8ID;
    }

    public String getBan9() {
        return ban9;
    }

    public void setBan9(String ban9) {
        this.ban9 = ban9;
    }

    public Integer getBan9ID() {
        return ban9ID;
    }

    public void setBan9ID(Integer ban9ID) {
        this.ban9ID = ban9ID;
    }

    public String getBan10() {
        return ban10;
    }

    public void setBan10(String ban10) {
        this.ban10 = ban10;
    }

    public Integer getBan10ID() {
        return ban10ID;
    }

    public void setBan10ID(Integer ban10ID) {
        this.ban10ID = ban10ID;
    }

    public Integer getCampsCleared() {
        return campsCleared;
    }

    public void setCampsCleared(Integer campsCleared) {
        this.campsCleared = campsCleared;
    }

    public Integer getConquestLosses() {
        return conquestLosses;
    }

    public void setConquestLosses(Integer conquestLosses) {
        this.conquestLosses = conquestLosses;
    }

    public Integer getConquestPoints() {
        return conquestPoints;
    }

    public void setConquestPoints(Integer conquestPoints) {
        this.conquestPoints = conquestPoints;
    }

    public Integer getConquestTier() {
        return conquestTier;
    }

    public void setConquestTier(Integer conquestTier) {
        this.conquestTier = conquestTier;
    }

    public Integer getConquestWins() {
        return conquestWins;
    }

    public void setConquestWins(Integer conquestWins) {
        this.conquestWins = conquestWins;
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

    public Integer getMagicalDamageDone() {
        return magicalDamageDone;
    }

    public void setMagicalDamageDone(Integer magicalDamageDone) {
        this.magicalDamageDone = magicalDamageDone;
    }

    public Integer getPhysicalDamageDone() {
        return physicalDamageDone;
    }

    public void setPhysicalDamageDone(Integer physicalDamageDone) {
        this.physicalDamageDone = physicalDamageDone;
    }

    public Integer getDamageMitigated() {
        return damageMitigated;
    }

    public void setDamageMitigated(Integer damageMitigated) {
        this.damageMitigated = damageMitigated;
    }

    public Integer getDamagePlayer() {
        return damagePlayer;
    }

    public void setDamagePlayer(Integer damagePlayer) {
        this.damagePlayer = damagePlayer;
    }

    public Integer getDamageTaken() {
        return damageTaken;
    }

    public void setDamageTaken(Integer damageTaken) {
        this.damageTaken = damageTaken;
    }

    public Integer getDamageTakenMagical() {
        return damageTakenMagical;
    }

    public void setDamageTakenMagical(Integer damageTakenMagical) {
        this.damageTakenMagical = damageTakenMagical;
    }

    public Integer getDamageTakenPhysical() {
        return damageTakenPhysical;
    }

    public void setDamageTakenPhysical(Integer damageTakenPhysical) {
        this.damageTakenPhysical = damageTakenPhysical;
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

    public Integer getDuelLosses() {
        return duelLosses;
    }

    public void setDuelLosses(Integer duelLosses) {
        this.duelLosses = duelLosses;
    }

    public Integer getDuelPoints() {
        return duelPoints;
    }

    public void setDuelPoints(Integer duelPoints) {
        this.duelPoints = duelPoints;
    }

    public Integer getDuelTier() {
        return duelTier;
    }

    public void setDuelTier(Integer duelTier) {
        this.duelTier = duelTier;
    }

    public Integer getDuelWins() {
        return duelWins;
    }

    public void setDuelWins(Integer duelWins) {
        this.duelWins = duelWins;
    }

    public String getEntryDatetime() {
        return entryDatetime;
    }

    public void setEntryDatetime(String entryDatetime) {
        this.entryDatetime = entryDatetime;
    }

    public Integer getFinalMatchLevel() {
        return finalMatchLevel;
    }

    public void setFinalMatchLevel(Integer finalMatchLevel) {
        this.finalMatchLevel = finalMatchLevel;
    }

    public String getFirstBanSide() {
        return firstBanSide;
    }

    public void setFirstBanSide(String firstBanSide) {
        this.firstBanSide = firstBanSide;
    }

    public Integer getGodID() {
        return godID;
    }

    public void setGodID(Integer godID) {
        this.godID = godID;
    }

    public Integer getGoldEarned() {
        return goldEarned;
    }

    public void setGoldEarned(Integer goldEarned) {
        this.goldEarned = goldEarned;
    }

    public Integer getGoldPerMinute() {
        return goldPerMinute;
    }

    public void setGoldPerMinute(Integer goldPerMinute) {
        this.goldPerMinute = goldPerMinute;
    }

    public Integer getHealing() {
        return healing;
    }

    public void setHealing(Integer healing) {
        this.healing = healing;
    }

    public Integer getMinionHealing() {
        return minionHealing;
    }

    public void setMinionHealing(Integer minionHealing) {
        this.minionHealing = minionHealing;
    }

    public Integer getHealingPlayerSelf() {
        return healingPlayerSelf;
    }

    public void setHealingPlayerSelf(Integer healingPlayerSelf) {
        this.healingPlayerSelf = healingPlayerSelf;
    }

    public Integer getItemID1() {
        return itemID1;
    }

    public void setItemID1(Integer itemID1) {
        this.itemID1 = itemID1;
    }

    public Integer getItemID2() {
        return itemID2;
    }

    public void setItemID2(Integer itemID2) {
        this.itemID2 = itemID2;
    }

    public Integer getItemID3() {
        return itemID3;
    }

    public void setItemID3(Integer itemID3) {
        this.itemID3 = itemID3;
    }

    public Integer getItemID4() {
        return itemID4;
    }

    public void setItemID4(Integer itemID4) {
        this.itemID4 = itemID4;
    }

    public Integer getItemID5() {
        return itemID5;
    }

    public void setItemID5(Integer itemID5) {
        this.itemID5 = itemID5;
    }

    public Integer getItemID6() {
        return itemID6;
    }

    public void setItemID6(Integer itemID6) {
        this.itemID6 = itemID6;
    }

    public String getItemActive1() {
        return itemActive1;
    }

    public void setItemActive1(String itemActive1) {
        this.itemActive1 = itemActive1;
    }

    public String getItemActive2() {
        return itemActive2;
    }

    public void setItemActive2(String itemActive2) {
        this.itemActive2 = itemActive2;
    }

    public String getItemActive3() {
        return itemActive3;
    }

    public void setItemActive3(String itemActive3) {
        this.itemActive3 = itemActive3;
    }

    public String getItemActive4() {
        return itemActive4;
    }

    public void setItemActive4(String itemActive4) {
        this.itemActive4 = itemActive4;
    }

    public String getItemPurch1() {
        return itemPurch1;
    }

    public void setItemPurch1(String itemPurch1) {
        this.itemPurch1 = itemPurch1;
    }

    public String getItemPurch2() {
        return itemPurch2;
    }

    public void setItemPurch2(String itemPurch2) {
        this.itemPurch2 = itemPurch2;
    }

    public String getItemPurch3() {
        return itemPurch3;
    }

    public void setItemPurch3(String itemPurch3) {
        this.itemPurch3 = itemPurch3;
    }

    public String getItemPurch4() {
        return itemPurch4;
    }

    public void setItemPurch4(String itemPurch4) {
        this.itemPurch4 = itemPurch4;
    }

    public String getItemPurch5() {
        return itemPurch5;
    }

    public void setItemPurch5(String itemPurch5) {
        this.itemPurch5 = itemPurch5;
    }

    public String getItemPurch6() {
        return itemPurch6;
    }

    public void setItemPurch6(String itemPurch6) {
        this.itemPurch6 = itemPurch6;
    }

    public Integer getJoustLosses() {
        return joustLosses;
    }

    public void setJoustLosses(Integer joustLosses) {
        this.joustLosses = joustLosses;
    }

    public Integer getJoustPoints() {
        return joustPoints;
    }

    public void setJoustPoints(Integer joustPoints) {
        this.joustPoints = joustPoints;
    }

    public Integer getJoustTier() {
        return joustTier;
    }

    public void setJoustTier(Integer joustTier) {
        this.joustTier = joustTier;
    }

    public Integer getJoustWins() {
        return joustWins;
    }

    public void setJoustWins(Integer joustWins) {
        this.joustWins = joustWins;
    }

    public Integer getKillingSpree() {
        return killingSpree;
    }

    public void setKillingSpree(Integer killingSpree) {
        this.killingSpree = killingSpree;
    }

    public Integer getKillsBot() {
        return killsBot;
    }

    public void setKillsBot(Integer killsBot) {
        this.killsBot = killsBot;
    }

    public Integer getKillsDouble() {
        return killsDouble;
    }

    public void setKillsDouble(Integer killsDouble) {
        this.killsDouble = killsDouble;
    }

    public Integer getKillsFireGiant() {
        return killsFireGiant;
    }

    public void setKillsFireGiant(Integer killsFireGiant) {
        this.killsFireGiant = killsFireGiant;
    }

    public Integer getKillsFirstBlood() {
        return killsFirstBlood;
    }

    public void setKillsFirstBlood(Integer killsFirstBlood) {
        this.killsFirstBlood = killsFirstBlood;
    }

    public Integer getKillsGoldFury() {
        return killsGoldFury;
    }

    public void setKillsGoldFury(Integer killsGoldFury) {
        this.killsGoldFury = killsGoldFury;
    }

    public Integer getKillsPenta() {
        return killsPenta;
    }

    public void setKillsPenta(Integer killsPenta) {
        this.killsPenta = killsPenta;
    }

    public Integer getKillsPhoenix() {
        return killsPhoenix;
    }

    public void setKillsPhoenix(Integer killsPhoenix) {
        this.killsPhoenix = killsPhoenix;
    }

    public Integer getKillsPlayer() {
        return killsPlayer;
    }

    public void setKillsPlayer(Integer killsPlayer) {
        this.killsPlayer = killsPlayer;
    }

    public Integer getKillsQuadra() {
        return killsQuadra;
    }

    public void setKillsQuadra(Integer killsQuadra) {
        this.killsQuadra = killsQuadra;
    }

    public Integer getKillsSiegeJuggernaut() {
        return killsSiegeJuggernaut;
    }

    public void setKillsSiegeJuggernaut(Integer killsSiegeJuggernaut) {
        this.killsSiegeJuggernaut = killsSiegeJuggernaut;
    }

    public Integer getKillsSingle() {
        return killsSingle;
    }

    public void setKillsSingle(Integer killsSingle) {
        this.killsSingle = killsSingle;
    }

    public Integer getKillsTriple() {
        return killsTriple;
    }

    public void setKillsTriple(Integer killsTriple) {
        this.killsTriple = killsTriple;
    }

    public Integer getKillsWildJuggernaut() {
        return killsWildJuggernaut;
    }

    public void setKillsWildJuggernaut(Integer killsWildJuggernaut) {
        this.killsWildJuggernaut = killsWildJuggernaut;
    }

    public String getMapGame() {
        return mapGame;
    }

    public void setMapGame(String mapGame) {
        this.mapGame = mapGame;
    }

    public Integer getMasteryLevel() {
        return masteryLevel;
    }

    public void setMasteryLevel(Integer masteryLevel) {
        this.masteryLevel = masteryLevel;
    }

    public Integer getMatch() {
        return match;
    }

    public void setMatch(Integer match) {
        this.match = match;
    }

    public Integer getMatchDuration() {
        return matchDuration;
    }

    public void setMatchDuration(Integer matchDuration) {
        this.matchDuration = matchDuration;
    }

    public List<MergedPlayers> getMergedPlayers() {
        return mergedPlayers;
    }

    public void setMergedPlayers(List<MergedPlayers> mergedPlayers) {
        this.mergedPlayers = mergedPlayers;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Integer getMultiKillMax() {
        return multiKillMax;
    }

    public void setMultiKillMax(Integer multiKillMax) {
        this.multiKillMax = multiKillMax;
    }

    public Integer getObjectiveAssists() {
        return objectiveAssists;
    }

    public void setObjectiveAssists(Integer objectiveAssists) {
        this.objectiveAssists = objectiveAssists;
    }

    public Integer getPartyID() {
        return partyID;
    }

    public void setPartyID(Integer partyID) {
        this.partyID = partyID;
    }

    public Float getRankStatConquest() {
        return rankStatConquest;
    }

    public void setRankStatConquest(Float rankStatConquest) {
        this.rankStatConquest = rankStatConquest;
    }

    public Float getRankStatDuel() {
        return rankStatDuel;
    }

    public void setRankStatDuel(Float rankStatDuel) {
        this.rankStatDuel = rankStatDuel;
    }

    public Float getRankStatJoust() {
        return rankStatJoust;
    }

    public void setRankStatJoust(Float rankStatJoust) {
        this.rankStatJoust = rankStatJoust;
    }

    public String getReferenceName() {
        return referenceName;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
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

    public Integer getStructureDamage() {
        return structureDamage;
    }

    public void setStructureDamage(Integer structureDamage) {
        this.structureDamage = structureDamage;
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

    public Integer getTeamID() {
        return teamID;
    }

    public void setTeamID(Integer teamID) {
        this.teamID = teamID;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Integer getTimeDeadSeconds() {
        return timeDeadSeconds;
    }

    public void setTimeDeadSeconds(Integer timeDeadSeconds) {
        this.timeDeadSeconds = timeDeadSeconds;
    }

    public Integer getTimeInMatchSeconds() {
        return timeInMatchSeconds;
    }

    public void setTimeInMatchSeconds(Integer timeInMatchSeconds) {
        this.timeInMatchSeconds = timeInMatchSeconds;
    }

    public Integer getTowersDestroyed() {
        return towersDestroyed;
    }

    public void setTowersDestroyed(Integer towersDestroyed) {
        this.towersDestroyed = towersDestroyed;
    }

    public Integer getWardsPlaced() {
        return wardsPlaced;
    }

    public void setWardsPlaced(Integer wardsPlaced) {
        this.wardsPlaced = wardsPlaced;
    }

    public String getWinStatus() {
        return winStatus;
    }

    public void setWinStatus(String winStatus) {
        this.winStatus = winStatus;
    }

    public Integer getWinningSide() {
        return winningSide;
    }

    public void setWinningSide(Integer winningSide) {
        this.winningSide = winningSide;
    }

    public Boolean getHasReplay() {
        return hasReplay;
    }

    public void setHasReplay(String hasReplay) {
        this.hasReplay = hasReplay.equals("y");
    }

    public String getHzGamerTag() {
        return hzGamerTag;
    }

    public void setHzGamerTag(String hzGamerTag) {
        this.hzGamerTag = hzGamerTag;
    }

    public String getHzPlayerName() {
        return hzPlayerName;
    }

    public void setHzPlayerName(String hzPlayerName) {
        this.hzPlayerName = hzPlayerName;
    }

    public Integer getMatchQueueID() {
        return matchQueueID;
    }

    public void setMatchQueueID(Integer matchQueueID) {
        this.matchQueueID = matchQueueID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPlayerID() {
        return playerID;
    }

    public void setPlayerID(Integer playerID) {
        this.playerID = playerID;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Float getPlayerPortalID() {
        return playerPortalID;
    }

    public void setPlayerPortalID(Float playerPortalID) {
        this.playerPortalID = playerPortalID;
    }

    public Float getPlayerPortalUserID() {
        return playerPortalUserID;
    }

    public void setPlayerPortalUserID(Float playerPortalUserID) {
        this.playerPortalUserID = playerPortalUserID;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    @Override
    public String toString() {
        return "PlayerMatchData{" +
                "accountLevel=" + accountLevel +
                ", activeId1=" + activeId1 +
                ", activeId2=" + activeId2 +
                ", activeId3=" + activeId3 +
                ", activeId4=" + activeId4 +
                ", activePlayerID=" + activePlayerID +
                ", assists=" + assists +
                ", ban1='" + ban1 + '\'' +
                ", ban1ID=" + ban1ID +
                ", ban2='" + ban2 + '\'' +
                ", ban3ID=" + ban3ID +
                ", ban4='" + ban4 + '\'' +
                ", ban4ID=" + ban4ID +
                ", ban5='" + ban5 + '\'' +
                ", ban5ID=" + ban5ID +
                ", ban6='" + ban6 + '\'' +
                ", ban6ID=" + ban6ID +
                ", ban7='" + ban7 + '\'' +
                ", ban7ID=" + ban7ID +
                ", ban8='" + ban8 + '\'' +
                ", ban8ID=" + ban8ID +
                ", ban9='" + ban9 + '\'' +
                ", ban9ID=" + ban9ID +
                ", ban10='" + ban10 + '\'' +
                ", ban10ID=" + ban10ID +
                ", campsCleared=" + campsCleared +
                ", conquestLosses=" + conquestLosses +
                ", conquestPoints=" + conquestPoints +
                ", conquestTier=" + conquestTier +
                ", conquestWins=" + conquestWins +
                ", minionDamage=" + minionDamage +
                ", basicAttackDamage=" + basicAttackDamage +
                ", magicalDamageDone=" + magicalDamageDone +
                ", physicalDamageDone=" + physicalDamageDone +
                ", damageMitigated=" + damageMitigated +
                ", damagePlayer=" + damagePlayer +
                ", damageTaken=" + damageTaken +
                ", damageTakenMagical=" + damageTakenMagical +
                ", damageTakenPhysical=" + damageTakenPhysical +
                ", deaths=" + deaths +
                ", distanceTraveled=" + distanceTraveled +
                ", duelLosses=" + duelLosses +
                ", duelPoints=" + duelPoints +
                ", duelTier=" + duelTier +
                ", duelWins=" + duelWins +
                ", entryDatetime='" + entryDatetime + '\'' +
                ", finalMatchLevel=" + finalMatchLevel +
                ", firstBanSide='" + firstBanSide + '\'' +
                ", godID=" + godID +
                ", goldEarned=" + goldEarned +
                ", goldPerMinute=" + goldPerMinute +
                ", healing=" + healing +
                ", healingBot=" + minionHealing +
                ", healingPlayerSelf=" + healingPlayerSelf +
                ", itemID1=" + itemID1 +
                ", itemID2=" + itemID2 +
                ", itemID3=" + itemID3 +
                ", itemID4=" + itemID4 +
                ", itemID5=" + itemID5 +
                ", itemID6=" + itemID6 +
                ", itemActive1='" + itemActive1 + '\'' +
                ", itemActive2='" + itemActive2 + '\'' +
                ", itemActive3='" + itemActive3 + '\'' +
                ", itemActive4='" + itemActive4 + '\'' +
                ", itemPurch1='" + itemPurch1 + '\'' +
                ", itemPurch2='" + itemPurch2 + '\'' +
                ", itemPurch3='" + itemPurch3 + '\'' +
                ", itemPurch4='" + itemPurch4 + '\'' +
                ", itemPurch5='" + itemPurch5 + '\'' +
                ", itemPurch6='" + itemPurch6 + '\'' +
                ", joustLosses=" + joustLosses +
                ", joustPoints=" + joustPoints +
                ", joustTier=" + joustTier +
                ", joustWins=" + joustWins +
                ", killingSpree=" + killingSpree +
                ", killsBot=" + killsBot +
                ", killsDouble=" + killsDouble +
                ", killsFireGiant=" + killsFireGiant +
                ", killsFirstBlood=" + killsFirstBlood +
                ", killsGoldFury=" + killsGoldFury +
                ", killsPenta=" + killsPenta +
                ", killsPhoenix=" + killsPhoenix +
                ", killsPlayer=" + killsPlayer +
                ", killsQuadra=" + killsQuadra +
                ", killsSiegeJuggernaut=" + killsSiegeJuggernaut +
                ", killsSingle=" + killsSingle +
                ", killsTriple=" + killsTriple +
                ", killsWildJuggernaut=" + killsWildJuggernaut +
                ", mapGame='" + mapGame + '\'' +
                ", masteryLevel=" + masteryLevel +
                ", match=" + match +
                ", matchDuration=" + matchDuration +
                ", mergedPlayers=" + mergedPlayers +
                ", minutes=" + minutes +
                ", multiKillMax=" + multiKillMax +
                ", objectiveAssists=" + objectiveAssists +
                ", partyID=" + partyID +
                ", rankStatConquest=" + rankStatConquest +
                ", rankStatDuel=" + rankStatDuel +
                ", rankStatJoust=" + rankStatJoust +
                ", referenceName='" + referenceName + '\'' +
                ", region='" + region + '\'' +
                ", skin='" + skin + '\'' +
                ", skinID=" + skinID +
                ", structureDamage=" + structureDamage +
                ", surrendered=" + surrendered +
                ", taskForce=" + sideSelection +
                ", team1Score=" + team1Score +
                ", team2Score=" + team2Score +
                ", teamID=" + teamID +
                ", teamName='" + teamName + '\'' +
                ", timeDeadSeconds=" + timeDeadSeconds +
                ", timeInMatchSeconds=" + timeInMatchSeconds +
                ", towersDestroyed=" + towersDestroyed +
                ", wardsPlaced=" + wardsPlaced +
                ", winStatus='" + winStatus + '\'' +
                ", winningTaskForce=" + winningSide +
                ", hasReplay='" + hasReplay + '\'' +
                ", hzGamerTag='" + hzGamerTag + '\'' +
                ", hzPlayerName='" + hzPlayerName + '\'' +
                ", matchQueueID=" + matchQueueID +
                ", name='" + name + '\'' +
                ", playerID=" + playerID +
                ", playerName='" + playerName + '\'' +
                ", playerPortalID=" + playerPortalID +
                ", playerPortalUserID=" + playerPortalUserID +
                '}';
    }
}
