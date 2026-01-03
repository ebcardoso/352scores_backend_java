package com.spiegel.scores352.application.mapper;

import com.spiegel.scores352.application.dto.TeamCreateDTO;
import com.spiegel.scores352.application.dto.TeamDTO;
import com.spiegel.scores352.domain.model.Team;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface TeamMapper {
    TeamMapper INSTANCE = Mappers.getMapper(TeamMapper.class);

    Team toEntity(TeamCreateDTO dto);
    TeamDTO toDto(Team model);
}
