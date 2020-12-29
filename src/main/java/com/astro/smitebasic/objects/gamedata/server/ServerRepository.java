package com.astro.smitebasic.objects.gamedata.server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServerRepository extends CrudRepository<ServerInfo, Integer> {
}
