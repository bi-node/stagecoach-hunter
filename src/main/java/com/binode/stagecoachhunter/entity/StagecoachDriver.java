package com.binode.stagecoachhunter.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class StagecoachDriver extends User{
    @NotEmpty
    private boolean availability;

    @Enumerated(EnumType.STRING)
    private StagecoachType stagecoachType;

    @OneToOne
    private Coordinate currentLocation;




}
