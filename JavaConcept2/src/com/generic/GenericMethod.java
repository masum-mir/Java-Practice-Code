package com.generic;

class TestMethod{
	
	static <T, U> void genericDisplay(T element, U element2) {
		System.out.println(element.getClass().getName() + " = " + element);
		System.out.println(element2.getClass().getName() + " = " + element2);
	}
	
}

public class GenericMethod {

	public static void main(String[] args) {
		
		TestMethod.genericDisplay(true, "ABC");
		
		TestMethod.genericDisplay("MASUM", 20);
		
		
	}
	
}
