package com.program.w3resource;

public class DecimalToOctal {

	public static void main(String[] args) {

//		int dec_num = 15, rem, result=0;
//		
//		int[] oc = {0,1,2,3,4,5,6,7};
//
//		while(dec_num > 0) {
//			rem = dec_num % 8;
//			
//			result = result + oc[rem];
//			
//			dec_num = dec_num / 8;
//		}
//
//		System.out.print("Octal Number : "+result );
		
		int dec_num = 9, i=1,rem;
		int[] oc = new int[100];
		
		while(dec_num > 0) {
			oc[i++] = dec_num % 8;
			dec_num = dec_num / 8;
		}
		
		for(int j=i-1;j>0;j--) {
			System.out.print(oc[j]);
		}
		
	}

}
