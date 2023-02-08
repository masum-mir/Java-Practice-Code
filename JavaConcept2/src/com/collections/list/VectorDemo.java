package com.collections.list;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		
		Vector<Integer> vector = new Vector<>();
		
		vector.add(10);
		vector.add(30);
		vector.add(50);
		
		System.out.println(vector);
		
		vector.add(1, 20);
		
		System.out.println(vector);
		
		vector.remove(2);
//		vector.removeAll(vector);
		
		vector.set(2, 15);
		
		System.out.println(vector);
		
		ListIterator itr = vector.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		
		
	}

}
