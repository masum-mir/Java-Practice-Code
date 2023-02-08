package com.string.method;

public class EqualsIgnoreCase {
	
	public static void main(String[] args) {
		
		String str1 = "Bangladesh";
		String str2 = "Canada";
		String str3 = "bangladesh";
		
		System.out.println(str1.equalsIgnoreCase(str3));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equalsIgnoreCase(str2));
		
	}

}
