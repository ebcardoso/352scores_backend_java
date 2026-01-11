package com.spiegel.scores352.application.dto;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TournamentDTO {
    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("startDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @JsonProperty("endDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    @JsonProperty("tournamentType")
    private int tournamentType;

    @JsonProperty("active")
    private boolean active;
}
