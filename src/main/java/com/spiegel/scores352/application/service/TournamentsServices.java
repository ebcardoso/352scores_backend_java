package com.spiegel.scores352.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spiegel.scores352.application.dto.TournamentCreateDTO;
import com.spiegel.scores352.application.dto.TournamentDTO;
import com.spiegel.scores352.application.mapper.TournamentMapper;
import com.spiegel.scores352.domain.model.Tournament;
import com.spiegel.scores352.domain.repository.TournamentsRepository;

@Service
public class TournamentsServices {
    @Autowired
    private TournamentsRepository tournamentsRepository;

    @Autowired
    private TournamentMapper mapper;

    public TournamentDTO createTournament(TournamentCreateDTO tournamentCreateDTO) {
        Tournament tournament = this.mapper.toEntity(tournamentCreateDTO);
        Tournament savedTournament = this.tournamentsRepository.save(tournament);

        return(this.mapper.toDto(savedTournament));
    }
    
    public void deleteTournament(Long id) {
        this.tournamentsRepository.deleteById(id);
    }
}
