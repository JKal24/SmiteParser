package com.astro.smitebasic.db.session;

import com.astro.smitebasic.api.session.SessionInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends CrudRepository<SessionInfo, Integer> {
}
