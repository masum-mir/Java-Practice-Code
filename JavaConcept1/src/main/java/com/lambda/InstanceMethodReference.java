package com.lambda;

interface Sayable {
	void show();
}

public class InstanceMethodReference {
	
	public void display() {
		System.out.println("Hello world");
	}
	
	public static void main(String[] agrs) {
		
		InstanceMethodReference mr = new InstanceMethodReference();
		
//		Sayable s = mr::display;
		
		Sayable s = new InstanceMethodReference()::display;
		
		s.show();
				
		
		
		
		
	}

}
