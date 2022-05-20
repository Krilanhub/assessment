package com.assessment.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int studentid;
	private String name;
	private int age;
	private int grade;
	private String address;

	public Student(int studentid, String name, int age, int grade, String address) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.address = address;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", age=" + age + ", grade=" + grade + ", address="
				+ address + "]";
	}

}
