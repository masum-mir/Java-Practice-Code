package com.inheritance;

class Animal{
	public void eat() {
		System.out.println("eating...");
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("barking...");
	}
}

public class SingleInheritance {
	
	
	private void display() {
		System.out.println("hi");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog();
		d.bark();
		d.eat();
		SingleInheritance s = new SingleInheritance();
		s.display();
	}

}
