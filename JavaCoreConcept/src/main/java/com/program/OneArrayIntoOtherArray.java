package com.program;

public class OneArrayIntoOtherArray {

	public static void main(String[] args) {

		int arr1[] = {10,20,30,40};

		int arr2[] = new int[4] ;
		
		for(int i = 0 ; i<arr1.length; i++) {
			arr2[i] = arr1[i];
			
		}
		
		System.out.println("Elements of 1st Array: ");
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println("\nElements of 2nd Array: ");
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
	}

}
