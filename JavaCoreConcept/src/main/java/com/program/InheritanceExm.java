package com.program;

class Animal{
	public void eat() {
		System.out.println("I can eat.");
	}
}

class Cats extends Animal{
	public void eat2() {
		System.out.println("I can eat Fish.");
	}
}

class Dogs extends Cats{
	public void eat3() {
		System.out.println("I can eat meat.");
	}
}

public class InheritanceExm {

	public static void main(String[] args) {
		Dogs d1 = new Dogs();
		
		d1.eat3();
		d1.eat2();
		d1.eat();
	}

}
