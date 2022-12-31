package com.thisKeyword;

class A4 {
	A4 getA() {
		return this;
	}
	
	void msg() {
		System.out.println("Hello, world");
	}
	
	void msg2() {
		System.out.println("hi");
	}
}

//class A5{
//	void m() {
//		System.out.println(this);
//	}
//}

public class SixReturnCurrentClassInstance {
	public static void main(String[] agrs) {
		
		new A4().getA().msg();
		
		A4 a = new A4().getA();
		a.msg2();
		
//		A5 obj = new A5();
//		System.out.println(obj);
//		obj.m(); 
		
	}
}
