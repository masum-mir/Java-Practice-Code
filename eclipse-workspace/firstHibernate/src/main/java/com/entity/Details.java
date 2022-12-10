package com.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Details {
	
	private String collage_name;
	private int phone_no;
	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCollage_name() {
		return collage_name;
	}
	public void setCollage_name(String collage_name) {
		this.collage_name = collage_name;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
	public Details(String collage_name, int phone_no) {
		super();
		this.collage_name = collage_name;
		this.phone_no = phone_no;
	}
	
	

}
