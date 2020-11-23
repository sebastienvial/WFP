package com.wfp.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wfp.models.User;
import com.wfp.repository.UserRepository;
import com.wfp.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository repository; 

	@Override
	public Optional<User> findOne(Integer id) {
		return repository.findById(id);
	}

	@Override
	public List<User> findAll() {
		return repository.findAll();
	}

	@Override
	public void save(User user) {
		repository.save(user);		
	}

	@Override
	public void update(User user) {
		repository.save(user);		
	}

	@Override
	public void delete(Integer id) {
		repository.deleteById(id);
	}

	@Override
	public void delete(User user) {
		repository.delete(user);
	}

	@Override
	public List<User> findBySite(String site) {
		repository.findBySite(site);
		return null;
	}

}
