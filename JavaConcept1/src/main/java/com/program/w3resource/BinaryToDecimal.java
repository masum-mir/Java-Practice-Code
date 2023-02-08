package com.program.w3resource;

public class BinaryToDecimal {
	
	public static void main(String[] args) {
		
		int bi_num = 111, dec_num = 0,i=1;
		
		while(bi_num > 0 ) {
			int rem = bi_num % 10;
			dec_num = dec_num + rem * i;
			i *= 2;
			bi_num = bi_num / 10;
		}
		
		System.out.println("Decimal number: "+dec_num);
		
	}

}
