package com.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.services.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;
	




}
