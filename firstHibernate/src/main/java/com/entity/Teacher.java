package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="myStudents")
public class Teacher {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String city;
	
	private Details detail;
	
	
	public Details getDetail() {
		return detail;
	}
	public void setDetail(Details detail) {
		this.detail = detail;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Teacher(int id, String name, String city, Details detail) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.detail = detail;
	}
	public Teacher() {
		super();
	}
	

}
