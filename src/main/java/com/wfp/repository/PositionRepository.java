package com.wfp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wfp.models.Position;
import java.util.List;

public interface PositionRepository extends JpaRepository<Position, Integer> {

    List<Position> findByUserEmail(String email);

}
