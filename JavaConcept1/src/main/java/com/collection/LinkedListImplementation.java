package com.collection;

public class LinkedListImplementation {
	
	Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public void printList() {
		Node n = head;
		
		while(n != null) {
			System.out.println(n.data + " ");
			n = n.next;
		}
	}
	
	// insert new node 
	// Add a node at the front
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	//Add a node after a given node
	public void afterPush(Node prev_node, int new_data) {
		
		if(prev_node == null) {
			System.out.println("The given previous node cannot be null.");
			return;
		}
		
		Node node = new Node(new_data);
		node.next = prev_node.next;
		prev_node.next = node;
		
	}
	
	//Add a node at the end
	public void append(int new_data) {
		Node new_node = new Node(new_data);
		
		if(head == null) {
			head = new Node(new_data);
			return;
		}
		
		new_node.next = null;
		
		Node last = head;
		while (last.next != null) {
			last = last.next;
		}
		
		last.next = new_node;
		return;
		
	}
	
	public static void main(String[] agrs) {
		
		LinkedListImplementation list = new LinkedListImplementation();
		
		// traversing node
		list.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node four = new Node(4);
		
		list.head.next = second;
		second.next = third;
		third.next = four;
		
//		list.printList();
		
		// Add a node at the front
		list.push(170);
		list.push(10);
		list.push(20);
		list.push(60);
		
//		list.printList();
		
		
		// Add a node after a given node
		
		list.afterPush(list.head.next, 50);
		list.afterPush(list.head.next, 570);
		
//		list.printList();
		
		//Add a node at the end
		
		list.append(40);
		list.append(230);
		list.printList();
		
		
	}

}
 