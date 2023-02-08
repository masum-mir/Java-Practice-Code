package com.thisKeyword;

class Teacher{
	int rollno;
	String name,course;
	float marks;
	
	Teacher(int rollno, String name, String course){
		this.rollno = rollno;
		this.name = name;
		this.course = course;
		
	}
	
	Teacher(int rollno, String name, String course, float marks) {
//		this.rollno = rollno;
//		this.name = name;
//		this.course = course;
		this(rollno, name, course);
		this.marks = marks;
	}
	
	public void display() {
		System.out.println(rollno + " : " + name + " : "+ course + " : "+ marks);
	}
	
}

public class RealUsageOne {
	public static void main(String[] agrss) {
		Teacher t2 = new Teacher(12, "abc", "java");
		Teacher t1 = new Teacher(12,"masum", "CMT", 123);
		
			t1.display();
			t2.display();
	}

}
