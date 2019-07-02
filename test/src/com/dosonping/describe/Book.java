package com.dosonping.describe;

import java.util.List;

public class Book {
	private String name;
	private List<Person> author;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Person> getAuthor() {
		return author;
	}
	public void setAuthor(List<Person> author) {
		this.author = author;
	}
}
