package com.assessment.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.entities.Book;
import com.assessment.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<>();
		bookRepository.findAll().forEach(books::add);
		return books;

	}

	public void addBook(Book book) {
		bookRepository.save(book);
	}

	public void updateBook( Book book) {
		bookRepository.save(book);
	}

	public void deleteBook( Book book) {
		bookRepository.delete(book);
	}

}
