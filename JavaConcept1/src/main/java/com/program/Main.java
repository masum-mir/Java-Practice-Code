package com.program;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
//		Employee emp4 = new Employee("EFG", 37,345);
		emp1.setName("masum");
		emp1.setPhone(24324);
		emp1.setYear(2022);
		emp2.setName("abc");
		emp2.setPhone(2342345);
		emp2.setYear(2022);
		
		
		ArrayList<Employee> list = new ArrayList<>();
		 
		list.add(emp1);
		list.add(emp2);
		
		
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
