package com.astro.smitebasic.objects.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RecommendedItemInfo {

    @JsonProperty("Category")
    private String category;

    @JsonProperty("Item")
    private String item;

    @JsonProperty("Role")
    private String role;

    @JsonProperty("category_value_id")
    private Integer categoryValueID;

    @JsonProperty("icon_id")
    private Integer iconID;

    @JsonProperty("item_id")
    private Integer itemID;

    @JsonProperty("role_value_id")
    private Integer roleValueID;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Integer getCategoryValueID() {
        return categoryValueID;
    }

    public void setCategoryValueID(Integer categoryValueID) {
        this.categoryValueID = categoryValueID;
    }

    public Integer getIconID() {
        return iconID;
    }

    public void setIconID(Integer iconID) {
        this.iconID = iconID;
    }

    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    public Integer getRoleValueID() {
        return roleValueID;
    }

    public void setRoleValueID(Integer roleValueID) {
        this.roleValueID = roleValueID;
    }

    @Override
    public String toString() {
        return "RecommendedItemInfo{" +
                "category='" + category + '\'' +
                ", item='" + item + '\'' +
                ", role='" + role + '\'' +
                ", categoryValueID=" + categoryValueID +
                ", iconID=" + iconID +
                ", itemID=" + itemID +
                ", roleValueID=" + roleValueID +
                '}';
    }
}
