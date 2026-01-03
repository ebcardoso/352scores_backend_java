package com.spiegel.scores352.presentation.controller;

import com.spiegel.scores352.application.dto.TeamCreateDTO;
import com.spiegel.scores352.application.dto.TeamDTO;
import com.spiegel.scores352.application.service.TeamsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/teams/")
public class TeamsController {
    @Autowired
    private TeamsServices teamsServices;

    @PostMapping
    public ResponseEntity<TeamDTO> createTeam(@RequestBody TeamCreateDTO teamDTO) {
        TeamDTO response = this.teamsServices.createTeam(teamDTO);
        return(ResponseEntity.ok(response));
    }
}
