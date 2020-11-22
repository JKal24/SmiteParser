package com.astro.smitebasic.db;

import com.astro.smitebasic.db.repositories.SessionRepository;
import com.astro.smitebasic.info.ConnectionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

public class Queries {

    @Autowired
    private SessionRepository sessionRepository;

    public String addConnection(@RequestParam ConnectionInfo info) {
        sessionRepository.save(info);
        return "Saved";
    }

    public String addConnection(@RequestParam String id, @RequestParam String timestamp) {
        ConnectionInfo info = new ConnectionInfo();
        info.setId(id);
        info.setTimestamp(timestamp);
        sessionRepository.save(info);
        return "Saved";
    }

    public Iterable<ConnectionInfo> getInfo() {
        return sessionRepository.findAll();
    }

}
