package com.collection;

import java.util.*;

public class Student {
	
	private int stId;
	private String name;
	private List<String> phones;
	private Set<String> address;
	private Map<String, String> courses;
	
	
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int stId, String name, List<String> phones, Set<String> address, Map<String, String> courses) {
		super();
		this.stId = stId;
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.courses = courses;
	}

}
