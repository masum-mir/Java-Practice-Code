package com.program.w3resource;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		int dec_num = 5, quot; 
		int i=1,j;
		int bin_num[] = new int[10];
		
		quot = dec_num;
		
		while(quot != 0) {
			bin_num[i++] = quot%2;
			quot = quot/2;
		}
		System.out.println();
		
		for(j=i-1;j>0;--j) {
			System.out.print(bin_num[j] + " ");
		}

	}

}
