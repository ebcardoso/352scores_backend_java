package com.spiegel.scores352.presentation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spiegel.scores352.application.dto.TournamentCreateDTO;
import com.spiegel.scores352.application.dto.TournamentDTO;
import com.spiegel.scores352.application.service.TournamentsServices;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/v1/tournaments/")
public class TournamentsController {
    @Autowired
    private TournamentsServices tournamentsServices;

    @PostMapping
    public ResponseEntity<TournamentDTO> createTournament(@RequestBody TournamentCreateDTO tournamentDTO) {
        TournamentDTO response = this.tournamentsServices.createTournament(tournamentDTO);
        return(ResponseEntity.ok(response));
    }

    @DeleteMapping("/{id}")
    public void deleteTeam(@PathVariable Long id) {
        this.tournamentsServices.deleteTournament(id);
    }
}
