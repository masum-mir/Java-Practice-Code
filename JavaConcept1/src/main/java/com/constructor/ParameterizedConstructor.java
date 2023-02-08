package com.constructor;

public class ParameterizedConstructor {
	
	int id;
	String name;
	
	public ParameterizedConstructor(int id, String name) {
		this.id = id;
		this.name = name;		
	}
	
	public void display() {
		System.out.println(id+ " : "+name);
	}
	
	public static void main(String [] agres) {
		
		ParameterizedConstructor p1 = new ParameterizedConstructor(12,"Masum");
		ParameterizedConstructor p2 = new ParameterizedConstructor(14, "Ashik");
		
		p1.display();
		p2.display();
	}

}
