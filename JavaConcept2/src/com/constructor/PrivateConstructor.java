package com.constructor;

class newTestClass {
	static newTestClass object = null;
	public int a = 20;
	private newTestClass() {
		
	}
	
	static public newTestClass displayInstance() {
		if(object == null) {
			object = new newTestClass();
		}
		return object;
	}
	
}

public class PrivateConstructor {
	
	public static void main(String[] agrs) {
		
		newTestClass instance1 = newTestClass.displayInstance();
		newTestClass instance2 = newTestClass.displayInstance();
		
		instance1.a = instance1.a + 20;
		
		System.out.println("Instance One :: " + instance1.a);
		System.out.println("Instancec Two :: " + instance2.a);
		
	}

}
