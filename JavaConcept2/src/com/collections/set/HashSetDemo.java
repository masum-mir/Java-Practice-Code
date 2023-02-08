package com.collections.set;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] agrs) {
		
		HashSet<Integer> set = new HashSet<>();
		
		// adding 
		set.add(10);
		set.add(30);
		set.add(20);
		set.add(50);
		set.add(20);
		
		System.out.println(set);
		
		// searching 
		if(set.contains(20)) {
			System.out.println("set contains 20");
		}
		
		set.remove(10);
		
		System.out.println(set);
		
		set.remove(20);
		
		if(!set.contains(20)) {
			System.out.println("set contains not found");
		}
		
		System.out.println(set);
		
		
	}

}
