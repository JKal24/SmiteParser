package com.astro.smitebasic.objects.gamedata.matches;

import com.astro.smitebasic.objects.player.matches.PlayerMatchData;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MultiMatchInfo {

    private Map<Integer, PlayerMatchData[]> playerMatchDataList;

    public MultiMatchInfo() {
        this.playerMatchDataList = new HashMap<Integer, PlayerMatchData[]>();
    }

    public PlayerMatchData[] getPlayerMatchDataList(Integer matchID) {
        return playerMatchDataList.get(matchID);
    }

    public void appendMatchData(Integer matchID, PlayerMatchData[] playerMatchData) {
        playerMatchDataList.put(matchID, playerMatchData);
    }

    public Map<Integer, PlayerMatchData[]> getPlayerMatchDataList() {
        return playerMatchDataList;
    }

    @Override
    public String toString() {
        return "MultiMatchInfo{" +
                "playerMatchDataList=" + playerMatchDataList.keySet().stream()
                .map(key -> key + "=" + Arrays.toString(playerMatchDataList.get(key)))
                .collect(Collectors.joining(", ", "{", "}")) +
                '}';
    }
}
