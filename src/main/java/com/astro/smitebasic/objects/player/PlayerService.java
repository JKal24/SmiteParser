package com.astro.smitebasic.objects.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayerService {

    @Autowired
    private PlayerRepository repository;

    public void addConnection(PlayerInfo info) { repository.save(info); }

    public void addConnections(PlayerInfo[] info) {
        for (PlayerInfo playerInfo : info)
            addConnection(playerInfo);
    }

    public Iterable<PlayerInfo> getConnections() {
        return repository.findAll();
    }

    public void deleteConnection(PlayerInfo info) { repository.delete(info); }

}
