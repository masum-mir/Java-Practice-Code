package com.program.leetcode;

public class Two_ReverceInteger {
	
	public static void main(String[] agrs) {
		
		int num = 1534236469;
		
		int temp, sum = 0;
		
		while(num != 0) {
			temp = num % 10;
			sum = sum * 10 + temp;
			num = num / 10;
		}
		
		System.out.println(sum);
		
		
	}

}
