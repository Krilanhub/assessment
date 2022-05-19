package com.assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.entities.Book;
import com.assessment.services.BookService;

@RestController
public class StudentController {
	
	@Autowired
	private BookService bookService;
	
	// view all books
		@GetMapping("/student/viewbooks")
		public List<Book> getBooks(@PathVariable Book book) {
			return bookService.getBooks();
		}

}
