package com.program.w3resource;

public class SqrtWithoutMethod {
	
	public static void main(String[] args) {
		
		int num = 144;
		
		int t = 0;
		int data = num / 2;
		
		
		while((t - data) != 0) {
			t = data;
			data = (t+(num/t))/2;
			
		}
		
		System.out.println(data);		
	}

}
