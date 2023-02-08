package com.oop;

class TestClass {
	String name;
	int roll;
	TestClass(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}
}

class TestClassIm extends TestClass{
	String dept;
	
	TestClassIm(String dept, String name, int roll) {
		super(name,roll);
		this.dept = dept;
	}
}

public class AssociationDemo {
	
	public static void main(String[] args) {
		TestClassIm m = new TestClassIm("CMT", "Masum", 20);
		System.out.println(m.dept + " " + m.name + " "+ m.roll);
	}

}
