package com.astro.smitebasic.api;

import com.astro.smitebasic.objects.Queries;
import com.astro.smitebasic.objects.characters.CharacterInfo;
import com.astro.smitebasic.objects.gamedata.patch.PatchInfo;
import com.astro.smitebasic.objects.gamedata.server.ServerInfo;
import com.astro.smitebasic.objects.gamedata.user.UserInfo;
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
        for (CharacterInfo info : getGods()) {
            System.out.println(info);
        }
    }

    public String getAPIStatus() {
        return commands.ping();
    }

    public String getSessionStatus() throws NoSuchAlgorithmException, JsonProcessingException {
        return commands.makeRequestCall(String.class, "testsession");
    }

    public UserInfo[] getDataUsed() throws NoSuchAlgorithmException, JsonProcessingException {
        return commands.makeRequestCall(UserInfo[].class, "getdataused");
    }

    public ServerInfo[] getServerStatus() throws NoSuchAlgorithmException, JsonProcessingException {
        ServerInfo[] info = commands.makeRequestCall(ServerInfo[].class, "gethirezserverstatus");
        queries.serverService.addConnections(info);
        return info;
    }

    public PatchInfo[] getPatchInfo() throws NoSuchAlgorithmException, JsonProcessingException {
        PatchInfo[] info = commands.makeRequestCall(PatchInfo[].class, "getpatchinfo");
        queries.patchService.addConnections(info);
        return info;
    }

    public CharacterInfo[] getGods() throws NoSuchAlgorithmException, JsonProcessingException {
        return commands.makeRequestCall(CharacterInfo[].class, "getgods", Language.ENGLISH.getLanguage());
    }

    public PlayerInfo[] getPlayer(String name) throws NoSuchAlgorithmException, JsonProcessingException {
        return commands.makeRequestCall(PlayerInfo[].class,"getplayer", mainAccName);
    }

    public String[] getGodSkins() throws NoSuchAlgorithmException, JsonProcessingException {
        return commands.makeRequestCall(String[].class, "getgodskins", godID, Language.ENGLISH.getLanguage());
    }

}
