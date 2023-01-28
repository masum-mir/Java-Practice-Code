package com.program.geeksforgeeks;

public class ReverseArrayIterative  {
	
	static void reverseArray(int arr[], int start, int end) {
		int temp;
//		int start = 0;
//		int end = arr.length-1;
		
		
		// recursive way
//		if(end <= start) {
//			return;
//		}		
//		temp = arr[start];
//		arr[start] = arr[end];
//		arr[end] = start;
//		
//		reverseArray(arr, start+1, end-1);
		
		while(start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
//		for(; start < end; start++, end--) {
//			temp = arr[start];
//			arr[start] = arr[end];
//			arr[end] = temp;
//		}
	}
	
	static void print(int arr[]) {
		for(int i =0 ; i< arr.length ;i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		reverseArray(arr, 0 , arr.length-1);
		
		print(arr);
		
		
		
	}

}
