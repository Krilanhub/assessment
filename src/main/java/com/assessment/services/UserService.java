package com.assessment.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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
		BCryptPasswordEncoder bv = new BCryptPasswordEncoder();
		user.setPassword(bv.encode(user.getPassword()));
		userRepository.save(user);
	}

	public void updateuser(User user) {
		BCryptPasswordEncoder bv = new BCryptPasswordEncoder();
		user.setPassword(bv.encode(user.getPassword()));
		userRepository.save(user);
	}

	public void deleteuser(User user) {
		userRepository.delete(user);
	}

}
