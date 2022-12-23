package com.stereotype.annotation;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*@Component*/
@Component("ob")
public class Student {
	
	
	@Value("hello world")
	private String name;
	@Value("34")
	private int roll;
	@Value("#{temp}")
	private List<String> courses;
	
	
	
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + "]";
	}

}
