package com.collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet<String> set = new TreeSet<>();
		
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		set.add("ABCD");
		set.add("BCDE");
		
		System.out.println(set);
		
		System.out.print("First value is: " + set.first());
		System.out.println("\nLast value is: " + set.last());
		
		String value = "B";
		
		System.out.println("\nHigher value is :" +set.higher(value));
		System.out.println("\nLower value is : " + set.lower(value));
		
		set.remove("C");
		System.out.println(set);
		
		set.pollFirst();		// remove first
		System.out.println(set);
		
		set.pollLast();			// remove last
		System.out.println(set);
		
		
		Iterator<String> itr = set.iterator();
		
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		if(set.contains("B")) {
			System.out.println(set);
		}
		
		Iterator i = set.descendingIterator();
		
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
		}
		
		System.out.println();
		System.out.println();
		
		set.removeIf(e->(e.charAt(0) == 'A'));
		
		for(String s:set) {
			System.out.print(s + " ");
		}
//		
	}

}
