package com.program.javatpoint;

public class ReverseOrderArray {
	public static void main(String[] agrs) {
		 
		int arr[] = {1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		for(int i=arr.length-1; i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
		
		
	}

}
