package com.lambda;

@FunctionalInterface
interface printData {
	void show();
}

public class MethodReference {
	
	public static void main(String[] args) {
		
		
		printData p = ()-> {
			System.out.println("Hello world");
		};
		
		 p.show();
		
	}

}
