package com.astro.smitebasic.db.player;

import com.astro.smitebasic.db.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayerController implements Controller<PlayerInfo> {

    @Autowired
    private PlayerRepository repository;

    public void addConnection(PlayerInfo info) { repository.save(info); }

    public Iterable<PlayerInfo> getConnections() {
        return repository.findAll();
    }

    public void deleteConnection(PlayerInfo info) { repository.delete(info); }

}
