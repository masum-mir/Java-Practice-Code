package com.program.w3resource;

public class RemoveDuplicateElementsInArray {

	public static void main(String[] args) {
		
		int[] arr= {1,2,4,3,4,5,1,2,3};
		
		
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
		

	}

}
