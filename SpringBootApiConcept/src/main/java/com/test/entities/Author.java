package com.test.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int author_id;
	private String author_first_name;
	private String author_last_name;
	private String language;
	
	public int getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(int author_id) {
		this.author_id = author_id;
	}
	public String getAuthor_first_name() {
		return author_first_name;
	}
	public void setAuthor_first_name(String author_first_name) {
		this.author_first_name = author_first_name;
	}
	public String getAuthor_last_name() {
		return author_last_name;
	}
	public void setAuthor_last_name(String author_last_name) {
		this.author_last_name = author_last_name;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	
	
}
