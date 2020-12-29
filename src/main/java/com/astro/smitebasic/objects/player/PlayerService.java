package com.astro.smitebasic.objects.player;

import com.astro.smitebasic.objects.InfoController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayerService implements InfoController<PlayerInfo> {

    @Autowired
    private PlayerRepository repository;

    public void addConnection(PlayerInfo info) { repository.save(info); }

    @Override
    public void addConnections(PlayerInfo[] info) {
        for (PlayerInfo playerInfo : info)
            addConnection(playerInfo);
    }

    public Iterable<PlayerInfo> getConnections() {
        return repository.findAll();
    }

    public void deleteConnection(PlayerInfo info) { repository.delete(info); }

}
