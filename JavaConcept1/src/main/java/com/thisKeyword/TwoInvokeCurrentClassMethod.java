package com.thisKeyword;

class A{
	public void m() {
		System.out.println("Hello, world");
	}
	// if we don't use this keyword, compiler automatically adds this keyword while invoking the method.
	public void n() {
		System.out.println("Hello");
		m();
	}
}

public class TwoInvokeCurrentClassMethod {
	public static void main(String[] ags) {
		A a = new A();
		
		a.m();
		a.n();
	}

}
