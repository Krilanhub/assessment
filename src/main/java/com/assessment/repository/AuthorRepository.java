package com.assessment.repository;

import org.springframework.data.repository.CrudRepository;

import com.assessment.entities.Author;

public interface AuthorRepository extends CrudRepository<Author, Integer> {

}
