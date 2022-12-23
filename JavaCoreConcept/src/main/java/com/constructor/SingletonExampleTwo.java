package com.constructor;

class Student33 {
	
	private static Student33 student;
	
	private Student33() {
		
	}
	
	public static Student33 getStudent() {
		
		if(student == null) {
			student = new Student33();
		}
		System.out.println("hello, world");
		return student;
		
	}
	
	public void view() {
		System.out.println("view page...");
	}
	
	public int sum(int a,int b) {
		return a+b;
	}
	
	
	
}

public class SingletonExampleTwo {
	public static void main(String[] args) {
		
		Student33 st = Student33.getStudent();
		
		st.view();
		
		
		System.out.println(st.sum(10, 20));
	
		
	}

}
