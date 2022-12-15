package com.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="ID")
//@DiscriminatorValue(value = "studentthree")
public class StudentThree extends StudentOne {
	
	private double result;

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public StudentThree(double result) {
		super();
		this.result = result;
	}

	public StudentThree() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
