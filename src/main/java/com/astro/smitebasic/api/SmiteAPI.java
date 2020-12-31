package com.astro.smitebasic.api;

import com.astro.smitebasic.objects.characters.CharacterInfo;
import com.astro.smitebasic.objects.characters.CharacterNotFoundException;
import com.astro.smitebasic.objects.characters.leaderboard.LeaderboardInfo;
import com.astro.smitebasic.objects.gamedata.PatchInfo;
import com.astro.smitebasic.objects.gamedata.ServerInfo;
import com.astro.smitebasic.objects.gamedata.UserInfo;
import com.astro.smitebasic.objects.items.BaseItemInfo;
import com.astro.smitebasic.objects.items.RecommendedItemInfo;
import com.astro.smitebasic.objects.player.FriendsInfo;
import com.astro.smitebasic.objects.player.PlayerDescription;
import com.astro.smitebasic.objects.player.PlayerInfo;
import com.astro.smitebasic.objects.player.PlayerStatistics;
import com.astro.smitebasic.utils.Language;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class SmiteAPI implements CommandLineRunner {

    private final static Logger LOGGER = Logger.getLogger(SmiteAPI.class.getName());

    @Value("${smite.acc}")
    private String mainAccName;

    @Autowired
    private Commands commands;

    @Override
    public void run(String... args) throws Exception {
        Integer zkID = 1926;
//        for (FriendsInfo value : getFriends(mainAccName)) {
//            System.out.println(value);
//        }

        System.out.println(commands.makeRequestCall("getgodranks", mainAccName));
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
        return commands.makeRequestCall(ServerInfo[].class, "gethirezserverstatus");
    }

    public PatchInfo[] getPatchInfo() throws NoSuchAlgorithmException, JsonProcessingException {
        return commands.makeRequestCall(PatchInfo[].class, "getpatchinfo");
    }

    public CharacterInfo getGod(String name) throws NoSuchAlgorithmException, JsonProcessingException {
        try {
            CharacterInfo[] characters = this.getGods();
            for (CharacterInfo character : characters) {
                if (name.equals(character.getName())) {
                    return character;
                }
            }
            throw new CharacterNotFoundException();
        } catch(CharacterNotFoundException e) {
            LOGGER.log(Level.INFO, String.format("Could not find character: %s", name));
        }
        return null;
    }

    public CharacterInfo getGod(Integer ID) throws JsonProcessingException, NoSuchAlgorithmException {
        try {
            CharacterInfo[] characters = this.getGods();
            for (CharacterInfo character : characters) {
                if (ID.equals(character.getId())) {
                    return character;
                }
            }
            throw new CharacterNotFoundException();
        } catch(CharacterNotFoundException e) {
            LOGGER.log(Level.INFO, String.format("Could not find character: %s", ID));
        }
        return null;
    }

    public CharacterInfo[] getGods(String[] names) throws JsonProcessingException, NoSuchAlgorithmException {
        CharacterInfo[] characters = this.getGods();
        List<CharacterInfo> customCharacters = new ArrayList<CharacterInfo>();
        try {
            for (CharacterInfo character : characters) {
                if (Arrays.stream(names).anyMatch(name -> name.equals(character.getName()))) {
                    customCharacters.add(character);
                }
            }
            if (customCharacters.size() == 0)
                throw new CharacterNotFoundException();
            return customCharacters.toArray(new CharacterInfo[characters.length]);
        } catch (CharacterNotFoundException e) {
            LOGGER.log(Level.INFO, "Could not find any of the characters provided");
        }
        return customCharacters.toArray(new CharacterInfo[characters.length]);
    }

    public CharacterInfo[] getGods() throws NoSuchAlgorithmException, JsonProcessingException {
        return commands.makeRequestCall(CharacterInfo[].class, "getgods", Language.ENGLISH.getLanguageID());
    }

    public LeaderboardInfo[] getGodLeaderboard(Integer godID, String mode) throws JsonProcessingException, NoSuchAlgorithmException {
        return commands.makeRequestCall(LeaderboardInfo[].class, "getgodleaderboard", godID.toString(), mode);
    }

    public RecommendedItemInfo[] getGodRecommendedItems(Integer godID, String languageID) throws JsonProcessingException, NoSuchAlgorithmException {
        return commands.makeRequestCall(RecommendedItemInfo[].class, "getgodrecommendeditems", godID.toString(), languageID);
    }

    public BaseItemInfo getItem(String itemName) throws JsonProcessingException, NoSuchAlgorithmException {
        try {
            BaseItemInfo[] items = this.getItems(Language.ENGLISH.getLanguageID());
            for (BaseItemInfo item : items) {
                if (itemName.equals(item.getItemName())) {
                    return item;
                }
            }
            throw new CharacterNotFoundException();
        } catch(Exception e) {
            // Implement item exception...
            LOGGER.log(Level.INFO, String.format("Could not find item: %s", itemName));
        }
        return null;
    }

    public BaseItemInfo[] getItems(String languageID) throws JsonProcessingException, NoSuchAlgorithmException {
        return commands.makeRequestCall(BaseItemInfo[].class, "getitems", languageID);
    }

    // God ID is gathered through accessing god information
    public String[] getGodSkins(Integer godID) throws NoSuchAlgorithmException, JsonProcessingException {
        return commands.makeRequestCall(String[].class, "getgodskins", godID.toString(), Language.ENGLISH.getLanguageID());
    }

    // Accessed through the player's in game name
    public PlayerInfo[] getPlayer(String name) throws NoSuchAlgorithmException, JsonProcessingException {
        return commands.makeRequestCall(PlayerInfo[].class,"getplayer", mainAccName);
    }

    // Uses 3rd party ID (PS4, XBox, Switch, etc.)
    public PlayerInfo[] getPlayer(String name, String portalID) throws NoSuchAlgorithmException, JsonProcessingException {
        return commands.makeRequestCall(PlayerInfo[].class,"getplayer", mainAccName, portalID);
    }

    public PlayerDescription[] getPlayerDescription(String name) throws JsonProcessingException, NoSuchAlgorithmException {
        return commands.makeRequestCall(PlayerDescription[].class, "getplayeridbyname", name);
    }

    public PlayerDescription[] getPlayerDescription(String portalID, String tag, Boolean gamerTag) throws JsonProcessingException, NoSuchAlgorithmException {
        return gamerTag ? commands.makeRequestCall(PlayerDescription[].class, "getplayeridsbygamertag", portalID, tag) :
                commands.makeRequestCall(PlayerDescription[].class, "getplayeridbyportaluserid", portalID, tag);
    }

    public FriendsInfo[] getFriends(String name) throws JsonProcessingException, NoSuchAlgorithmException {
        return commands.makeRequestCall(FriendsInfo[].class, "getfriends", name);
    }

    public PlayerStatistics[] getPlayTimeStatistics(String name) throws JsonProcessingException, NoSuchAlgorithmException {
        return commands.makeRequestCall(PlayerStatistics[].class, "getgodranks", name);
    }
}
