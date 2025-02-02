package com.binode.stagecoachhunter.entity;

import jakarta.persistence.*;
import lombok.*;



@Setter
@Getter
@Entity (name="coordinates")
public class Coordinate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int coOrdinateId;
    private int x;
    private int y;

    public Coordinate() {
    }

    public Coordinate(int coOrdinateId, int x, int y) {
        this.coOrdinateId = coOrdinateId;
        this.x = x;
        this.y = y;
    }

}
