package com.abstraction;

interface Temp {
	default void add (int a, int b) {
		sub(a,b);
		System.out.println("Answer by add method:: "+(a+b));
	}
	
	private void sub(int a, int b) {
		System.out.println("Answer by private method:: "+(a-b));
	}
	
	static void div(double a, double b) {
		mul(a,b);
		System.out.println("Answer by static method:: "+(a/b));
	}
	
	private static void mul(double a, double b) {
		System.out.println("Answer by private static method:: "+(a%b));
	}
}

class TempImpl implements Temp {
	
	
}

public class InterfaceTest {
	public static void main(String[] agrs) {
		
		TempImpl temp = new TempImpl();
		temp.add(10, 5);
		
		Temp.div(16, 7);
		
	}

}
