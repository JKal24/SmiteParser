package com.astro.smitebasic.api;

import com.astro.smitebasic.objects.characters.CharacterInfo;
import com.astro.smitebasic.objects.characters.CharacterNotFoundException;
import com.astro.smitebasic.objects.characters.auxiliary.LeaderboardInfo;
import com.astro.smitebasic.objects.gamedata.PatchInfo;
import com.astro.smitebasic.objects.gamedata.ServerInfo;
import com.astro.smitebasic.objects.gamedata.UserInfo;
import com.astro.smitebasic.objects.player.matches.PlayTimeStatistics;
import com.astro.smitebasic.objects.player.matches.PlayerMatchData;
import com.astro.smitebasic.objects.player.matches.PlayerMatchHistory;
import com.astro.smitebasic.objects.player.matches.PlayerQueueStatistics;
import com.astro.smitebasic.objects.items.BaseItemInfo;
import com.astro.smitebasic.objects.items.RecommendedItemInfo;
import com.astro.smitebasic.objects.player.*;
import com.astro.smitebasic.objects.player.auxiliary.FriendsInfo;
import com.astro.smitebasic.objects.player.auxiliary.SearchedPlayer;
import com.astro.smitebasic.utils.Mode;
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
    public void run(String... args) {
        Integer zkID = 1926;
//        for (PlayerInfo value : getPlayer("NOTAREALACCOUNTHAHAHAH49053i05")) {
//            System.out.println(value);
//        }

        System.out.println(commands.makeRequestCall("getmatchidsbyqueue", Mode.ARENA.getModeID(), Utils.makeAPIDate(), "3"));
        System.out.println(commands.makeRequestCall("getmatchdetailsbatch", "1116136956,1116131597,1116125138"));
        System.out.println(commands.makeRequestCall("getmatchplayerdetails", "1116182420"));
        System.out.println(commands.makeRequestCall("gettopmatches"));
    }

    public String getAPIStatus() {
        return commands.ping();
    }

    public String getSessionStatus() {
        return commands.makeRequestCall(String.class, "testsession");
    }

    public UserInfo[] getDataUsed() {
        return commands.makeRequestCall(UserInfo[].class, "getdataused");
    }

    public ServerInfo[] getServerStatus() {
        return commands.makeRequestCall(ServerInfo[].class, "gethirezserverstatus");
    }

    public PatchInfo[] getPatchInfo() {
        return commands.makeRequestCall(PatchInfo[].class, "getpatchinfo");
    }

    public CharacterInfo getGod(String name, Integer languageID) {
        try {
            CharacterInfo[] characters = this.getGods(languageID);
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

    public CharacterInfo getGod(Integer ID, Integer languageID) {
        try {
            CharacterInfo[] characters = this.getGods(languageID);
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

    public CharacterInfo[] getGods(String[] names, Integer languageID) {
        CharacterInfo[] characters = this.getGods(languageID);
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

    public CharacterInfo[] getGods(Integer languageID) {
        return commands.makeRequestCall(CharacterInfo[].class, "getgods", languageID.toString());
    }

    public LeaderboardInfo[] getGodLeaderboard(Integer godID, Integer mode) {
        return commands.makeRequestCall(LeaderboardInfo[].class, "getgodleaderboard", godID.toString(), mode.toString());
    }

    public RecommendedItemInfo[] getGodRecommendedItems(Integer godID, Integer languageID) {
        return commands.makeRequestCall(RecommendedItemInfo[].class, "getgodrecommendeditems", godID.toString(), languageID.toString());
    }

    public BaseItemInfo getItem(String itemName, Integer languageID) {
        try {
            BaseItemInfo[] items = this.getItems(languageID.toString());
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

    public BaseItemInfo[] getItems(String languageID) {
        return commands.makeRequestCall(BaseItemInfo[].class, "getitems", languageID);
    }

    // God ID is gathered through accessing god information
    public String[] getGodSkins(Integer godID, Integer languageID) {
        return commands.makeRequestCall(String[].class, "getgodskins", godID.toString(), languageID.toString());
    }

    // Accessed through the player's in game name
    public PlayerInfo[] getPlayer(String name) {
        try {
            PlayerInfo[] playerMatches = commands.makeRequestCall(PlayerInfo[].class, "getplayer", name);

            if (playerMatches.length > 0)
                return playerMatches;
            throw new PlayerNotFoundException(String.format("Could not find the player with the name: %s", name));
        } catch (PlayerNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Uses 3rd party ID (PS4, XBox, Switch, etc.)
    public PlayerInfo[] getPlayer(String name, String portalID) {
        try {
            PlayerInfo[] playerMatches = commands.makeRequestCall(PlayerInfo[].class,"getplayer", name, portalID);

            if (playerMatches.length > 0)
                return playerMatches;
            throw new PlayerNotFoundException(String.format("Could not find the player with the name and portalID: %s, %s", name, portalID));
        } catch (PlayerNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public PlayerID[] getPlayerID(String name) {
        try {
            PlayerID[] playerIDs = commands.makeRequestCall(PlayerID[].class, "getplayeridbyname", name);

            if (playerIDs.length > 0)
                return playerIDs;
            throw new PlayerNotFoundException(String.format("Could not find the player's ID, with the name: %s", name));
        } catch (PlayerNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public PlayerID[] getPlayerID(String portalID, String tag, Boolean gamerTag) {
        try {
            PlayerID[] playerIDs = gamerTag ? commands.makeRequestCall(PlayerID[].class, "getplayeridsbygamertag", portalID, tag) :
                    commands.makeRequestCall(PlayerID[].class, "getplayeridbyportaluserid", portalID, tag);

            if (playerIDs.length > 0)
                return playerIDs;
            throw new PlayerNotFoundException(String.format("Could not find the player's ID, with the portalID and tag: %s, %s", portalID, tag));
        } catch (PlayerNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public FriendsInfo[] getFriends(String playerID) throws JsonProcessingException, NoSuchAlgorithmException {
        return commands.makeRequestCall(FriendsInfo[].class, "getfriends", playerID);
    }

    public PlayerStatistics[] getCharacterStatistics(String playerID) {
        return commands.makeRequestCall(PlayerStatistics[].class, "getgodranks", playerID);
    }

    public PlayTimeStatistics[] getPlayTimeStatistics(String playerID) {
        return commands.makeRequestCall(PlayTimeStatistics[].class, "getplayerachievements", playerID);
    }

    public PlayerStatus[] getPlayerStatus(String playerID) {
        return commands.makeRequestCall(PlayerStatus[].class, "getplayerstatus", playerID);
    }

    public PlayerMatchHistory[] getMatchHistory(String playerID) {
        return commands.makeRequestCall(PlayerMatchHistory[].class, "getmatchhistory", playerID);
    }

    public PlayerQueueStatistics[] getPlayerQueueStatistics(String playerID, String modeID) {
        return commands.makeRequestCall(PlayerQueueStatistics[].class, "getqueuestats", playerID, modeID);
    }

    public SearchedPlayer[] getSearchedPlayers(String searchKey) {
        return (Arrays.stream(commands.makeRequestCall(SearchedPlayer[].class, "searchplayers", searchKey))
                .filter(searchedPlayer -> {
            return searchedPlayer.getHzPlayerName() != null && searchedPlayer.getPlayerName() != null;
        })).toArray(SearchedPlayer[]::new);
    }

    public PlayerMatchData[] getMatchData(Integer matchID) {
        return commands.makeRequestCall(PlayerMatchData[].class, "getmatchdetails", matchID.toString());
    }
}
