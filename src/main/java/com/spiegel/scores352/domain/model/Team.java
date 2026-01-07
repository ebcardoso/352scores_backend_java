package com.spiegel.scores352.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "team")
public class Team extends BaseModel {    
    @Column(name = "name")
    private String name;

    @Column(name = "city_team")
    private String cityTeam;

    @Column(name = "is_active")
    private boolean active;
}
