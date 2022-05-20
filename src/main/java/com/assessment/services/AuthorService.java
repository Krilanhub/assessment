package com.assessment.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.entities.Author;
import com.assessment.repository.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;

	public List<Author> getAuthors() {
		List<Author> authors = new ArrayList<>();
		authorRepository.findAll().forEach(authors::add);
		return authors;

	}

	public void createAuthor(Author author) {
		authorRepository.save(author);
	}

	public void updateBook(int authorid, Author author) {
		authorRepository.save(author);
	}

	public void deleteBook(int authorid, Author author) {
		authorRepository.delete(author);
	}

}
