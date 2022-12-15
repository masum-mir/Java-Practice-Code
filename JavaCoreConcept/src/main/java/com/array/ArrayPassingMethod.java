package com.array;

public class ArrayPassingMethod {
	
	static int[] get() {
		return new int[] {1,2,3,4,5,6,7};
	}
	
	static void min(int arr[]) {
		int min = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
				System.out.println(min);
			}
			
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String ...st) {
		
//		int arr[]= {10,20,30,40};
		
		min(new int[] {10,20,30,40});
		
		int arr[] = get();
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
