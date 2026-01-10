package com.spiegel.scores352.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spiegel.scores352.application.mapper.TournamentMapper;
import com.spiegel.scores352.domain.repository.TournamentsRepository;

@Service
public class TournamentsServices {
    @Autowired
    private TournamentsRepository tournamentsRepository;

    @Autowired
    private TournamentMapper mapper;
}
