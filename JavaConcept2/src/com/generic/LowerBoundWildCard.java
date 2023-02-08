package com.generic;

import java.util.Arrays;
import java.util.List;

public class LowerBoundWildCard {
	
	public static void sum(List<? extends Integer> list) {
		System.out.println(list);
	}
	
	public static void show(List<? super String> list2) {
		System.out.println(list2);
	}
	
	public static void main(String[] agrs) {
		
		List<Integer> list1 = Arrays.asList(2,3,4,5,6,1);
		
		sum(list1);
		
		List<String> list2 = Arrays.asList("a","aa","aaa");
		
		show(list2);
		
	}

}
