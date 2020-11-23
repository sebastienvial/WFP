package com.wfp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfp.models.Position;
import com.wfp.repository.PositionRepository;
import com.wfp.service.PositionService;

@Service
public class PositionServiceImpl implements PositionService {
	
	@Autowired
	PositionRepository repository;

	@Override
	public Optional<Position> findOne(Integer id) {
		return repository.findById(id);
	}
	
	@Override
	public List<Position> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(Position position) {
		repository.save(position);		
	}

	@Override
	public void update(Position position) {
		repository.save(position);		
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void delete(Position position) {repository.delete(position);
	}

	

	

	

}
