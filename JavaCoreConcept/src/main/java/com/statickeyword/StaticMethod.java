package com.statickeyword;

class StudentTest{
	int rollno;
	String name;
	static String college = "kipi";
	
	static void change() {
		college = "kpi";
	}
	
	StudentTest(int rollno, String name) {
		this.rollno = rollno;
		this.name = name;
	}
	
	void display() {
		System.out.println(rollno + " : "+name+" : " + college);
	}
	
}

public class StaticMethod {
	public static void main(String[] agrs) {
		
		StudentTest s1 = new StudentTest(1,"Masum");
		StudentTest s2 = new StudentTest(2, "ABC");
		StudentTest s3 = new StudentTest(3, "EFG");
		
		StudentTest.change(); 	 			// calling change method
		
		s1.display();
		s2.display();
		s3.display();
		
		
	}
}
