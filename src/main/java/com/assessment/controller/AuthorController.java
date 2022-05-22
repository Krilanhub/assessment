package com.assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.entities.Book;
import com.assessment.services.BookService;

@RestController
public class AuthorController {

	@Autowired
	private BookService bookService;

	// view all books
	@GetMapping("/author/viewbooks")
	public List<Book> getBooks() {
		return bookService.getBooks();
	}

	// create book
	@PostMapping("/author/createbook")
	public void addbook(@RequestBody Book book) {
		bookService.addBook(book);

	}

	// update book
	@PutMapping("/author/updatebook")
	public void updatebook(@RequestBody Book book) {
		bookService.updateBook(book);
	}

	// delete book
	@DeleteMapping("/author/deletebook")
	public void deletebook(@RequestBody Book book) {
		bookService.deleteBook(book);
	}

}
