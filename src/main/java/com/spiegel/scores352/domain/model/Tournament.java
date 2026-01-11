package com.spiegel.scores352.domain.model;

import java.time.LocalDate;
import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tournament")
public class Tournament extends BaseModel {
    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate startDate;

    @Column(name = "end_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate endDate;

    @Column(name = "tournament_type")
    private int tournamentType;

    @Column(name = "is_active")
    private boolean active;
}
