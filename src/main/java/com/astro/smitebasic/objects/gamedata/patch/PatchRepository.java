package com.astro.smitebasic.objects.gamedata.patch;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatchRepository extends CrudRepository<PatchInfo, Integer> {
}
