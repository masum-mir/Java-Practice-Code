package com.collections.list;

import java.util.Stack;

public class StackDemo {
	
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(60);
		
		System.out.println(s);
		
		System.out.println(s.isEmpty());
		
		s.push(70);
		
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s);
		
		System.out.println(s.search(150));
		
		s.forEach(n -> System.out.print(n + " "));
		
	}

}
