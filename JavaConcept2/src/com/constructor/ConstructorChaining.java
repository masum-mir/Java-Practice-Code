package com.constructor;

class Temp {
	
	Temp() {
		System.out.println("Default Constructor");
	}
	
	/*Temp(int x) {
		this();
		System.out.println(x);
	}*/
	
	Temp(int x, int y) {
		this();
		System.out.println(x * y);
		
	}
	
}

public class ConstructorChaining {
	
	public static void main(String... ar) {
		new Temp(10,20);
	}

}
