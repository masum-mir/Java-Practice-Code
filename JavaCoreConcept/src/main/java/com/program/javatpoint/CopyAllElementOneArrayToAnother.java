package com.program.javatpoint;

public class CopyAllElementOneArrayToAnother {
	
	public static void main(String[] agrs) {
		
		int arr1[] = {1,2,3,4,5,6};
		int arr2[] = new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		
		System.out.println("Old Array: ");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i] + " ");
		}
		
		System.out.println("\n\nNew Array: ");
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i] +" ");
		}
		
	}

}
 