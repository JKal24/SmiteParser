package com.astro.smitebasic.db.session;

import com.astro.smitebasic.info.ConnectionInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends CrudRepository<ConnectionInfo, Integer> {
}
