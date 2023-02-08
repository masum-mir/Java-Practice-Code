package com.lambda;

interface sayable2 {
	void show(String msg);
}

public class ConstructorReference {
	
	ConstructorReference(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		
		sayable2 sa = ConstructorReference::new;
		
		sa.show("hello");
		
	}

}
