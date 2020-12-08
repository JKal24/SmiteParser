package com.astro.smitebasic.db.player.ranked;

import com.astro.smitebasic.db.player.PlayerInfo;

interface GameModeData {

    Integer getId();

    void setId(Integer id);

    String getLeaves();

    void setLeaves(String leaves);

    String getLosses();

    void setLosses(String losses);

    String getName();

    void setName(String name);

    String getPoints();

    void setPoints(String points);

    String getPrevRank();

    void setPrevRank(String prevRank);

    String getRank();

    void setRank(String rank);

    String getRank_Stat();

    void setRank_Stat(String rank_Stat);

    String getRank_Variance();

    void setRank_Variance(String rank_Variance);

    String getSeason();

    void setSeason(String season);

    String getTier();

    void setTier(String tier);

    String getTrend();

    void setTrend(String trend);

    String getWins();

    void setWins(String wins);

    String getPlayer_id();

    void setPlayer_id(String player_id);

    String getRet_msg();

    void setRet_msg(String ret_msg);

    PlayerInfo getInfo();

    void setInfo(PlayerInfo info);

}
