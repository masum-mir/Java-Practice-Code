package com.beans;

import java.io.Serializable;

public class UserBean implements Serializable {
	
	private String name;
	private String dept;
	private int roll;
	private double result;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}

	@Override
	public String toString() {
		return "UserBean [name=" + name + ", dept=" + dept + "]";
	}
	
	
	
}
