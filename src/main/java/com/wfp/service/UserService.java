package com.wfp.service;

import java.util.List;
import java.util.Optional;

import com.wfp.models.User;

public interface UserService {
	
	Optional<User> findOne(Integer id);
	
	List<User> findAll();
	List<User> findBySite(String site);
	void save(User user);
	void update(User user);
	void delete(Integer id);
	void delete(User user);

}
