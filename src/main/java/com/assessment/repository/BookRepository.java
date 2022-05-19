package com.assessment.repository;

import java.util.List;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

import com.assessment.entities.Book;

public interface BookRepository extends CrudRepository<Book, Id> {

	public List<Book> findByBookId(int bookId);
	
	public List<Book> delete(int bookid);
}
