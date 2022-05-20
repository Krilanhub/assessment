package com.assessment.repository;

import org.springframework.data.repository.CrudRepository;

import com.assessment.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {

}
