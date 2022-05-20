package com.assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping("/author/viewbook")
	public List<Book> getBooks(@PathVariable Book book) {
		return bookService.getBooks();
	}

	// create book
	@PostMapping("/author/createbook")
	public void addbook(@RequestBody Book book) {
		bookService.addBook(book);

	}

	// update book
	@PutMapping("/author/updatebook")
	public void updatebook(@RequestBody Book book, @PathVariable int bookid, @PathVariable String name,
			@PathVariable String description) {
		bookService.updateBook(bookid, book);
	}

	// delete book
	@DeleteMapping("/author/deletebook")
	public void deletebook(@PathVariable int bookid, Book book) {
		bookService.deleteBook(bookid, book);
	}

}
