package com.constructor;

class Base {
	String name;
	
	Base() {
		this(" ");
		System.out.println("Hello, world");
	}
	
	Base(String name) {
		this.name = name;
		System.out.println("Hello, ");
	}
}

class Derived extends Base {
	Derived() {
		System.out.println("hi, world");
	}
	
	Derived(String name) {
		super(name);
		System.out.println("hi");
	}
}

public class ConstructorChaining {
	
	public static void main(String[] agrs) {
		Derived d = new Derived("test");
	}

}
