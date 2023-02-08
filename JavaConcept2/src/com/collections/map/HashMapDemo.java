package com.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1,"ABC");
		map.put(2, "EFG");
		map.put(3, "IJK");
		map.put(4, "LMN");
		
		System.out.println(map);
		
		
		// old style  --- !!!!
		Set set = map.entrySet();     // convert set, so i can traverse
		Iterator itr = set.iterator();
		
		while(itr.hasNext()) {
			
			Map.Entry entry = (Entry) itr.next();    // convert to map.entry so,  i can separately key and value 
			
			System.out.println(entry.getKey() + " == " + entry.getValue());
		}
		
		
		/// two ----- !!!
		
		for(Map.Entry entry:map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		/// three ---_!!!!
		
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey())
//		.forEach(e -> System.out.println(e.getKey() + " == " + e.getValue()));
		.forEach(System.out::println);
		
		/// four --- !!!
		
		map.entrySet()
				.stream()
				.sorted(Map.Entry.comparingByValue())
				.forEach(System.out::println);
		
		if(map.containsKey(3)) {
			String a = map.get(3);
			
			System.out.println("The 3 keys value is :: "+a);
		}
		
				
	}
	

}
