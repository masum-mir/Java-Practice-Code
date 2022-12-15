package com.constructor;

public class OverloadingConstructor {
	int id;
	String name;
	float marks;
	
	OverloadingConstructor(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	OverloadingConstructor(int id, String name, float marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	void display() {
		System.out.println(id + " : " + name + " : " + marks);
	}
	
	public static void main(String [] agrs) {
		
		OverloadingConstructor o1 = new OverloadingConstructor(12,"ABC");
		OverloadingConstructor o2 = new OverloadingConstructor(14, "EFG", 12.43f);
		
		o1.display();
		o2.display();
		
	}

}
