package com.assessment.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assessment.entities.Student;
import com.assessment.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;

	}

	public void createuser(Student student) {
		studentRepository.save(student);
	}

	public void edituser(int studentid, Student student) {
		studentRepository.save(student);
	}

	public void deleteuser(int studentid, Student student) {
		studentRepository.delete(student);
	}

}
