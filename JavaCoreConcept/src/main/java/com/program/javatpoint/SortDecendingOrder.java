package com.program.javatpoint;

import java.util.Arrays;
import java.util.Collections;

public class SortDecendingOrder {
	
	public static void sortArray() {
		
	}
	
	public static void main(String[] agrs) {
		
		int arr[] = {1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp = 0;
					temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int num:arr) {
			System.out.print(num + " ");
		}
		
		System.out.println();
		
		String arr1[] = {"a","b","c"};
		
		Arrays.sort(arr1, Collections.reverseOrder());
		
		for(String values: arr1) {
			System.out.print(values+ " ");
		}
		
	}
}
