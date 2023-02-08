package com.constructor;

class MySingleton{
	
	// a reference to the object to the class.
	public static MySingleton single;
	
	// restricts creating object outside the class
	private MySingleton() {
		
	}
	
	public static MySingleton getInstance() {
		if(single == null) {
			single = new MySingleton();
			System.out.println("hi");
		}
		
		System.out.println("hellow, world");
		
		return single;
	}
	
	
}

public class SingletonConstructor {
	
	public static void main(String ...str) {
		MySingleton ms;
		
		ms = MySingleton.getInstance();
	}

}
