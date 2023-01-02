package com.program.javatpoint;

public class SumArray {
	
	public static void main(String[] agrs) {
		int arr[] = {1, 2, 3, 4, 2, 7, 8, 8, 3};

		int sum = 0;
		
		for(int i=0;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		
		System.out.println(sum);
	}
	
}
