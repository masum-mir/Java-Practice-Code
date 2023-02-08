package com.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

class Book {
	int id, quantity;
	String name, author, publisher;

	
	Book(int id, int quantity, String name, String author, String publisher) {
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
	}

//	@Override
//	public String toString() {
//		return "Book [id=" + id + ", quantity=" + quantity + ", name=" + name + ", author=" + author + ", publisher="
//				+ publisher + "]";
//	}
	
	

}

public class LinkedHashMapDemo {
	
	public static void main(String[] agrs) {
		
		LinkedHashMap<Integer, Book> map = new LinkedHashMap<>();
		
		Book b1=  new Book(1, 9, "A", "ABC", "hello world 1");
		Book b2=  new Book(2, 8, "B", "ABCD", "hello world 2");
		Book b3=  new Book(3, 7, "C", "ABCDE", "hello world 3");
		Book b4=  new Book(4, 6, "D", "ABCDEFG", "hello world 4");
		Book b5=  new Book(5, 5, "E", "ABCDEFGH", "hello world 5");
		
		map.put(1,b1);
		map.put(2, b2);
		map.put(3, b3);
		map.put(4, b4);
		map.put(5, b5);
		
		
		for(Map.Entry<Integer, Book> entry: map.entrySet()) {
			Book  b = entry.getValue();
			System.out.println(entry.getKey() + " = "+ b.name +", "+b.author+", "+b.publisher+", "+b.quantity);
		}
		
	}

}
