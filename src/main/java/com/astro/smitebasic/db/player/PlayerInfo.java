package com.astro.smitebasic.db.player;

import com.astro.smitebasic.info.Info;

public class PlayerInfo implements Info {

    private String JSONData;

    public PlayerInfo(String data) {
        this.JSONData = data;
    }
}
