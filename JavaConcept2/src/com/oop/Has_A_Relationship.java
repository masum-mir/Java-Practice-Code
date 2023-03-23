package com.oop;

class Student {
	String name;
	int roll;
	double marks;
	
	Student(String name, int roll, double marks) {
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
}
//Runnable, Callable, Comparable, Predicate, Serializable, Cloneabl, Remote
class ABC {
	String dept;
	Student student;
	
	ABC(String dept, Student student) {
		this.dept = dept;
		this.student = student;
	}
	
}

public class Has_A_Relationship {
	public static void main(String[] args) {
		
		Student student = new Student("Masum", 20, 50.0);
		ABC a = new ABC("CMT", student);
		
		System.out.println(a.dept);
		System.out.println(a.student.name);
		System.out.println(a.student.roll);
		System.out.println(a.student.marks);
		
		
	}

}
