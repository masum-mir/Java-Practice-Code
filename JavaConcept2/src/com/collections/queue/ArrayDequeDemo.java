package com.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class ArrayDequeDemo {
	
	public static void main(String[] args) {
		
		Deque<Integer> d = new ArrayDeque<>();
		
		d.add(20);
		d.offer(8);
		d.add(20);
		d.offer(8);
		d.add(20);
		d.offer(8);
		d.add(20);
		d.offer(8);
		d.add(20);
		d.offer(8);
		d.add(20);
		d.offer(8);
		d.add(20);
		d.offer(8);
		d.add(20);
		d.offer(8);
		d.add(20);
		d.offer(8);
		
		System.out.println(d);
		
		d.addFirst(30);
		d.offerFirst(5);
		System.out.println(d);
		
		d.addLast(40);
		d.offerLast(35);
		System.out.println(d);
		
		System.out.println(d.peek());
		System.out.println(d.peekFirst());
		System.out.println(d.peekLast());
		System.out.println(d.remove(8));
		
		System.out.println(d);
		
		if(d.contains(30)) {
			System.out.println("The value is :" + d);
		}
		
		Iterator<Integer> st = d.descendingIterator();  
		
		while(st.hasNext()) {
			System.out.println(st.next());
		}
		
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		
		
		Object[] arr = d.toArray();
		
		for(Object ar: arr) {
			System.out.print(ar + " ");
		}
		
		
		System.out.println("\n"+d.poll());
		System.out.println(d);
		System.out.println(d.pollLast());
		System.out.println(d);
		
		
		d.removeIf(e-> (e.valueOf(0) == 2));
		
		for(Integer s: d) {
			System.out.print(s + " ");
		}
		
		
	}

}
