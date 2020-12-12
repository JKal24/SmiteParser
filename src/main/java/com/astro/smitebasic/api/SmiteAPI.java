package com.astro.smitebasic.api;

import com.astro.smitebasic.db.Queries;
import com.astro.smitebasic.db.player.PlayerInfo;
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
        System.out.println(getPlayer(mainAccName));
        System.out.println();
        System.out.println(getAPIStatus());
        System.out.println();
        System.out.println(getSessionStatus());
        System.out.println();
        System.out.println(getDataUsed());
        System.out.println();
        System.out.println(getServerStatus());
        System.out.println();
        System.out.println(getPatchInfo());

    }

    public String getAPIStatus() {
        return commands.ping();
    }

    public String getSessionStatus() throws NoSuchAlgorithmException { return commands.makeRequestCall(String.class, "testsession"); }

    public String getDataUsed() throws NoSuchAlgorithmException { return commands.makeRequestCall(String.class, "getdataused"); }

    public String getServerStatus() throws NoSuchAlgorithmException { return commands.makeRequestCall(String.class, "gethirezserverstatus"); }

    public String getPatchInfo() throws NoSuchAlgorithmException { return commands.makeRequestCall(String.class, "getpatchinfo"); }

    public PlayerInfo getPlayer(String name) throws NoSuchAlgorithmException { return commands.makeRequestCall(PlayerInfo[].class,"getplayer", mainAccName)[0]; }

}
