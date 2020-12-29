package com.astro.smitebasic.objects.gamedata.server;

import com.astro.smitebasic.objects.InfoController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServerService implements InfoController<ServerInfo> {

    @Autowired
    private ServerRepository repository;

    @Override
    public void addConnection(ServerInfo info) {
        repository.save(info);
    }

    @Override
    public void addConnections(ServerInfo[] info) {
        for (ServerInfo serverInfo : info)
            repository.save(serverInfo);
    }

    @Override
    public Iterable<ServerInfo> getConnections() {
        return repository.findAll();
    }

    @Override
    public void deleteConnection(ServerInfo info) {
        repository.delete(info);
    }
}
