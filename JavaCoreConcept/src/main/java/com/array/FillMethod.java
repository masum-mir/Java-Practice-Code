package com.array;

import java.util.Arrays;

public class FillMethod {
	public static void main(String[] agrs) {
		
		int[] arr = {1,2,3,4,5,6,7};
		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=1;
//		}
//		
		Arrays.fill(arr,10);
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		
		
		System.out.println(Arrays.toString(arr));
		
	}

}
