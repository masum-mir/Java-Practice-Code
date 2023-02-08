package com.program;

class Student11 {
	public void add(int x) {
		System.out.println("The value is: "+ x);
	}
	public void add(int x, int y) {
		System.out.println("The sum is: "+(x+y));
	}
	
	public void add(int x, double y) {
		System.out.println("The sum is: "+(x+y));
	}
	
}


public class MethodOverloading {
	public static void main(String[] args) {
		
		Student11 s1 = new Student11();
		s1.add(15);
		s1.add(10, 20);
		s1.add(23, 12.4);
		
	}
}