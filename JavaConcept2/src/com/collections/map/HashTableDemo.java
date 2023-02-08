package com.collections.map;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, Book> table = new Hashtable<>();
		
		Hashtable<Integer, String> table2 = new Hashtable<>();
		
		Book b1=  new Book(1, 9, "A", "ABC", "hello world 1");
		Book b2=  new Book(2, 8, "B", "ABCD", "hello world 2");
		Book b3=  new Book(3, 7, "C", "ABCDE", "hello world 3");
//		Book b4=  new Book(4, 6, "D", "ABCDEFG", "hello world 4");
//		Book b5=  new Book(5, 5, "E", "ABCDEFGH", "hello world 5");
		
		table.put(1, b1);
		table.put(2, b2);
		table.put(3, b3);
		
		
		for(Map.Entry<Integer, Book> map: table.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue().id + " " + map.getValue().name + " "+ map.getValue().author+" "+ map.getValue().publisher);
		}
		
		table.remove(2);
		
		System.out.println(table);
		
		table2.put(11, "Hello_1");
		table2.put(22, "Hello_2");
		table2.put(33, "Hello_3");
		
		System.out.println(table2.getOrDefault(22, "Not found"));
		System.out.println(table2.getOrDefault(44, "Not found"));
		
		System.out.println(table2);
		
		table2.putIfAbsent(44, "Hello_44");
		
		System.out.println("Update hashtable:: "+table2);
		
		table2.putIfAbsent(22, "Hello_2");
		
		System.out.println(table2);
		
		
		
	}

}
