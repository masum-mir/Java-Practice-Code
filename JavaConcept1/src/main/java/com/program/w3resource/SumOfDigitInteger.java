package com.program.w3resource;

public class SumOfDigitInteger {
	
	public static void main(String[] agrs) {
		
		int num = 123, sum = 0, temp;
		
		
		while(num > 0) {
			temp = num % 10;
			sum = sum + temp;
			num = num / 10;
		}
		
		System.out.println("The result :: "+sum);
		
		
	}

}
