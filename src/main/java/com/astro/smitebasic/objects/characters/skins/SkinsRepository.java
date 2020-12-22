package com.astro.smitebasic.objects.characters.skins;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkinsRepository extends CrudRepository<SkinsInfo, Integer> {
}
