package com.lambda;

import java.util.function.BiFunction;

interface sayable {
	void show();
}


public class StaticMethodReference {
	
	public static void dispay() {
		System.out.println("hello");
	}
	
	public static void display() {
		System.out.println("hello two");
	}
	
	public static void display2() {
		System.out.println("hello");
	}
	
	
	public static void main(String[] args) {
		
		sayable sa = StaticMethodReference::dispay;	
		
		sa.show();
		
		Thread d = new Thread( StaticMethodReference::display);
		
		d.start();
		
		
//		BiFunction<T, U, R> s = StaticMethodReference::display2;
		
		
	}
	

}
 