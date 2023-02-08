package com.program.w3resource;

public class OctalToDecimal {

	public static void main(String[] args) {
		
		int oc_num = 107, i=0, rem;
		double dec_num=0;
		
		while(oc_num > 0) {
			rem = oc_num % 10;
			dec_num = dec_num + rem * Math.pow(8, i++) ;
			oc_num = oc_num / 10;
		}
		
		System.out.println("Decimal number: "+dec_num);
		

	}

}
