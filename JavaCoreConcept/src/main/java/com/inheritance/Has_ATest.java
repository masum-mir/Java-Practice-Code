package com.inheritance;

class Operation {
	int square(int n) {
		return n * n;
	}
}

class Circle {
	Operation op;
	double pi = 3.14;
	
	public double area(int r) {
		op = new Operation();
		int square = op.square(r);
		return pi * square;
	}
}

public class Has_ATest {
	public static void main(String[] agrs) {
		Circle c1 = new Circle();
		
		double result = c1.area(5);
		
		System.out.println(result);
	}

}
