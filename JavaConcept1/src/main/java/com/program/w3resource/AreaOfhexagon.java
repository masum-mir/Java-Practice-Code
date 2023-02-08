package com.program.w3resource;

import java.util.Scanner;

public class AreaOfhexagon {
	
	public static void main(String[] agrs) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("My input number: ");
		int num = in.nextInt();
		
		double area;
		
		area = (3 * Math.sqrt(3) * (num * num) ) / 2;
		
		double perimeter = 6 * num;
		
		System.out.println("Area of hexagon :: " + area);
		System.out.println("Perimeter of hexagon :: "+ perimeter);
		
		
	}

}
