package com.abstraction;

import java.lang.annotation.Target;

interface Item {
	String name();
	float price();
	String size();
}

abstract class Pizza implements Item {
	
}

abstract class VegPizza extends Pizza {
	
	@Override 
	public abstract String name();
	@Override 
	public abstract float price();
	@Override
	public abstract String size();
}

class SmallVegPizza extends VegPizza {

	public void Test(Item a) {
		System.out.println("HashCode a :  : " + a.hashCode());
		System.out.println("SmallVegPizza : : "+ new SmallVegPizza().hashCode());
		if(a instanceof SmallVegPizza) {
			System.out.println("Hello");
		}
	}

	@Override
	public String name() {
		return "Small Pizza";
	}

	@Override
	public float price() {
		return 20.4f;
	}

	@Override
	public String size() {
		return "Small Size";
	}
	
}

class AA {
	int x = 10;
}

class BB extends AA {
	int y = 20;
}

class Base  {
	AA getObject() {
		System.out.println("Base");
		return new AA();
	}
}

class CovarientReturnType extends Base {
	@Override
	AA getObject() {
		System.out.println("Derived");
		return new BB();
	}
}


public class Example2{
	
	public static void main(String[] args) {
		
		Base base = new CovarientReturnType();
		
		System.out.println(base.getObject() instanceof BB);
		
		base.getObject();
		
//		SmallVegPizza sp = new SmallVegPizza();
//		
//		sp.Test(sp);
//	
//		Item i = new SmallVegPizza();
//		System.out.println(i.hashCode());
//		Item i2 = new SmallVegPizza();
//		System.out.println(i2.hashCode());
//		
//		System.out.println(i2 instanceof SmallVegPizza);
//		
//		System.out.println(sp.hashCode());
//		System.out.println("Name is:: "+sp.name());
//		System.out.println("Price is:: "+sp.price());
		
		
		
	}

}
