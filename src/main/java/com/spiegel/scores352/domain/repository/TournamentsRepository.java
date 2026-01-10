package com.spiegel.scores352.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.spiegel.scores352.domain.model.Tournament;

public interface TournamentsRepository extends JpaRepository<Tournament, Long> {

}
