package com.program.javatpoint;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class DuplicateElement {
	public static void main(String[] agrs) {
		
		int arr[] = {1, 2, 3, 4, 2, 7, 8, 8, 3};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
		
//		LinkedHashSet<Integer> set = new LinkedHashSet<>();
//		
//		for(int i=0;i<arr.length;i++) {
//			set.add(arr[i]);
//		}
//		
//		System.out.println(set);
//		
		
		
	}

}
 