package com.program.javatpoint;

public class RightShiftArrayElement {
	public static void main(String[] agrs) {
		
		int arr[] = {1, 2, 3, 4,5};
		
		int n = 2;
		
		for(int i=0; i<n;i++) {
			
			int last = arr[arr.length-1];
			
			for(int j=arr.length-1;j>0;j--) {
				//shift element one by one
				arr[j]=arr[j-1];
			}
			
			// last element of array will be added to the start of array.
			arr[0]= last;
			
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}

}
