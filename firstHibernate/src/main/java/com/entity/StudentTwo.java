package com.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="ID")
//@DiscriminatorValue(value="studenttwo")
public class StudentTwo extends StudentOne {
	
	private String dept;
	private String dept2;
	
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDept2() {
		return dept2;
	}
	public void setDept2(String dept2) {
		this.dept2 = dept2;
	}
	public StudentTwo(String dept, String dept2) {
		super();
		this.dept = dept;
		this.dept2 = dept2;
	}
	public StudentTwo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
