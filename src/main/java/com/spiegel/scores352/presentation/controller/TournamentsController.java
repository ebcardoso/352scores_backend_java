package com.spiegel.scores352.presentation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spiegel.scores352.application.service.TournamentsServices;

@RestController
@RequestMapping("/v1/tournaments/")
public class TournamentsController {
    @Autowired
    private TournamentsServices tournamentsServices;
}
