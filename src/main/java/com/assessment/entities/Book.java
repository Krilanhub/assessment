package com.assessment.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {

	@Id
	private int bookid;
	private String name;
	private String description;

	public Book(int bookid, String name, String description) {
		super();
		this.bookid = bookid;
		this.name = name;
		this.description = description;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}