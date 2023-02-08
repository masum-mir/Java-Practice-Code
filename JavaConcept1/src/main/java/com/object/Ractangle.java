package com.object;


class RactangleObj{
	int length;
	int width;
	
	public void insert(int i, int w) {
		length = i;
		width = w;
		
	}
	
	public void display() {
		System.out.println(length*width);
	}
	
}

public class Ractangle {

	public static void main(String[] args) {

		RactangleObj r1 = new RactangleObj();
		RactangleObj r2 = new RactangleObj();
		
		r1.insert(20, 50);
		r2.insert(10, 15);
		
		r1.display();
		r2.display();
		
	}

}
