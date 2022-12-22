package com.interfacee;

public class Student extends Info {

	int num1=10,num2=30;
	
	public void sum() {
		int sum = num1+num2;
		System.out.println(sum);
	}

	@Override
	void run() {
		System.out.println("hello, world");		
	}
	
	
}
