package com.collections.map;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentSkipListMap;

class Student {
	int id;
	String name;
	double marks;
	
	Student(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
	}
	
	public String toString() {
		return this.id + " " + this.name + " " +this.marks;
	}
	
}

class SortById implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		
		return o1.id - o2.id;
	}
	
}

public class TreeMapDemo {
	
	public static void main(String[] agrs) {
		
		/// sort by id  --- !!!
		SortById sort = new SortById();
		
	// TreeMap(SortedMap sm)  ----- !!!
//		SortedMap<Integer, Student> sorted = new ConcurrentSkipListMap<>();
		
		/// sort by id  --- !!!
		TreeMap<Student, Integer> map = new TreeMap<>(sort);
		
		// TreeMap(SortedMap sm)  ----- !!!
//		TreeMap<Integer, Student> map = new TreeMap<>(sorted);
		
		Student s1 = new Student(105, "ABC", 60.6);
		Student s2 = new Student(102, "EFG", 70.6);
		Student s3 = new Student(103, "IJK", 80.6);
		Student s4 = new Student(104, "MNO", 90.6);
		
		/// sort by id  --- !!!
		
		map.put(s1, 1);
		map.put(s2, 2);
		map.put(s3, 3);
		
		// TreeMap(SortedMap sm)  ----- !!!
//		map.put(1, s1);
//		map.put(2, s2);
//		map.put(3, s3);
		
		System.out.println(map);
		
		// changing value
		map.put(s4, 2);
		System.out.println(map);
		
		//remove 
		map.remove(s3);
		System.out.print(map);
		
		
		for(Map.Entry<Student, Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		System.out.println("Descending Map: : " + map.descendingMap());
		
		System.out.println("Head Map:: " + map.headMap(s4,true));		// less then or equal to the specified key
	
		System.out.println("Tail Map :: " +map.tailMap(s2, true));      // greater then or equal to the specified key
	
		System.out.println("Sub Map :: " + map.subMap(s1, false,  s4, true));    // exists in between the specified key.
		
	}

}
