package com.astro.smitebasic;


import com.astro.smitebasic.api.SmiteAPI;
import com.astro.smitebasic.objects.gamedata.PatchInfo;
import com.astro.smitebasic.objects.gamedata.UserInfo;
import com.astro.smitebasic.objects.gamedata.matches.MatchInfo;
import com.astro.smitebasic.objects.gamedata.matches.TopMatchInfo;
import com.astro.smitebasic.objects.player.matches.PlayerMatchData;
import com.astro.smitebasic.utils.Mode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class SmitebasicApplication {

	@Autowired
	private SmiteAPI api;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SmitebasicApplication.class, args);

		SmiteAPI api = context.getBean(SmiteAPI.class);

		TopMatchInfo[] topMatchInfos = api.getTopMatchData();
		for (TopMatchInfo info : topMatchInfos) {
			System.out.println(info);
		}

//		MatchInfo[] matchInfo = api.getMatchIDs(Mode.CONQUEST_LEAGUE.getModeID(), 0);
//		for (MatchInfo info : matchInfo) {
//			for (PlayerMatchData data : api.getMatchData(info.getMatchID())) {
//				System.out.println(data.getEntryDatetime());
//			}
//		}

		UserInfo[] userInfo = api.getDataUsed();
		for (UserInfo info : userInfo) {
			System.out.println(info);
		}
	}
}
