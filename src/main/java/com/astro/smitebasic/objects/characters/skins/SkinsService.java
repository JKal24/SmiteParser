package com.astro.smitebasic.objects.characters.skins;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SkinsService {

    @Autowired
    private SkinsRepository repository;

    public void addConnection(SkinsInfo info) { repository.save(info); }

    public Iterable<SkinsInfo> getConnections() {
        return repository.findAll();
    }

    public void deleteConnection(SkinsInfo info) { repository.delete(info); }
}
