package com.astro.smitebasic.objects.characters;

import com.astro.smitebasic.objects.characters.auxiliary.Ability;
import com.astro.smitebasic.objects.characters.auxiliary.AbilityDescription;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class GodInfo {

    @JsonProperty("Ability1")
    private String ability1Name;

    @JsonProperty("Ability2")
    private String ability2Name;

    @JsonProperty("Ability3")
    private String ability3Name;

    @JsonProperty("Ability4")
    private String ability4Name;

    @JsonProperty("Ability5")
    private String ability5Name;

    @JsonProperty("AbilityId1")
    private Integer abilityId1;

    @JsonProperty("AbilityId2")
    private Integer abilityId2;

    @JsonProperty("AbilityId3")
    private Integer abilityId3;

    @JsonProperty("AbilityId4")
    private Integer abilityId4;

    @JsonProperty("AbilityId5")
    private Integer abilityId5;

    @JsonProperty("Ability_1")
    private AbilityDescription ability1;

    @JsonProperty("Ability_2")
    private AbilityDescription ability2;

    @JsonProperty("Ability_3")
    private AbilityDescription ability3;

    @JsonProperty("Ability_4")
    private AbilityDescription ability4;

    @JsonProperty("Ability_5")
    private AbilityDescription ability5;

    @JsonProperty("AttackSpeed")
    private Float attackSpeed;

    @JsonProperty("AttackSpeedPerLevel")
    private Float attackSpeedPerLevel;

    @JsonProperty("AutoBanned")
    private String autoBanned;

    @JsonProperty("Cons")
    private String cons;

    @JsonProperty("HP5PerLevel")
    private Float hp5PerLevel;

    @JsonProperty("Health")
    private Integer Health;

    @JsonProperty("HealthPerFive")
    private Integer healthPerFive;

    @JsonProperty("HealthPerLevel")
    private Integer healthPerLevel;

    @JsonProperty("Lore")
    private String lore;

    @JsonProperty("MP5PerLevel")
    private Float mp5PerLevel;

    @JsonProperty("MagicProtection")
    private Integer magicProtection;

    @JsonProperty("MagicProtectionPerLevel")
    private Float magicProtectionPerLevel;

    @JsonProperty("MagicalPower")
    private Integer magicalPower;

    @JsonProperty("MagicalPowerPerLevel")
    private Float magicalPowerPerLevel;

    @JsonProperty("Mana")
    private Integer mana;

    @JsonProperty("ManaPerFive")
    private Float manaPerFive;

    @JsonProperty("ManaPerLevel")
    private Integer manaPerLevel;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("OnFreeRotation")
    private String onFreeRotation;

    @JsonProperty("Pantheon")
    private String pantheon;

    @JsonProperty("PhysicalPower")
    private Integer physicalPower;

    @JsonProperty("PhysicalPowerPerLevel")
    private Float physicalPowerPerLevel;

    @JsonProperty("PhysicalProtection")
    private Integer physicalProtection;

    @JsonProperty("PhysicalProtectionPerLevel")
    private Float physicalProtectionPerLevel;

    @JsonProperty("Pros")
    private String pros;

    @JsonProperty("Roles")
    private String roles;

    @JsonProperty("Speed")
    private Integer speed;

    @JsonProperty("Title")
    private String title;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("abilityDescription1")
    private Ability abilityDescription1;

    @JsonProperty("abilityDescription2")
    private Ability abilityDescription2;

    @JsonProperty("abilityDescription3")
    private Ability abilityDescription3;

    @JsonProperty("abilityDescription4")
    private Ability abilityDescription4;

    @JsonProperty("abilityDescription5")
    private Ability abilityDescription5;

    @JsonProperty("basicAttack")
    private Ability basicAttack;

    @JsonProperty("godCard_URL")
    private String godCardURL;

    @JsonProperty("godIcon_URL")
    private String godIconURL;

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("latestGod")
    private String latestGod;

    @JsonProperty("ret_msg")
    private String ret_msg;

    public String getAbility1Name() {
        return ability1Name;
    }

    public void setAbility1Name(String ability1Name) {
        this.ability1Name = ability1Name;
    }

    public String getAbility2Name() {
        return ability2Name;
    }

    public void setAbility2Name(String ability2Name) {
        this.ability2Name = ability2Name;
    }

    public String getAbility3Name() {
        return ability3Name;
    }

    public void setAbility3Name(String ability3Name) {
        this.ability3Name = ability3Name;
    }

    public String getAbility4Name() {
        return ability4Name;
    }

    public void setAbility4Name(String ability4Name) {
        this.ability4Name = ability4Name;
    }

    public String getAbility5Name() {
        return ability5Name;
    }

    public void setAbility5Name(String ability5Name) {
        this.ability5Name = ability5Name;
    }

    public Integer getAbilityId1() {
        return abilityId1;
    }

    public void setAbilityId1(Integer abilityId1) {
        this.abilityId1 = abilityId1;
    }

    public Integer getAbilityId2() {
        return abilityId2;
    }

    public void setAbilityId2(Integer abilityId2) {
        this.abilityId2 = abilityId2;
    }

    public Integer getAbilityId3() {
        return abilityId3;
    }

    public void setAbilityId3(Integer abilityId3) {
        this.abilityId3 = abilityId3;
    }

    public Integer getAbilityId4() {
        return abilityId4;
    }

    public void setAbilityId4(Integer abilityId4) {
        this.abilityId4 = abilityId4;
    }

    public Integer getAbilityId5() {
        return abilityId5;
    }

    public void setAbilityId5(Integer abilityId5) {
        this.abilityId5 = abilityId5;
    }

    public AbilityDescription getAbility1() {
        return ability1;
    }

    public void setAbility1(AbilityDescription ability1) {
        this.ability1 = ability1;
    }

    public AbilityDescription getAbility2() {
        return ability2;
    }

    public void setAbility2(AbilityDescription ability2) {
        this.ability2 = ability2;
    }

    public AbilityDescription getAbility3() {
        return ability3;
    }

    public void setAbility3(AbilityDescription ability3) {
        this.ability3 = ability3;
    }

    public AbilityDescription getAbility4() {
        return ability4;
    }

    public void setAbility4(AbilityDescription ability4) {
        this.ability4 = ability4;
    }

    public AbilityDescription getAbility5() {
        return ability5;
    }

    public void setAbility5(AbilityDescription ability5) {
        this.ability5 = ability5;
    }

    public Float getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(Float attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public Float getAttackSpeedPerLevel() {
        return attackSpeedPerLevel;
    }

    public void setAttackSpeedPerLevel(Float attackSpeedPerLevel) {
        this.attackSpeedPerLevel = attackSpeedPerLevel;
    }

    public String getAutoBanned() {
        return autoBanned;
    }

    public void setAutoBanned(String autoBanned) {
        this.autoBanned = autoBanned;
    }

    public String getCons() {
        return cons;
    }

    public void setCons(String cons) {
        this.cons = cons;
    }

    public Float getHp5PerLevel() {
        return hp5PerLevel;
    }

    public void setHp5PerLevel(Float hp5PerLevel) {
        this.hp5PerLevel = hp5PerLevel;
    }

    public Integer getHealth() {
        return Health;
    }

    public void setHealth(Integer health) {
        Health = health;
    }

    public Integer getHealthPerFive() {
        return healthPerFive;
    }

    public void setHealthPerFive(Integer healthPerFive) {
        this.healthPerFive = healthPerFive;
    }

    public Integer getHealthPerLevel() {
        return healthPerLevel;
    }

    public void setHealthPerLevel(Integer healthPerLevel) {
        this.healthPerLevel = healthPerLevel;
    }

    public String getLore() {
        return lore;
    }

    public void setLore(String lore) {
        this.lore = lore;
    }

    public Float getMp5PerLevel() {
        return mp5PerLevel;
    }

    public void setMp5PerLevel(Float mp5PerLevel) {
        this.mp5PerLevel = mp5PerLevel;
    }

    public Integer getMagicProtection() {
        return magicProtection;
    }

    public void setMagicProtection(Integer magicProtection) {
        this.magicProtection = magicProtection;
    }

    public Float getMagicProtectionPerLevel() {
        return magicProtectionPerLevel;
    }

    public void setMagicProtectionPerLevel(Float magicProtectionPerLevel) {
        this.magicProtectionPerLevel = magicProtectionPerLevel;
    }

    public Integer getMagicalPower() {
        return magicalPower;
    }

    public void setMagicalPower(Integer magicalPower) {
        this.magicalPower = magicalPower;
    }

    public Float getMagicalPowerPerLevel() {
        return magicalPowerPerLevel;
    }

    public void setMagicalPowerPerLevel(Float magicalPowerPerLevel) {
        this.magicalPowerPerLevel = magicalPowerPerLevel;
    }

    public Integer getMana() {
        return mana;
    }

    public void setMana(Integer mana) {
        this.mana = mana;
    }

    public Float getManaPerFive() {
        return manaPerFive;
    }

    public void setManaPerFive(Float manaPerFive) {
        this.manaPerFive = manaPerFive;
    }

    public Integer getManaPerLevel() {
        return manaPerLevel;
    }

    public void setManaPerLevel(Integer manaPerLevel) {
        this.manaPerLevel = manaPerLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOnFreeRotation() {
        return onFreeRotation;
    }

    public void setOnFreeRotation(String onFreeRotation) {
        this.onFreeRotation = onFreeRotation;
    }

    public String getPantheon() {
        return pantheon;
    }

    public void setPantheon(String pantheon) {
        this.pantheon = pantheon;
    }

    public Integer getPhysicalPower() {
        return physicalPower;
    }

    public void setPhysicalPower(Integer physicalPower) {
        this.physicalPower = physicalPower;
    }

    public Float getPhysicalPowerPerLevel() {
        return physicalPowerPerLevel;
    }

    public void setPhysicalPowerPerLevel(Float physicalPowerPerLevel) {
        this.physicalPowerPerLevel = physicalPowerPerLevel;
    }

    public Integer getPhysicalProtection() {
        return physicalProtection;
    }

    public void setPhysicalProtection(Integer physicalProtection) {
        this.physicalProtection = physicalProtection;
    }

    public Float getPhysicalProtectionPerLevel() {
        return physicalProtectionPerLevel;
    }

    public void setPhysicalProtectionPerLevel(Float physicalProtectionPerLevel) {
        this.physicalProtectionPerLevel = physicalProtectionPerLevel;
    }

    public String getPros() {
        return pros;
    }

    public void setPros(String pros) {
        this.pros = pros;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public Integer getSpeed() {
        return speed;
    }

    public void setSpeed(Integer speed) {
        this.speed = speed;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Ability getAbilityDescription1() {
        return abilityDescription1;
    }

    public void setAbilityDescription1(Ability abilityDescription1) {
        this.abilityDescription1 = abilityDescription1;
    }

    public Ability getAbilityDescription2() {
        return abilityDescription2;
    }

    public void setAbilityDescription2(Ability abilityDescription2) {
        this.abilityDescription2 = abilityDescription2;
    }

    public Ability getAbilityDescription3() {
        return abilityDescription3;
    }

    public void setAbilityDescription3(Ability abilityDescription3) {
        this.abilityDescription3 = abilityDescription3;
    }

    public Ability getAbilityDescription4() {
        return abilityDescription4;
    }

    public void setAbilityDescription4(Ability abilityDescription4) {
        this.abilityDescription4 = abilityDescription4;
    }

    public Ability getAbilityDescription5() {
        return abilityDescription5;
    }

    public void setAbilityDescription5(Ability abilityDescription5) {
        this.abilityDescription5 = abilityDescription5;
    }

    public Ability getBasicAttack() {
        return basicAttack;
    }

    public void setBasicAttack(Ability basicAttack) {
        this.basicAttack = basicAttack;
    }

    public String getGodCardURL() {
        return godCardURL;
    }

    public void setGodCardURL(String godCardURL) {
        this.godCardURL = godCardURL;
    }

    public String getGodIconURL() {
        return godIconURL;
    }

    public void setGodIconURL(String godIconURL) {
        this.godIconURL = godIconURL;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLatestGod() {
        return latestGod;
    }

    public void setLatestGod(String latestGod) {
        this.latestGod = latestGod;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    @Override
    public String toString() {
        return "GodInfo{" +
                "ability1Name='" + ability1Name + '\'' +
                ", ability2Name='" + ability2Name + '\'' +
                ", ability3Name='" + ability3Name + '\'' +
                ", ability4Name='" + ability4Name + '\'' +
                ", ability5Name='" + ability5Name + '\'' +
                ", abilityId1=" + abilityId1 +
                ", abilityId2=" + abilityId2 +
                ", abilityId3=" + abilityId3 +
                ", abilityId4=" + abilityId4 +
                ", abilityId5=" + abilityId5 +
                ", ability1=" + ability1 +
                ", ability2=" + ability2 +
                ", ability3=" + ability3 +
                ", ability4=" + ability4 +
                ", ability5=" + ability5 +
                ", attackSpeed=" + attackSpeed +
                ", attackSpeedPerLevel=" + attackSpeedPerLevel +
                ", autoBanned='" + autoBanned + '\'' +
                ", cons='" + cons + '\'' +
                ", hp5PerLevel=" + hp5PerLevel +
                ", Health=" + Health +
                ", healthPerFive=" + healthPerFive +
                ", healthPerLevel=" + healthPerLevel +
                ", lore='" + lore + '\'' +
                ", mp5PerLevel=" + mp5PerLevel +
                ", magicProtection=" + magicProtection +
                ", magicProtectionPerLevel=" + magicProtectionPerLevel +
                ", magicalPower=" + magicalPower +
                ", magicalPowerPerLevel=" + magicalPowerPerLevel +
                ", mana=" + mana +
                ", manaPerFive=" + manaPerFive +
                ", manaPerLevel=" + manaPerLevel +
                ", name='" + name + '\'' +
                ", onFreeRotation='" + onFreeRotation + '\'' +
                ", pantheon='" + pantheon + '\'' +
                ", physicalPower=" + physicalPower +
                ", physicalPowerPerLevel=" + physicalPowerPerLevel +
                ", physicalProtection=" + physicalProtection +
                ", physicalProtectionPerLevel=" + physicalProtectionPerLevel +
                ", pros='" + pros + '\'' +
                ", roles='" + roles + '\'' +
                ", speed=" + speed +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                ", abilityDescription1=" + abilityDescription1 +
                ", abilityDescription2=" + abilityDescription2 +
                ", abilityDescription3=" + abilityDescription3 +
                ", abilityDescription4=" + abilityDescription4 +
                ", abilityDescription5=" + abilityDescription5 +
                ", basicAttack=" + basicAttack +
                ", godCardURL='" + godCardURL + '\'' +
                ", godIconURL='" + godIconURL + '\'' +
                ", id=" + id +
                ", latestGod='" + latestGod + '\'' +
                ", ret_msg='" + ret_msg + '\'' +
                '}';
    }
}
