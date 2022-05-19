package com.assessment.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.entities.Book;

@RestController
public class UserController 
{
	
	@GetMapping("/admin/viewusers")
	public List<User> viewUser() {
		//returns users from repository
	}
	
	@PostMapping("/admin/createuser")
	public boolean createUser (User user) {
		//return true if save success return false if fail
	}
	// same for edit and delete
	
	@GetMapping("/author/viewbook")
	public List<Book> viewBook() {
		//returns books from repository
	}
	
	@PostMapping("/author/createbook")
	public boolean createUser (UserController user) {
		//return true if book save success return false if fail 
	}
	
	@GetMapping("/student/viewbooks")
	public List<Book> viewBooks(){
		// returns books from repository
		
	}
	
}


