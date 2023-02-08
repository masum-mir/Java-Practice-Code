package com.generic;

import java.util.Arrays;
import java.util.List;

public class UpperBoundWildcard {
	
	public static double sum (List< ? extends Number> list) {
		
		double sum = 0.0;
		
		for(Number data: list) {
			sum = sum + data.doubleValue();
		}
		
		
		return sum;
	}
	
	public static String show(List< ? extends String> st) {
		
		String ar = null;
		
		for(String str: st) {
			ar = str;
		}
		
		
		return ar;
	}
	
	public static void main(String[] args) {
		
		
		List<Integer> list1 = Arrays.asList(4,2,3,4);
		
		List<Double> list2 = Arrays.asList(2.3,4.5,7.8);
		
		System.out.println(sum(list1));
		
		System.out.println(sum(list2));
		
		List<String> list3 = Arrays.asList("a","b","c");
		
		System.out.println(list3);
		
		
	}

}
