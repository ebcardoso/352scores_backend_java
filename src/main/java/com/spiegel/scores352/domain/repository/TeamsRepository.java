package com.spiegel.scores352.domain.repository;

import com.spiegel.scores352.domain.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamsRepository extends JpaRepository<Team, Integer> {

}
