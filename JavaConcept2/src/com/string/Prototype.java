package com.string;

import java.util.Hashtable;
import java.util.LinkedList;

abstract class Shape2 implements Cloneable {
	private String id;
	protected String type;
	abstract void show();
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getType() {
		return type;
	}
	
	
	public Object clone() {
		Object clone = null;
		
		try {
			clone = super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return clone;
	}
	
	
}

class Ractangle extends Shape2 {

	public Ractangle() {
		type = "Ractangle";
	}
	
	@Override
	void show() {
		System.out.println("Ractangle override shape");		
	}
	
}

class Circle2 extends Shape2 {
	public Circle2() {
		type = "Circle";
	}
	
	@Override
	void show() {
		System.out.println("Circle override shape");
	}
}

class ShapeCache {
	private static Hashtable<String, Shape> map = new Hashtable<>();
	
	public static Shape getShape(String shapeId) {
		Shape cachedShape = map.get(shapeId);
		return (Shape) cachedShape.clone();
	}
	
}

public class Prototype {

	public static void main(String[] args) {


	}

}
