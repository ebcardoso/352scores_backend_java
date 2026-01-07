package com.spiegel.scores352.presentation.controller;

import com.spiegel.scores352.application.dto.TeamCreateDTO;
import com.spiegel.scores352.application.dto.TeamDTO;
import com.spiegel.scores352.application.dto.TeamUpdateDTO;
import com.spiegel.scores352.application.service.TeamsServices;
import com.spiegel.scores352.presentation.response.PaginatedResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/teams/")
public class TeamsController {
    @Autowired
    private TeamsServices teamsServices;
    
    @GetMapping
    public ResponseEntity<PaginatedResponse<TeamDTO>> listTeams(Pageable pageable) {
        Page<TeamDTO> page = this.teamsServices.listTeams(pageable);
        PaginatedResponse<TeamDTO> response = new PaginatedResponse<TeamDTO>(page);
        return(ResponseEntity.ok(response));
    }

    @GetMapping("/{id}")
    public ResponseEntity<TeamDTO> findTeamById(@PathVariable Integer id) {
        TeamDTO response = this.teamsServices.findTeamByID(id);
        return(ResponseEntity.ok(response));
    }

    @PostMapping
    public ResponseEntity<TeamDTO> createTeam(@RequestBody TeamCreateDTO teamDTO) {
        TeamDTO response = this.teamsServices.createTeam(teamDTO);
        return(ResponseEntity.ok(response));
    }

    @PutMapping
    public ResponseEntity<TeamDTO> updateTeam(@RequestBody TeamUpdateDTO teamDTO) {
        TeamDTO response = this.teamsServices.updateTeam(teamDTO);
        return(ResponseEntity.ok(response));
    }

    @DeleteMapping("/{id}")
    public void deleteTeam(@PathVariable Integer id) {
        this.teamsServices.deleteTeam(id);
    }
}
