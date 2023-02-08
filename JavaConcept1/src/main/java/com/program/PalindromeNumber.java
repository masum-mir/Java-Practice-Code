package com.program;

public class PalindromeNumber {
	public static void main(String...str) {
		
		int num = 121;
		int temp = num;
		int result=0,r;
		
		while(num>0) {
			r = num % 10;
			result = result * 10 + r;
			num = num / 10;
		}
	
		
		System.out.println(result);
		
		if(temp == result) {
			System.out.println("Palindrome number.");
		} else {
			System.out.println("Not Palindrome number.");
		}
//		
//		if(num < 0 || (num % 10 == 0 && num != 0)) {
//			return false;
//		}
//		
//		
//		while(num > result) {
//			result = result * 10 + num % 10;
//			num /= 10;
//		}
//		
//		return num == result || num == result/10;
		
	}

}
