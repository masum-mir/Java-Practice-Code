package com.map;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class OneToOneMap {
	
	@Id
//	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="a_id")
	private int a_id;
	private String clg;
	private int roll;
	@OneToOne(mappedBy = "oneToMap")
//	@OneToOne
	private OneToOneM oneTo;
	
	
	
	public int getA_id() {
		return a_id;
	}
	public void setA_id(int a_id) {
		this.a_id = a_id;
	}
	public String getClg() {
		return clg;
	}
	public void setClg(String clg) {
		this.clg = clg;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public OneToOneM getOneTo() {
		return oneTo;
	}
	public void setOneTo(OneToOneM oneTo) {
		this.oneTo = oneTo;
	}
	
	
	
	
	

}
