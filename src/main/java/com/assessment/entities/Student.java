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
	private String address;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Student(int studentid, String name, String address) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", address=" + address + "]";
	}

}
