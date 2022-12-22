package com.FourFiveFeatures;

public class Varargs {
	
//	public static void display(int...num , int b) {} // compile time error
//	public static void display(int..num, int...b) {} // compile time error
	public static void display(int b, int... num ) {
		for(int r: num) {
			System.out.println(r);
		}
	}
	
	public static void main(String[] agrs) {
		
		Varargs.display(10,20,30,40,99);
		
	}

}
