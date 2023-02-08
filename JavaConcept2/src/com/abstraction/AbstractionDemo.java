package com.abstraction;

abstract class Shape {
	String color;
	abstract double area();
	public abstract String toString();
	public Shape(String color) {
		this.color = color;
		System.out.println("Constructor Shape is called");
	}
	// concrete class
//	public String getColor() {
//		return color;
//	}
	
	void display() {
		System.out.println("Hello display");
	}
	
	final void fun() {
		System.out.println("This is a fun method");
	}
	
	static void fun2() {
		System.out.println("This is a fun 2 mehtods");
	}
	
	abstract class C {
		abstract void print();
	}
	
}

class Area extends Shape {
	
	double r;

	public Area(String color, int r) {
		super(color);
		this.r = r;
		System.out.println("Area constructor is called");
	}

	@Override
	double area() {
		
		return Math.PI*Math.pow(r, 2);
	}

	@Override
	public String toString() {
		
		return "Color is ::" + super.color + " radius is:: "+area();
	}

}

class Rectangle extends Shape {
	
	double num1, num2;

	public Rectangle(String color, double num1, double num2) {
		super(color);

		this.num1 = num1;
		this.num2 = num2;
	}

	@Override
	double area() {
		return num1 * num2;
	}

	@Override
	public String toString() {		
		return "Color is:: "+ super.color + " area is:: "+area();
	}
	
	class D extends C{

		@Override
		void print() {
		System.out.println("inner abstract");			
		}
		
	}
	
}

public class AbstractionDemo{
	
	public static void main(String[] args) {
		
		Area a = new Area("red", 5);
		Rectangle a2 = new Rectangle("Blue", 2,3);
		
		System.out.println(a.toString());
		System.out.println(a2.toString());
		a.display();
		a.fun();
		a2.fun2();
		
		
		Rectangle.D d = a2.new D();
		
		d.print();
		
		
		
		
	}

}
