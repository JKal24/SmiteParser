package com.astro.smitebasic.objects;

import com.astro.smitebasic.objects.characters.skins.SkinsService;
import com.astro.smitebasic.objects.player.PlayerService;
import com.astro.smitebasic.objects.player.friends.FriendsService;
import com.astro.smitebasic.objects.session.SessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Queries {

    @Autowired
    public SkinsService skinsService;

    @Autowired
    public FriendsService friendsService;

    @Autowired
    public PlayerService playerService;

    @Autowired
    public SessionService sessionService;

}
