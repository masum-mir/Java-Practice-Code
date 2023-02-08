package com.program.javatpoint;

public class LargestElementArray {
	public static void main(String[] args) {
		
		int arr[] = {-1, 2, 3, 4, 2, 7,66, 8, 8, 3,-55};
		
		int max=arr[0];
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i] >= max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum number: "+max);
		
		// print minimum numbers
		
		int min = arr[0];
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("minimum number: "+min);
		
	}

}
