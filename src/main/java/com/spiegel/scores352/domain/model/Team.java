package com.spiegel.scores352.domain.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "team")
@Data
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "name")
    private String name;

    @Column(name = "city_team")
    private String cityTeam;

    @Column(name = "is_active")
    private boolean active;
}
