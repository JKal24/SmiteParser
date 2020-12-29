package com.astro.smitebasic.objects.player.friends;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FriendsService {

    @Autowired
    private FriendsRepository repository;

    public void addConnection(FriendsInfo info) { repository.save(info); }

    public Iterable<FriendsInfo> getConnections() {
        return repository.findAll();
    }

    public void deleteConnection(FriendsInfo info) { repository.delete(info); }
}
