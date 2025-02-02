package com.binode.stagecoachhunter.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RideRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    private User requester;

    @OneToOne
    private Coordinate pickupLocation;

    @OneToOne
    private Coordinate dropOffLocation;

    @Enumerated(EnumType.STRING)
    private StagecoachType stagecoachType;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;

    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;
}

