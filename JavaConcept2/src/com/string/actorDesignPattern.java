package com.string;

interface Shape{
	void print();
}

class Circle implements Shape {
	@Override
	public void print() {
		System.out.println("circle class shape interface override");
	}
	
	public void display() {
		System.out.println("this is display method");
	}
}

class Squre implements Shape {
	@Override
	public void print() {
		System.out.println("squre class shape interface override");
	}
}

/// builder pattern
class ShapeFactory {
	public Shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("SQURE")) {
			return new Squre();
		}
		
		return null;
	}
}

public class actorDesignPattern {
	
	public static void main(String[] args) {
		
		ShapeFactory sf = new ShapeFactory();
		
		Circle s1 = (Circle) sf.getShape("CIRCLE");
		s1.print();
		
		s1.display();
		
		Shape s2 = sf.getShape("SQURE");
		s2.print();
		
		Shape s3 = sf.getShape("");
		s3.print();
		
	}

}
