package com.astro.smitebasic.db.session;

import com.astro.smitebasic.info.ConnectionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SessionController {

    @Autowired
    private SessionRepository sessionRepository;

    public String addConnection(ConnectionInfo info) {
        sessionRepository.save(info);
        System.out.println("Saved");
        return "Saved";
    }

    public Iterable<ConnectionInfo> getConnections() {
        return sessionRepository.findAll();
    }

    public void deleteConnection(ConnectionInfo info) { sessionRepository.delete(info); }
}
