package com.collections.queue;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Spliterator;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		Queue<Integer> q = new PriorityQueue<>();
		
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(10);
		
		
		System.out.println(q);
		
		q.offer(70);
		q.offer(50);
		System.out.println(q);
		
		System.out.println(	q.peek());
		System.out.println(q);
		
		System.out.println(q.poll());
		System.out.println(q);
		
		Spliterator<Integer> sp = q.spliterator();
		
		sp.forEachRemaining(e -> System.out.print(e + " "));
		

	}

}
