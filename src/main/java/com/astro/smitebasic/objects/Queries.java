package com.astro.smitebasic.objects;

import com.astro.smitebasic.objects.characters.skins.SkinsController;
import com.astro.smitebasic.objects.data.DataController;
import com.astro.smitebasic.objects.player.PlayerController;
import com.astro.smitebasic.objects.player.friends.FriendsController;
import com.astro.smitebasic.objects.session.SessionController;
import org.springframework.beans.factory.annotation.Autowired;

public class Queries {

    @Autowired
    public SkinsController skinsController;

    @Autowired
    public DataController dataController;

    @Autowired
    public FriendsController friendsController;

    @Autowired
    public PlayerController playerController;

    @Autowired
    public SessionController sessionController;

}
