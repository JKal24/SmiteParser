package com.astro.smitebasic.repositories;

import com.astro.smitebasic.objects.session.SessionInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SessionRepository extends JpaRepository<SessionInfo, Integer> {
}
