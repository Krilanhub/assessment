package com.assessment.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.assessment.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

	Optional<User> findByusername(String username);

	@Query("select u from User u where u.username=?1")
	User findByusernameOnly(String username);

}
