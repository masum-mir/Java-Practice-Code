package com.abstraction;


interface A {
	void display();
}

abstract class B {
	abstract void print();
}

abstract class C extends B implements A {
	@Override
	public void display() {
		System.out.println("Interface class Display method override 2");
	}
}

class F extends C {

	@Override
	void print() {
		System.out.println("Abstract class B override");
	}

	@Override
	public void display() {
		System.out.println("Interface class Display method override 1");
	}
	
}

public class Test {

	public static void main(String[] args) {
		C f = new F();
		f.print();
		f.display();
		
	}
	
}
