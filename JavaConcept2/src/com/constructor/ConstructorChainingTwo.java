package com.constructor;

class Base{
	String name;
	
	Base() {
		this("");
		System.out.println("Default constructor");
	}
	
	Base(String name) {
		this.name = name;
		System.out.println("Parameterized constructor");
	}
}

class Derived extends Base {
	
	Derived() {
		System.out.println("default - Derived");
	}
	
	Derived(String name) {
//		super(name);
		System.out.println("Parameterized - Derived");
	}
	
}

public class ConstructorChainingTwo {

	public static void main(String[] args) {
		
		Derived obj = new Derived();
	
	}

}
