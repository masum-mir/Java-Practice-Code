package com.program;


class Linkedd{
	
	Node head;
	
	class Node {
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
}

public class ImplementingLinklist2 {

	public static void main(String[] args) {

		Linkedd list = new Linkedd();
		
		list.head = list.new Node(2);
		Linkedd.Node second = list.new Node(4);
		Linkedd.Node third = list.new Node(6);
		
		list.head.next = second;
		second.next = third;
		
		while(list.head != null) {
			System.out.println(list.head.data + " ");
			list.head = list.head.next;
		}
		
		

	}

}
