package com.thisKeyword;

class Student{
	int rollno;
	String name;
	float marks;
	
	Student(int rollno, String name, float marks) {
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	
	void display() {
		System.out.println(rollno + " : " + name + " : " + marks);
	}
}

public class OneReferCurrentClassInstanceVariable {
	
	public static void main(String[] agrs) {
		
		Student s1 = new Student(12,"masum", 21.2f);
		
		s1.display();
		
	}

}
