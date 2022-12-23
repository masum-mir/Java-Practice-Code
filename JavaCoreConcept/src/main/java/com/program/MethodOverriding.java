package com.program;

class Student13{
	void print() {
		System.out.println("Bangladesh is a beautiful country.");
	}
	void sum(int x, int y) {
		System.out.println("sum : " + (x+y));
	}
}

class Student14 extends Student13{
	
	@Override
	void print() {
		System.out.println("hello, world");
	}
	
	@Override
	void sum(int x, int y) {
		System.out.println("muliplication : " + (x*y));
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		
		Student14 st = new Student14();
		st.print();
		st.sum(10, 20);
		
	}

}