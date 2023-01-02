package com.program.javatpoint;

public class ThirdLargestNumber {
	
	public static void main(String[] args) {
		
		int arr[] = {1,5,6,2,3,8,4,7};
		
		int max = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		System.out.println(max);
		
	}

}
