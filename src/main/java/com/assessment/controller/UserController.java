
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

import com.assessment.entities.User;
import com.assessment.services.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/admin/viewusers")
	public List<User> getUsers(@RequestBody User user) {
		return userService.getUsers();

	}

	@PostMapping("/admin/createuser")
	public void createUser(@RequestBody User user) {
		userService.createuser(user);
	}

	// update user
	@PutMapping("/admin/updateuser")
	public void updateuser(@RequestBody User user, @PathVariable int userid) {
		userService.updateuser(userid, user);
	}

	// delete user
	@DeleteMapping("/admin/deleteuser")
	public void deleteuser(@RequestBody User user, @PathVariable int userid) {
		userService.deleteuser(userid, user);
	}

}
