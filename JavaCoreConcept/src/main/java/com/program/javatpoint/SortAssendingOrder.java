package com.program.javatpoint;

import java.util.Arrays;
import java.util.Collections;

public class SortAssendingOrder {
	
	public static void main(String[] args) {
		
		int arr[] = {1,5, 2,9, 3, 4, 2, 7, 8, 3};
		
		String arr1[] = {"a","b","c"};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int temp=0;
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			}
		}
		
		for(int num: arr) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		Arrays.sort(arr1);

		for(String values : arr1) {
			System.out.print(values + " ");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(arr1));
		
		
		//user defined assending order data print
		
		// sort sub array
		
		// 2 to 6 index value sorted
		Arrays.sort(arr,2,6);
		
		System.out.println(Arrays.toString(arr));
		
		
	}

}
