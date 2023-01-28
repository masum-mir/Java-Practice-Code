package com.program.w3resource;

import java.util.stream.Stream;

public class HexdecimalToDecimal {
	
	public static void main(String[] agrs) {
		
		String hex_num = "2A5";
		int dec_num = 0;
		
//		String s = hex_num.toUpperCase();
		
		String hex_digits = "0123456789ABCDEF";
		
		for(int i=0;i<hex_num.length();i++) {
			char c = hex_num.charAt(i);
			
			int d = hex_digits.indexOf(c);
			
			dec_num = 16 * dec_num + d;
			
		}
		
		System.out.println("Decimal number: "+dec_num);
		
	}

}
