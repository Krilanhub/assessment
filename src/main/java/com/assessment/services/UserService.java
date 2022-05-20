package com.assessment.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.entities.User;
import com.assessment.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getUsers() {
		List<User> users = new ArrayList<>();
		userRepository.findAll().forEach(users::add);
		return users;

	}

	public void createuser(User user) {
		userRepository.save(user);
	}

	public void edituser(int userid, User user) {
		userRepository.save(user);
	}

	public void deleteuser(int userid, User user) {
		userRepository.delete(user);
	}

}
