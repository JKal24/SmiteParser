package com.astro.smitebasic.db.repositories;

import com.astro.smitebasic.info.ConnectionInfo;
import org.springframework.data.repository.CrudRepository;

public interface SessionRepository extends CrudRepository<ConnectionInfo, String> {
}
