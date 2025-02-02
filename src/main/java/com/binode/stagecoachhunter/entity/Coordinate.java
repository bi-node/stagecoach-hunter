package com.binode.stagecoachhunter.entity;

import jakarta.persistence.*;
import lombok.*;



@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity (name="coordinates")
@Builder
public class Coordinate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int coOrdinateId;
    private int x;
    private int y;

    private String addressName;


}
