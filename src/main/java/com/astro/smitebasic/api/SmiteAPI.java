package com.astro.smitebasic.api;

import com.astro.smitebasic.objects.Queries;
import com.astro.smitebasic.objects.characters.skins.SkinsInfo;
import com.astro.smitebasic.objects.data.PatchData;
import com.astro.smitebasic.objects.data.ServerData;
import com.astro.smitebasic.objects.data.UserData;
import com.astro.smitebasic.objects.player.PlayerInfo;
import com.astro.smitebasic.utils.Language;
import com.fasterxml.jackson.core.JsonProcessingException;
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

    @Autowired
    private Queries queries;

    //Zhong Kui
    private String godID = "1926";

    @Override
    public void run(String... args) throws Exception {
        System.out.println(getSessionStatus());
    }

    public String getAPIStatus() {
        return commands.ping();
    }

    public String getSessionStatus() throws NoSuchAlgorithmException, JsonProcessingException {
        return commands.makeRequestCall(String.class, "testsession");
    }

    public UserData[] getDataUsed() throws NoSuchAlgorithmException, JsonProcessingException {
        return commands.makeRequestCall(UserData[].class, "getdataused");
    }

    public ServerData[] getServerStatus() throws NoSuchAlgorithmException, JsonProcessingException {
        ServerData[] data = commands.makeRequestCall(ServerData[].class, "gethirezserverstatus");
        queries.dataController.addConnections(data);
        return data;
    }

    public PatchData[] getPatchInfo() throws NoSuchAlgorithmException, JsonProcessingException {
        return commands.makeRequestCall(PatchData[].class, "getpatchinfo");
    }

    public String[] getGods() throws NoSuchAlgorithmException, JsonProcessingException {
        return commands.makeRequestCall(String[].class, "getgods", Language.ENGLISH.getLanguage());
    }

    public PlayerInfo[] getPlayer(String name) throws NoSuchAlgorithmException, JsonProcessingException {
        return commands.makeRequestCall(PlayerInfo[].class,"getplayer", mainAccName);
    }

    public String[] getGodSkins() throws NoSuchAlgorithmException, JsonProcessingException {
        return commands.makeRequestCall(String[].class, "getgodskins", godID, Language.ENGLISH.getLanguage());
    }

}
