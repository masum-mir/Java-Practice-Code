package com.constructor;

public class Person {
	
	private String name;
	private int personID;
	private Info info;
	
	public Person(String name, int personID, Info info) {
		this.name = name;
		this.personID = personID;
		this.info = info;
	}
	
	@Override
	public String toString() {
		return this.name+" : "+this.personID+" : "+info;
	}
	
	void show() {
		System.out.println(name+ " == "+personID);
	}
	

}
