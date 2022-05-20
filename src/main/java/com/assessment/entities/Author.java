package com.assessment.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	private int authorid;
	private String name;
	private String email;
	private char gender;

	public Author(int authorid, String name, String email, char gender) {
		super();
		this.authorid = authorid;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public int getAuthorid() {
		return authorid;
	}

	public void setAuthorid(int authorid) {
		this.authorid = authorid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Author [authorid=" + authorid + ", name=" + name + ", email=" + email + ", gender=" + gender + "]";
	}

}
