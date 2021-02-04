package com.astro.smitebasic.repositories;

import com.astro.smitebasic.objects.session.SessionInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends CrudRepository<SessionInfo, Integer> {
}
