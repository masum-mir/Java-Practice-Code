package com.statickeyword;

class Student{
	int rollno;
	String name;
	
	static String college = "kipi";
	
	Student(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	void display() {
		System.out.println(rollno + " : "+name+" : " + college);
	}
}

public class StaticVariable {
	
	public static void main(String[] agrs) {
		
		Student s1 = new Student(12,"masum");
		Student s2 = new Student(13,"AbC");
		
		
		s1.display();
		s2.display();
		
	}

}
