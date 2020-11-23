package com.wfp.service;

import java.util.List;
import java.util.Optional;

import com.wfp.models.Position;

public interface PositionService {
	
	Optional<Position> findOne (Integer id);
	List<Position> findAll();
	List<Position> findByUser(String email);
	void save(Position position);
	void update(Position position);
	void delete(Integer id);
	void delete(Position position);

}
