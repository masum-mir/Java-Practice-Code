package com.program.w3resource;

public class DecimalToHexdecimal {

	public static void main(String[] args) {

		int dec_num = 200, rem;
		String hexdec_num = "";
		
		char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		while(dec_num > 0) {
			rem = dec_num % 16;
			
			hexdec_num = hexdec_num + hex[rem];
			
			dec_num = dec_num / 16;
			
		}
		
		System.out.print(hexdec_num + " ");

	}

}
