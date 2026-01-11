package com.spiegel.scores352.application.dto;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TournamentCreateDTO {
    @NotNull(message = "'name' is required")
    @NotEmpty(message = "'name' is required")
    @NotBlank(message = "'name' is required")
    @JsonProperty("name")
    private String name;

    @NotNull(message = "'startDate' is required")
    @NotEmpty(message = "'startDate' is required")
    @NotBlank(message = "'startDate' is required")
    @JsonProperty("startDate")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @NotNull(message = "'endDate' is required")
    @NotEmpty(message = "'endDate' is required")
    @NotBlank(message = "'endDate' is required")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonProperty("endDate")
    private LocalDate endDate;

    @NotNull(message = "Tournament type cannot be null")
    @Min(value = 1, message = "Tournament type must be greater than or equal to 1")
    @Max(value = 3, message = "Tournament type must be less than or equal to 1000")
    @JsonProperty("tournamentType")
    private int tournamentType;

    @JsonProperty("active")
    private boolean active = true;
}
