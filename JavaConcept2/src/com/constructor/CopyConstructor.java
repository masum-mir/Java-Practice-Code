package com.constructor;

class Complex {
	
	private int num1;
	private int num2;
	
	Complex(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	Complex(Complex c) {
		
		//this is one point
		this(c.num1, c.num2);
		
		// this is two point		
//		num1 = c.num1;
//		num2 = c.num2;
		
	}
	
	 public String toString() {
		 return this.num1 + " " + this.num2;
	 }
	
}

public class CopyConstructor {
	
	public static void main(String[] agrs) {
		
		Complex c = new Complex(10,20);
		
		Complex c1 = new Complex(c);
		
		Complex c3 = c1;
		
		System.out.println(c3);
		
	}

}
