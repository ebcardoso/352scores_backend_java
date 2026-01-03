package com.spiegel.scores352.application.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class TeamCreateDTO {
    @NotNull(message = "'name' is required")
    @NotEmpty(message = "'name' is required")
    @NotBlank(message = "'name' is required")
    @JsonProperty("name")
    private String name;

    @NotNull(message = "'city_team' is required")
    @NotEmpty(message = "'city_team' is required")
    @NotEmpty(message = "'city_team' is required")
    @JsonProperty("city_team")
    private String cityTeam;

    @JsonProperty("active")
    private boolean active = true;
}
