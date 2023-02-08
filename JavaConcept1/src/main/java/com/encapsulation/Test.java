package com.encapsulation;

class Stu{
	private int rollno;
	private String name;
	private float marks;
	
	public int getRollno() {
		return rollno;
	}
	
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public float getMarks() {
		return marks;
	}
	
	public void setMarks(float marks) {
		this.marks = marks;
	}

	
	
}

public class Test {
	public static void main(String[] agrs) {
		
		Stu s1 = new Stu();
		s1.setRollno(12);
		System.out.println(s1.getRollno());
		
		s1.setName("masum");
		System.out.println(s1.getName());
		
		s1.setMarks(4.223f);
		System.out.println(s1.getMarks());
	}

}
