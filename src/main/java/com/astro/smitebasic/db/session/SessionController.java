package com.astro.smitebasic.db.session;

import com.astro.smitebasic.api.session.SessionInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SessionController {

    @Autowired
    private SessionRepository sessionRepository;

    public String addConnection(SessionInfo info) {
        sessionRepository.save(info);
        System.out.println("Saved");
        return "Saved";
    }

    public Iterable<SessionInfo> getConnections() {
        return sessionRepository.findAll();
    }

    public void deleteConnection(SessionInfo info) { sessionRepository.delete(info); }
}
