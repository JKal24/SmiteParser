package com.astro.smitebasic.db;


import com.astro.smitebasic.db.player.PlayerController;
import com.astro.smitebasic.db.player.PlayerInfo;
import com.astro.smitebasic.db.session.SessionController;
import com.astro.smitebasic.db.session.SessionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Queries {

    @Autowired
    private SessionController sessionController;

    @Autowired
    private PlayerController playerController;

    public void addSession(SessionInfo info) {
        sessionController.addConnection(info);
    }

    public void deleteSession(SessionInfo info) {
        sessionController.deleteConnection(info);
    }

    public Iterable<SessionInfo> getSessions() {
        return sessionController.getConnections();
    }

    public void addPlayer(PlayerInfo info) {
        playerController.addConnection(info);
    }

    public void deletePlayer(PlayerInfo info) {
        playerController.deleteConnection(info);
    }

    public Iterable<PlayerInfo> getPlayers() {
        return playerController.getConnections();
    }



}
