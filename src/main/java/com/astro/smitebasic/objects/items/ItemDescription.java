package com.astro.smitebasic.objects.items;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ItemDescription {

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Menuitems")
    private List<Description> itemAttributeList;

    @JsonProperty("SecondaryDescription")
    private String secondaryDescription;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Description> getItemAttributeList() {
        return itemAttributeList;
    }

    public void setItemAttributeList(List<Description> itemAttributeList) {
        this.itemAttributeList = itemAttributeList;
    }

    public String getSecondaryDescription() {
        return secondaryDescription;
    }

    public void setSecondaryDescription(String secondaryDescription) {
        this.secondaryDescription = secondaryDescription;
    }

    @Override
    public String toString() {
        return "ItemDescription{" +
                "description='" + description + '\'' +
                ", itemAttributeList=" + itemAttributeList +
                ", secondaryDescription='" + secondaryDescription + '\'' +
                '}';
    }
}
