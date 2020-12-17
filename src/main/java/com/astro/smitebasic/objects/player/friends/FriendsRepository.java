package com.astro.smitebasic.objects.player.friends;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendsRepository extends CrudRepository<FriendsInfo, Integer> {
}
