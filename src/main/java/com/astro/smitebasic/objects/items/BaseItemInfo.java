package com.astro.smitebasic.objects.items;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

public class BaseItemInfo {

    @JsonProperty("ActiveFlag")
    private String activeFlag;

    @JsonProperty("ChildItemId")
    private Integer childItemID;

    @JsonProperty("DeviceName")
    private String itemName;

    @JsonProperty("IconId")
    private Integer iconID;

    @JsonProperty("ItemDescription")
    private ItemDescription itemDescription;

    @JsonProperty("ItemId")
    private Integer itemID;

    @JsonProperty("ItemTier")
    private Integer itemTier;

    @JsonProperty("Price")
    private Integer price;

    @JsonProperty("RestrictedRoles")
    private String restrictedRoles;

    @JsonProperty("RootItemId")
    private Integer rootItemID;

    @JsonProperty("ShortDesc")
    private String shortDescription;

    @JsonProperty("StartingItem")
    private Boolean startingItem;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("itemIcon_URL")
    private String itemIconURL;

    @JsonProperty("ret_msg")
    private String ret_msg;

    public String getActiveFlag() {
        return activeFlag;
    }

    public void setActiveFlag(String activeFlag) {
        this.activeFlag = activeFlag;
    }

    public Integer getChildItemID() {
        return childItemID;
    }

    public void setChildItemID(Integer childItemID) {
        this.childItemID = childItemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Integer getIconID() {
        return iconID;
    }

    public void setIconID(Integer iconID) {
        this.iconID = iconID;
    }

    public ItemDescription getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(ItemDescription itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    public Integer getItemTier() {
        return itemTier;
    }

    public void setItemTier(Integer itemTier) {
        this.itemTier = itemTier;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getRestrictedRoles() {
        return restrictedRoles;
    }

    public void setRestrictedRoles(String restrictedRoles) {
        this.restrictedRoles = restrictedRoles;
    }

    public Integer getRootItemID() {
        return rootItemID;
    }

    public void setRootItemID(Integer rootItemID) {
        this.rootItemID = rootItemID;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public Boolean getStartingItem() {
        return startingItem;
    }

    public void setStartingItem(Boolean startingItem) {
        this.startingItem = startingItem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getItemIconURL() {
        return itemIconURL;
    }

    public void setItemIconURL(String itemIconURL) {
        this.itemIconURL = itemIconURL;
    }

    public String getRet_msg() {
        return ret_msg;
    }

    public void setRet_msg(String ret_msg) {
        this.ret_msg = ret_msg;
    }

    @Override
    public String toString() {
        return "BaseItemInfo{" +
                "activeFlag='" + activeFlag + '\'' +
                ", childItemID=" + childItemID +
                ", itemName='" + itemName + '\'' +
                ", iconID=" + iconID +
                ", itemDescription=" + itemDescription +
                ", itemID=" + itemID +
                ", itemTier=" + itemTier +
                ", price=" + price +
                ", restrictedRoles='" + restrictedRoles + '\'' +
                ", rootItemID=" + rootItemID +
                ", shortDescription='" + shortDescription + '\'' +
                ", startingItem=" + startingItem +
                ", type='" + type + '\'' +
                ", itemIconURL='" + itemIconURL + '\'' +
                '}';
    }
}
