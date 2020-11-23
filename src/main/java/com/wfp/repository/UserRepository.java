package com.wfp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.wfp.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	@Query(value = "SELECT * FROM user WHERE site = ?1",
			nativeQuery = true)
	List<User> findBySite(String site);

}
