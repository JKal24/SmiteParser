package com.astro.smitebasic.api;

import com.astro.smitebasic.db.player.PlayerInfo;
import com.astro.smitebasic.db.session.SessionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.security.NoSuchAlgorithmException;

@Component
public class SmiteAPI implements CommandLineRunner {

    @Value("${smite.acc}")
    private String mainAccName;

    @Autowired
    private Commands commands;

    @Override
    public void run(String... args) throws Exception {
        PlayerInfo[] info = commands.makeRequestCall(PlayerInfo[].class,"getplayer", mainAccName);

        for (PlayerInfo player : info) {
            System.out.println(player);
        }

        String ping = commands.ping();

    }

    public String getStatus() {
        return commands.ping();
    }

    public PlayerInfo getPlayer(String name) throws NoSuchAlgorithmException {
        return commands.makeRequestCall(PlayerInfo[].class, "getplayer", mainAccName)[0];
    }




}
