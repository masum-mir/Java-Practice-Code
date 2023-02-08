package com.polymorphism;

class Student7 {
	int id,roll;
	String name, dept;
	Student7(int id, String name, String dept) {
		this.id = id;
		this.name = name;
		this.dept = dept;
	}
	
	Student7(int roll) {
		this(12,"masum","cmt");
		this.roll = roll;
	}
	
}

public class ConstrcutorOverloading {
	public static void main(String[] agrs) {
		
		Student7 s1 = new Student7(20);
		
		System.out.println("Name: "+s1.name +" \nRoll: "+s1.roll+"\nDept: "+s1.dept+"\nID: "+s1.id);
	}

}
