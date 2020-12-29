package com.astro.smitebasic.objects.gamedata.user;

import com.astro.smitebasic.objects.InfoController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public class UserService implements InfoController<UserInfo> {

    @Autowired
    private UserRepository repository;

    private CrudRepository crudRepository;
    @Override
    public void addConnection(UserInfo info) {
        repository.save(info);
    }

    @Override
    public void addConnections(UserInfo[] info) {
        for (UserInfo userInfo : info)
            addConnection(userInfo);
    }

    @Override
    public Iterable<UserInfo> getConnections() {
        return repository.findAll();
    }

    @Override
    public void deleteConnection(UserInfo info) {
        repository.delete(info);
    }
}
