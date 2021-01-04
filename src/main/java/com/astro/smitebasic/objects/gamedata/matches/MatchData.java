package com.astro.smitebasic.objects.gamedata.matches;

import com.astro.smitebasic.objects.player.matches.PlayerMatchData;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MatchData {

    private Map<Integer, PlayerMatchData[]> playerMatchDataList;

    public MatchData() {
        this.playerMatchDataList = new HashMap<Integer, PlayerMatchData[]>();
    }

    public PlayerMatchData[] getPlayerMatchDataList(Integer matchID) {
        return playerMatchDataList.get(matchID);
    }

    public void appendMatchData(Integer matchID, PlayerMatchData[] playerMatchData) {
        playerMatchDataList.put(matchID, playerMatchData);
    }

    @Override
    public String toString() {
        return "MatchData{" +
                "playerMatchDataList=" + playerMatchDataList.keySet().stream()
                .map(key -> key + "=" + Arrays.toString(playerMatchDataList.get(key)))
                .collect(Collectors.joining(", ", "{", "}")) +
                '}';
    }
}
