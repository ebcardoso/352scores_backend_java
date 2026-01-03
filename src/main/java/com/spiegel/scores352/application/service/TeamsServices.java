package com.spiegel.scores352.application.service;

import com.spiegel.scores352.application.dto.TeamCreateDTO;
import com.spiegel.scores352.application.dto.TeamDTO;
import com.spiegel.scores352.application.mapper.TeamMapper;
import com.spiegel.scores352.domain.model.Team;
import com.spiegel.scores352.domain.repository.TeamsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeamsServices{
    @Autowired
    private TeamsRepository repository;

    @Autowired
    private TeamMapper mapper;

    public TeamDTO createTeam(TeamCreateDTO teamCreateDTO) {
        Team team = this.mapper.toEntity(teamCreateDTO);
        Team savedTeam = this.repository.save(team);

        return(this.mapper.toDto(savedTeam));
    }
}
