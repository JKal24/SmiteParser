package com.astro.smitebasic.api;

import com.astro.smitebasic.objects.data.PatchData;
import com.astro.smitebasic.objects.data.ServerData;
import com.astro.smitebasic.objects.data.UserData;
import com.astro.smitebasic.objects.player.PlayerInfo;
import com.astro.smitebasic.smite.Language;
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
        System.out.println(getGods());
    }

    public String getAPIStatus() {
        return commands.ping();
    }

    public String getSessionStatus() throws NoSuchAlgorithmException { return commands.makeRequestCall(String.class, "testsession"); }

    public UserData getDataUsed() throws NoSuchAlgorithmException { return commands.makeRequestCall(UserData[].class, "getdataused")[0]; }

    public ServerData getServerStatus() throws NoSuchAlgorithmException { return commands.makeRequestCall(ServerData[].class, "gethirezserverstatus")[0]; }

    public PatchData getPatchInfo() throws NoSuchAlgorithmException { return commands.makeRequestCall(PatchData.class, "getpatchinfo"); }

    public String getGods() throws NoSuchAlgorithmException { return commands.makeRequestCall(String.class, "getgods", Language.ENGLISH.getLanguage()); }

    public PlayerInfo getPlayer(String name) throws NoSuchAlgorithmException { return commands.makeRequestCall(PlayerInfo[].class,"getplayer", mainAccName)[0]; }

}
