package com.string.method;

import java.util.ArrayList;

public class Equals {
	
	public static void main(String [] args) {
		
		String str1 = "Bangladesh";
		String str2 = "Bangladesh";
		String str3 = new String("Bangladesh");
		StringBuffer str4 = new StringBuffer("Bangladesh");
		
		System.out.println(str1.equals(str4.toString()));
		
		System.out.println(str1.equals(str2.toString()));
		System.out.println(str1.equals(str3.toString()));
		
		ArrayList<String> str = new ArrayList<>();
		
		str.add("Bangladesh");
		str.add("Canada");
		str.add("India");
		
		System.out.println(str1.equals(str.toString()));
		
		for(String st: str) {
			if(st.equals(str2)) {
				System.out.println("Hello world");
				
			} 
		}
		
		
	}

}
