package com.inheritance;

class A {
	void eat() {
		System.out.println("eating..");
	}
	
}

class B extends A {
	void bark() {
		System.out.println("barking..");
	}
}

class C extends B {
	void weep() {
		System.out.println("weeping..");
	}
}

public class MultilevelInheritance {
	public static void main(String[] ags) {
		C c = new C();
		c.weep();
		c.bark();
		c.eat();
	}
}
