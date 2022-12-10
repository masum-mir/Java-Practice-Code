package com.constructor;

public class TestOne {
	
	int num;
	int num2;
	
	TestOne(int x,int y) {
		num = x;
		num2 = y;
	}
	
	public static void main(String[] args) {
		
		TestOne t = new TestOne(5, 40);
		
		System.out.println(t.num);
		System.out.println(t.num2);
		
	}

}
