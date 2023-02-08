package com.enumexm;

public class Test {

	public static void main(String[] args) {
		Days day = Days.April;
		
		switch(day) {
		case February : 
			System.out.println("February Month");
			break;
		case January: 
			System.out.println("January Month");
			break;
		case March: 
			System.out.println("March Month");
			break;
		case April: 
			System.out.println("April month");
			break;
		default:
			System.out.println("......");
		}

	}

}
