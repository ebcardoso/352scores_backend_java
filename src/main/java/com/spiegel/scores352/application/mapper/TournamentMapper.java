package com.spiegel.scores352.application.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.spiegel.scores352.application.dto.TournamentCreateDTO;
import com.spiegel.scores352.application.dto.TournamentDTO;
import com.spiegel.scores352.domain.model.Tournament;

@Mapper(componentModel = "spring")
public interface TournamentMapper {
    TournamentMapper INSTANCE = Mappers.getMapper(TournamentMapper.class);

    Tournament toEntity(TournamentCreateDTO dto);
    TournamentDTO toDto(Tournament model);
}
