package com.binode.stagecoachhunter.repositories;

import com.binode.stagecoachhunter.entity.Coordinate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoordinateRepository extends JpaRepository<Coordinate, Integer> {
}
