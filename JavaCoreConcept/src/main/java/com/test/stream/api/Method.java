package com.test.stream.api;

import java.util.List;
import java.util.stream.Collectors;

public class Method {
	public static void main(String[] agrs) {
		
		
		List<String> list = List.of("Masum","Ashik","Asif","Arif");
		
		list.stream().filter(e->e.startsWith("A")).forEach(e->System.out.println(e));
		
		List<String> li = list.stream().filter(e->e.startsWith("M")).collect(Collectors.toList());
		
		System.out.println(li);
		
		List<Integer> list1 = List.of(2,4,5,6,2,7,4,81,2,3,45,9);
		
		List<Integer> li1 = list1.stream().map(i->i*i).collect(Collectors.toList());
		
		System.out.println(li1);

		li1.stream().forEach(System.out::println);

		li1.forEach(System.out::println);

		li1.stream().sorted().forEach(System.out::println);
		
		Integer i = list1.stream().min((x,y)->x.compareTo(y)).get();
		System.out.print("min : " + i);
		
		
		
	}

}
