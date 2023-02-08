package com.collections.list;

import java.util.*;

public class ArrayListDemo {
	
	public static void main(String[] agrs) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(40);
		list.add(20);
		list.add(60);
		list.add(30);
		
		list.remove(1);
		
//		ArrayList<Integer> list2 = new ArrayList<>();
//	
//		list2.add(99);
//		list2.add(88);
//		
//		list.retainAll(list2);
	
//		
//		System.out.println(list);
//		
//		Collections.sort(list, Collections.reverseOrder());
//
//		
//		for(Integer i: list) {
//			System.out.println(i);
//		}
		
		System.out.println("Iterator");
		// iterator 
		Iterator l = list.iterator();
		
		while(l.hasNext()) {
			System.out.println(l.next());
		}
		
		System.out.println("Get method:: "+ list.get(3));
		
		list.set(1, 90);
		
		System.out.println(list.get(1));
		
		System.out.println("List iterator");
		
		// ListIterator
		
		ListIterator itr = list.listIterator(list.size());
		
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
		
		System.out.println("forEach");
		
		list.forEach(a -> System.out.println(a));

		
	}
	

}
