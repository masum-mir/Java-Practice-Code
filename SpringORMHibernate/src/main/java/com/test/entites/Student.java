package com.test.entites;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
	
	@Id
	private int studentID;
	private String studentName;
	private String studentCity;
	
	public Student(int studentID, String studentName, String studentCity) {
		super();
		this.studentID = studentID;
		this.studentName= studentName;
		this.studentCity = studentCity;
	}
	
	public Student() {
		
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	
	
	

}
