package com.assessment.repository;

import org.springframework.data.repository.CrudRepository;

import com.assessment.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
