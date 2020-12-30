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
    private void unpackNested(Map<String, Object> description) {

    }

    private String description;

}
