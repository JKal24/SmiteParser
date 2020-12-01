package com.astro.smitebasic.db.player;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameModeRepository extends CrudRepository<PlayerInfo, Integer> {
}
