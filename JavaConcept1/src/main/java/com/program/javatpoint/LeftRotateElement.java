package com.program.javatpoint;

public class LeftRotateElement {
	public static void main(String[] agrs) {
		
		int arr[] = {1,2,3,4,5,6};
		
		System.out.println("Old array list: ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		int n = 5;
		
		//rotate the given array
		
		for(int i=0;i<n;i++) {
			int j, first;
			
			first = arr[0];
			
			for(j=0; j<arr.length - 1 ; j++) {
				arr[j] = arr[j+1];
			}
			arr[j]  = first;
		}
		
		System.out.println("\nArray after left rotation: ");
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
 