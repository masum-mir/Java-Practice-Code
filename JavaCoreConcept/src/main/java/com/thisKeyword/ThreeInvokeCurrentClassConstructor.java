package com.thisKeyword;

class B {
	
	B() {
		System.out.println("Hello, world");
	}
	
	B(int a) {
		this();
		System.out.println(a);
	}
	
}

class C {
	C() {
		this(50);
		System.out.println("hello,..");
	}
	C(int x) {
		System.out.println(x);
	}
}

public class ThreeInvokeCurrentClassConstructor {
	public static void main(String[] ars) {
		
		new B(10);
		new C();
	}

}
