package com.generic;

import java.util.ArrayList;

class Test2<T> {
	
	T obj;
	
	Test2(T obj) {
		this.obj = obj;
	}
	
	public void display() {
		System.out.println(obj);
	}
	
}

public class GenericOnlyWorkReferenceType {

	public static void main(String[] agrs) {

		Test2<int[]> test = new Test2("Test");
		
		ArrayList list = new ArrayList();
		
		list.add("Test");
		list.add("13");
		list.add("tru1e");
		
		String s1  = (String) list.get(0);
		String s2  = (String) list.get(1);
		String s3  = (String) list.get(2);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
//		test.display();
	}

}
