package com.inheritance;

class X {
	void eat() {
		System.out.println("eating..");
	}
}

class Y extends X {
	void bark() {
		System.out.println("barking..");
	}
}

class Z extends X {
	void meow() {
		System.out.println("meowing..");
	}
}

public class HierarchicalInheritance {
	public static void main(String[] agrs) {
		
		Z z = new Z();
		z.meow();
		z.eat();
//		z.bark(); // error compile time
		
	}

}
