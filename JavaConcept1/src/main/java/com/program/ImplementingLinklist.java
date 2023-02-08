package com.program;


class LinkedList{
	Node head;
	
	class Node {
		int data;
		Node next;
		
		
		Node(int d) {
			data = d;
			next = null;
		}
		
	}
	
	public void print() {
		Node n = head;
		
		while(n!= null) {
			System.out.print(n.data + " ");
			n = n.next;
		}
	}
	
	
}

public class ImplementingLinklist {

	public static void main(String[] args) {

		LinkedList listt = new LinkedList();
		
		listt.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		listt.head.next = second;
		second.next = third;
		
		listt.print();

	}

}
