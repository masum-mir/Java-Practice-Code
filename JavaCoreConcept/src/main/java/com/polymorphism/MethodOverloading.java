package com.polymorphism;

class Student11 {
	
	public void print(int x, int y) {
		System.out.println("The sum is: "+(x+y));
	}
	
	public void print(int x, double y) {
		System.out.println("The sum is: "+(x+y));
	}
	
}


public class MethodOverloading {
	public static void main(String[] args) {
		
		Student11 s1 = new Student11();
		s1.print(10, 20);
		s1.print(23, 12.4);
		
	}
}
