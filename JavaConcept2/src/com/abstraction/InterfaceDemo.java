package com.abstraction;

interface TestClass {
	int x = 10;
	void complex();
	void complex2(int num);
	
	default void getArea(int... numbers) {
		int result = 0;
		for(int num: numbers) {
			result += num;
		}
		System.out.println("The area is :" +result);
	}
	
	static void getDisplay() {
		getPrivate2();
		System.out.println("This is a static method in interface");
	}
	
	private static void getPrivate2() {
		System.out.println("This is a private two method in interface");
	}
	
}

class TestClassImplement implements TestClass {
	
	int number;

	@Override
	public void complex() {
		System.out.println("Hello World :: " + x);
	}
	
	@Override 
	public void complex2(int num) {
		number = num;
		System.out.println("The value is :: " +(num + x));
	}
	
	public void printDisplay() {
		System.out.println("The value is : " +number);
	}

	// override the default method in interface
//	public void getArea(int x, int y) {
//		System.out.println("Override the default method in interface");
//	}
	
}

public class InterfaceDemo {
	
	public static void main(String[] args) {

		TestClass test = new TestClassImplement();
		test.complex();
		test.complex2(20);
//		test.printDisplay();
		test.getArea(2, 3);
		TestClass.getDisplay();
		
	}

}
