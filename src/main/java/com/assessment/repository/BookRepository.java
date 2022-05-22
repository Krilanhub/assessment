package com.assessment.repository;

import org.springframework.data.repository.CrudRepository;

import com.assessment.entities.Book;

public interface BookRepository extends CrudRepository<Book, Integer> {

}
