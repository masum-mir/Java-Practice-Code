package com.collections.list;

import java.util.LinkedList;
import java.util.Spliterator;

public class LinkedListDemo {
	
	public static void main(String[] agrs) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		list.add(10);
		list.add(23);
		list.add(3);
		list.add(5);
		
		list.addFirst(30);
		
		list.add(1, 50);
		
		list.offerLast(233);
		
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.contains(234));
		System.out.println();
		
		Object[] li = list.toArray();
		
		for(Object a: li) {
			System.out.print(a + " ");
		}
		System.out.println();
		
		
		//demonstrate spliterator() method
		
		Spliterator spl = list.spliterator();
		
		spl.forEachRemaining(n -> System.out.print(n + " "));
		
		
	}
	

}
