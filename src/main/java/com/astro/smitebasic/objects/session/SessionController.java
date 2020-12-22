package com.astro.smitebasic.objects.session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SessionController {

    @Autowired
    private SessionRepository repository;

    public void addConnection(SessionInfo info) {
        repository.save(info);
    }

    public void addConnections(SessionInfo[] sessionInfo) {
        for (SessionInfo info : sessionInfo) {
            addConnection(info);
        }
    }

    public Iterable<SessionInfo> getConnections() {
        return repository.findAll();
    }

    public void deleteConnection(SessionInfo info) { repository.delete(info); }
}
