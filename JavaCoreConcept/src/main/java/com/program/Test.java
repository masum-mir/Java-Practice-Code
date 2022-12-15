package com.program;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Test {

	public static void main(String[] args) {
		
//		Employee emp = new Employee("ABC", 97,123459);
//
//		ArrayList<Employee> list = new ArrayList<>();
//		
//		list.add(emp);
//		
//		
//		Iterator<Employee> li = list.iterator();
//		
//		while(li.hasNext()) {
//			Employee emp1 = li.next();
//			System.out.println(emp1.name +" : " + emp1.year + " : "+ emp1.phone);
//		}
		//.......
//		for(Employee l: list) {
//			System.out.println(l);
//		}
		
		
		int a[]={10,20,30,40,50,60,70,80,90};
	    int value=50;
	    
		int found = 0;

		for (int i = 0; i < a.length; i++)
		{
			
		   if (a[i] > value)
		   {
		      a[i] += 10;
		      break;
		   }
		}
		
		if(value != 20 ) {
			System.out.println("Not found");
		}
		
		System.out.print("\nArray List : ");
		for(int ii : a) {
			System.out.print(ii + " ");
		}

	}


}
