package com.astro.smitebasic.api;

import com.astro.smitebasic.objects.characters.GodInfo;
import com.astro.smitebasic.objects.characters.GodNotFoundException;
import com.astro.smitebasic.objects.characters.auxiliary.LeaderboardInfo;
import com.astro.smitebasic.objects.gamedata.*;
import com.astro.smitebasic.objects.gamedata.matches.*;
import com.astro.smitebasic.objects.player.auxiliary.ClanMemberInfo;
import com.astro.smitebasic.objects.player.matches.*;
import com.astro.smitebasic.objects.items.BaseItemInfo;
import com.astro.smitebasic.objects.items.RecommendedItemInfo;
import com.astro.smitebasic.objects.player.*;
import com.astro.smitebasic.objects.player.auxiliary.FriendsInfo;
import com.astro.smitebasic.objects.player.auxiliary.SearchedPlayer;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.security.NoSuchAlgorithmException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class SmiteAPI {

    private final static Logger LOGGER = Logger.getLogger(SmiteAPI.class.getName());

    @Autowired
    private Commands commands;

    public void setCredentials(String apiUri, String devID, String authKey) {
        commands.setApiUri(apiUri);
        commands.setDevID(devID);
        commands.setAuthKey(authKey);
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

    public GodInfo getGod(String name, String languageID) {
        try {
            GodInfo[] characters = this.getGods(languageID);
            for (GodInfo character : characters) {
                if (name.equals(character.getName())) {
                    return character;
                }
            }
            throw new GodNotFoundException();
        } catch(GodNotFoundException e) {
            LOGGER.log(Level.INFO, String.format("Could not find character: %s", name));
        }
        return null;
    }

    public GodInfo getGod(Integer ID, String languageID) {
        try {
            GodInfo[] characters = this.getGods(languageID);
            for (GodInfo character : characters) {
                if (ID.equals(character.getGodID())) {
                    return character;
                }
            }
            throw new GodNotFoundException();
        } catch(GodNotFoundException e) {
            LOGGER.log(Level.INFO, String.format("Could not find character: %s", ID));
        }
        return null;
    }

    public GodInfo[] getGods(String[] names, String languageID) {
        GodInfo[] characters = this.getGods(languageID);
        List<GodInfo> customCharacters = new ArrayList<GodInfo>();
        try {
            for (GodInfo character : characters) {
                if (Arrays.stream(names).anyMatch(name -> name.equals(character.getName()))) {
                    customCharacters.add(character);
                }
            }
            if (customCharacters.size() == 0)
                throw new GodNotFoundException();
            return customCharacters.toArray(new GodInfo[characters.length]);
        } catch (GodNotFoundException e) {
            LOGGER.log(Level.INFO, "Could not find any of the characters provided");
        }
        return customCharacters.toArray(new GodInfo[characters.length]);
    }

    public GodInfo[] getGods(String languageID) {
        return commands.makeRequestCall(GodInfo[].class, "getgods", languageID);
    }

    public LeaderboardInfo[] getGodLeaderboard(Integer godID, String modeID) {
        return commands.makeRequestCall(LeaderboardInfo[].class, "getgodleaderboard", godID.toString(), modeID);
    }

    public RecommendedItemInfo[] getGodRecommendedItems(Integer godID, String languageID) {
        return commands.makeRequestCall(RecommendedItemInfo[].class, "getgodrecommendeditems", godID.toString(), languageID);
    }

    public BaseItemInfo getItem(String itemName, String languageID) {
        try {
            BaseItemInfo[] items = this.getItems(languageID);
            for (BaseItemInfo item : items) {
                if (itemName.equals(item.getItemName())) {
                    return item;
                }
            }
            throw new GodNotFoundException();
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
    public String[] getGodSkins(Integer godID, String languageID) {
        return commands.makeRequestCall(String[].class, "getgodskins", godID.toString(), languageID);
    }

    // Accessed through the player's in game name
    public PlayerInfo[] getPlayer(String name) {
        try {
            PlayerInfo[] playerInfos = commands.makeRequestCall(PlayerInfo[].class, "getplayer", name);

            if (playerInfos.length > 0)
                return playerInfos;
            throw new PlayerNotFoundException(String.format("Could not find the player with the name: %s", name));
        } catch (PlayerNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    // Uses 3rd party ID (PS4, XBox, Switch, etc.)
    public PlayerInfo[] getPlayer(String name, String portalID) {
        try {
            PlayerInfo[] playerInfos = commands.makeRequestCall(PlayerInfo[].class,"getplayer", name, portalID);

            if (playerInfos.length > 0)
                return playerInfos;
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

    public FriendsInfo[] getFriends(Integer playerID) throws JsonProcessingException, NoSuchAlgorithmException {
        return commands.makeRequestCall(FriendsInfo[].class, "getfriends", playerID.toString());
    }

    public PlayerStatistics[] getCharacterStatistics(Integer playerID) {
        return commands.makeRequestCall(PlayerStatistics[].class, "getgodranks", playerID.toString());
    }

    public PlayTimeStatistics[] getPlayTimeStatistics(Integer playerID) {
        return commands.makeRequestCall(PlayTimeStatistics[].class, "getplayerachievements", playerID.toString());
    }

    public PlayerStatus[] getPlayerStatus(Integer playerID) {
        return commands.makeRequestCall(PlayerStatus[].class, "getplayerstatus", playerID.toString());
    }

    public PlayerMatchHistory[] getMatchHistory(Integer playerID) {
        return commands.makeRequestCall(PlayerMatchHistory[].class, "getmatchhistory", playerID.toString());
    }

    public PlayerQueueStatistics[] getPlayerQueueStatistics(Integer playerID, String modeID) {
        return commands.makeRequestCall(PlayerQueueStatistics[].class, "getqueuestats", playerID.toString(), modeID);
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

    // Data will be kept in a map of matchID and playerMatchData key-value pairs.

    public List<PlayerMatchData> getMultipleMatchData(Integer... matchID) {
        // Transform matchIDs into strings to be used for HTTP request
        String[] parseMatchID = Arrays.stream(matchID)
                .map(Object::toString).toArray(String[]::new);

        // Get data for each match for each player's perspective
        List<PlayerMatchData> allMatchData = new ArrayList<>();
        String[] tempIDs = new String[10];
        int parse = 0;

        for (String ID : parseMatchID) {
            if (parse >= 10) {
                PlayerMatchData[] tempMatchData = commands.makeRequestCall(PlayerMatchData[].class, "getmatchdetailsbatch",
                        String.join(",", tempIDs));
                allMatchData.addAll(Arrays.asList(tempMatchData));

                tempIDs = new String[10];
                parse = 0;
            }
            tempIDs[parse] = ID;
            parse++;
        }

        // Similar matches will all be added from every player's perspective.
        return allMatchData;
    }

    public MatchInfo[] getMatchIDs(String ModeID, LocalDate date, Integer hour) {
        return commands.makeRequestCall(MatchInfo[].class ,"getmatchidsbyqueue",
                ModeID, Utils.makeAPIDate(date), hour.toString());
    }

    public MatchInfo[] getMatchIDs(String ModeID, Integer hour) {
        return commands.makeRequestCall(MatchInfo[].class ,"getmatchidsbyqueue",
                ModeID, Utils.makeAPIDate(), hour.toString());
    }

    public MatchInfo[] getMatchIDs(String ModeID, LocalDate date, Integer hour, Integer minutes) {
        return commands.makeRequestCall(MatchInfo[].class ,"getmatchidsbyqueue",
                ModeID, Utils.makeAPIDate(date), String.join(",", hour.toString(), minutes.toString()));
    }

    public MatchInfo[] getMatchIDs(String ModeID, Integer hour, Integer minutes) {
        return commands.makeRequestCall(MatchInfo[].class ,"getmatchidsbyqueue",
                ModeID, Utils.makeAPIDate(), String.join(",", hour.toString(), minutes.toString()));
    }

    public PlayerLiveMatchData[] getLiveMatchData(Integer liveMatchID) {
        return commands.makeRequestCall(PlayerLiveMatchData[].class, "getmatchplayerdetails", liveMatchID.toString());
    }

    public TopMatchInfo[] getTopMatchData() {
        return commands.makeRequestCall(TopMatchInfo[].class, "gettopmatches");
    }

    public LeaderboardRanking[] getLeaderboardRankings(String modeID, String rankingID, Integer round) {
        return commands.makeRequestCall(LeaderboardRanking[].class, "getleagueleaderboard", modeID, rankingID, round.toString());
    }

    public SeasonInfo[] getLeagueSeasonInfo(String modeID) {
        return commands.makeRequestCall(SeasonInfo[].class, "getleagueseasons", modeID);
    }

    public ClanInfo[] getClan(Integer clanID) {
        return commands.makeRequestCall(ClanInfo[].class, "getteamdetails", clanID.toString());
    }

    public ClanMemberInfo[] getClanMembers(Integer clanID) {
        return commands.makeRequestCall(ClanMemberInfo[].class, "getteamplayers", clanID.toString());
    }

    public ClanInfo[] searchClans(String searchKey) {
        return commands.makeRequestCall(ClanInfo[].class, "searchteams", searchKey);
    }

    // Gets the clan ID for the closest search result
    public Integer getClanID(String searchKey) {
        return searchClans(searchKey)[0].getTeamID();
    }

    public MotdInfo[] getMatchOfTheDayHistory() {
        return commands.makeRequestCall(MotdInfo[].class, "getmotd");
    }

    public EsportsMatchInfo[] getEsportsMatches() {
        return commands.makeRequestCall(EsportsMatchInfo[].class, "getesportsproleaguedetails");
    }
}
