package com.polymorphism;

class Student21{
	public static void method1() {
		System.out.println("Method call 1");
	}
	public void method2() {
		System.out.println("Method call 2");
	}
}

public class MethodHiding extends Student21{
	
	public static void method1() {
		System.out.println("method call 3");
	}
	
	public void method2() {
		System.out.println("method call 4");
	}
	
	public static void main(String[] agrs) {
		MethodHiding m1 = new MethodHiding();
		
		MethodHiding.method1();
		m1.method2();
		
		Student21 s1 = new Student21();
		s1.method2();
		s1.method1();
	}

}
