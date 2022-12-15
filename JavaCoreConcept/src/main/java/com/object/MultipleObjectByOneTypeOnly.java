package com.object;

class RactangleCalculate{
	int length;
	int width;
	public void insert(int i, int w) {
		length = i;
		width = w;
	}
	
	public void display() {
		System.out.println(length * width);
	}
}

public class MultipleObjectByOneTypeOnly {

	public static void main(String[] args) {
		
		RactangleCalculate r1 = new RactangleCalculate(),r2 = new RactangleCalculate();
		
		r1.insert(20, 10);
		r2.insert(12, 23);
		
		r1.display();
		r2.display();
		
		
	}

}
