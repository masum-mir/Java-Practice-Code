package com.program.w3resource;

public class sumOfDigitsOfAnInteger {
	public static void main(String... str) {
		
		int num = 12;
		
		int sum = 0;
		
		while(num != 0) {
			int temp  = num % 10;
			sum += temp;
			num = num / 10;
		}
		
		System.out.println(sum);
		
		
	}

}
