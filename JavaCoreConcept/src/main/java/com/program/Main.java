package com.program;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
//		Employee emp3 = new Employee("ABC", 36,344);
//		Employee emp4 = new Employee("EFG", 37,345);
		
		
		ArrayList<Employee> list = new ArrayList<>();
		 
		list.add(emp1);
		
		
		Iterator<Employee> it = list.iterator();
		
//		while(it.hasNext()) {
//			Employee li = it.next();
//			System.out.println(li.name + " : " + li.year + " : " + li.phone);
//		}
		

		
		for(Employee emp: list) {
			System.out.println(emp.getName() + " : "+ emp.getYear() + " : "+ emp.getPhone());
		}

	}

}
