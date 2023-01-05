package com.program.javatpoint;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThirdLargestNumber {
	
	public static void main(String[] args) {
		
		int arr[] = {1,5,6,2,3,8,44,4,7};
		
//		int max = 0;
//		
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max = arr[i];
//			}
//		}
		
//		Arrays.sort(arr);
		
//		System.out.println(arr[arr.length-4]);
		
		int[] sortedIndex = new int[arr.length];
		int e = 0;
		int copyarr[] = arr.clone();
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.asList(arr[arr.length-2]));
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0; j<copyarr.length;j++) {
//				if(copyarr[j]==arr[i]) {
//					e = sortedIndex[i] = j;
//				}
//			}
//		}
//		
//		System.out.println(e);
//		
		
		
		
	}

}
