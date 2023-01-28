package com.program.w3resource;

import java.util.Scanner;

public class AverageThreeNumber {
	
	public static void main(String[] agrs) {
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		int result = num1 + num2 + num3;
		
		double average = result/3;
		
		System.out.println(average);
		
		Scanner input = new Scanner(System.in);
		System.out.println("Input your first number: ");
		int n1 = input.nextInt();
		System.out.println("Input your second number: ");
		int n2 = input.nextInt();
		System.out.println("Input your third number: ");
		int n3 = input.nextInt();
		
		int averageofnumber = (n1+n2+n3) /3;
		
		System.out.println(averageofnumber);
		
		
	}

}
