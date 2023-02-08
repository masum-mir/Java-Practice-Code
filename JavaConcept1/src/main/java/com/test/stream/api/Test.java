package com.test.stream.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {
	
	public static void main(String[] args) {
		
		List<Integer> list = List.of(12,3,4,54,5,45,4,54,45,1,26,5,5,4,5);
		
		System.out.println(list);
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,6,7,8,9,9);
		
		System.out.println(list1);
		
		List<Integer> list3 = new ArrayList<>();
		
		for(Integer li:list) {
			if(li%2==0) {
				list3.add(li);
			}
		}
		
		
		Iterator<Integer> li2 = list3.iterator();
		
		while(li2.hasNext()) {
			System.out.print(li2.next() + " ");
		}
		
		Stream<Integer> stream = list.stream();
		
		List<Integer> newList = stream.filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println("New List : " + newList);
		
		List<Integer> newList1 = list.stream().filter(i -> i>10).collect(Collectors.toList());
		
		System.out.println(newList1);
		
		
		// blank stream 
		Stream<Object> emptyStream = Stream.empty();
		
		emptyStream.forEach(e -> {
			System.out.println("\nEmpty:: "+e);
		});
		
		String[] names = {"a","b","c"};
		
		Stream<String> stream1 = Stream.of(names);
		stream1.forEach(e-> {
			System.out.println(e);
		});
		
		// builder
//		Stream<Object> streamBuilder = Stream.builder().build();
		
		IntStream stream4= Arrays.stream(new int[] {1,2,4,5,6,7,8});
		
		stream4.forEach(e->System.out.print(e + " "));
		
		LinkedList<Integer> listl = new LinkedList<>();
		
		listl.add(12);
		listl.add(13);
		listl.add(14);
		listl.add(15);
		listl.add(16);
		
		Stream<Integer> st = listl.stream();
		
		st.forEach(e -> {
			System.out.println(e);
		});
		
	}

}
