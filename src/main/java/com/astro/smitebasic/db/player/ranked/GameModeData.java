package com.astro.smitebasic.db.player.ranked;

 interface GameModeData {

     Integer getLeaves();

     void setLeaves(Integer leaves);

     Integer getLosses();

     void setLosses(Integer losses);

     String getName();

     void setName(String name);

     Integer getPoints();

     void setPoints(Integer points);

     Integer getPrevRank();

     void setPrevRank(Integer prevRank);

     Integer getRank();

     void setRank(Integer rank);

     Integer getRank_Stat();

     void setRank_Stat(Integer rank_Stat);

     Integer getRank_Variance();

     void setRank_Variance(Integer rank_Variance);

     Integer getSeason();

     void setSeason(Integer season);

     Integer getTier();

     void setTier(Integer tier);

     Integer getTrend();

     void setTrend(Integer trend);

     Integer getWins();

     void setWins(Integer wins);

     String getPlayer_id();

     void setPlayer_id(String player_id);

     String getRet_msg();

     void setRet_msg(String ret_msg);

}
