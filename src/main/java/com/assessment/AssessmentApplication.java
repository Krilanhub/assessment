package com.assessment;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.assessment.entities.User;
import com.assessment.repository.UserRepository;

@SpringBootApplication
public class AssessmentApplication {
	
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(AssessmentApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		BCryptPasswordEncoder bv = new BCryptPasswordEncoder();
		if (userRepository.findByusernameOnly("admin") == null) {
			User u = new User();
			u.setEmail("admin@admin.com");
			
			u.setPassword(bv.encode("admin"));
			u.setRole("ROLE_ADMIN");
			u.setUsername("admin");
			userRepository.save(u);

			User a = new User();
			a.setEmail("author@author.com");
			
			a.setPassword(bv.encode("author"));
			a.setRole("ROLE_AUTHOR");
			a.setUsername("author");
			userRepository.save(a);
			
			User s = new User();
			s.setEmail("studetn@student.com");
			
			s.setPassword(bv.encode("student"));
			s.setRole("ROLE_STUDENT");
			s.setUsername("student");
			userRepository.save(s);
		}
	}

}
