package com.astro.smitebasic.objects;

import com.astro.smitebasic.objects.characters.skins.SkinsService;
import com.astro.smitebasic.objects.gamedata.patch.PatchService;
import com.astro.smitebasic.objects.gamedata.server.ServerService;
import com.astro.smitebasic.objects.gamedata.user.UserService;
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
    public PatchService patchService;

    @Autowired
    public ServerService serverService;

    @Autowired
    public UserService userService;

    @Autowired
    public FriendsService friendsService;

    @Autowired
    public PlayerService playerService;

    @Autowired
    public SessionService sessionService;

}
