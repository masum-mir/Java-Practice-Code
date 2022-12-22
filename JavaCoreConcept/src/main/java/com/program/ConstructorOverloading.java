package com.program;

class Student12 {
	
	Student12() {
		System.out.println("Hello, world");
	}
	
	Student12(int x){
		System.out.println("The value is: "+x);
	}
	
	Student12(int x, int y) {
		System.out.println("The sum is: "+(x+y));
	}
	
}

public class ConstructorOverloading {
	public static void main(String[] agrs) {
		Student12 s1 = new Student12();
		Student12 s2 = new Student12(10);
		Student12 s3 = new Student12(10,5);
		
	}

}
