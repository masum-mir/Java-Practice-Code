package com.string.method;

public class CharAt {
	
	public static void main(String ...stri) {
		
		String str = "Bangladesh is a Beautiful country.";
		
		char ch = str.charAt(16);
		
		System.out.println(ch);
		
		int strLength = str.length();
		
		System.out.println("Character at last index: "+str.charAt(strLength - 2));
		
		for(int i=0; i<str.length(); i++ ) {
			if(i%2 != 0 ) {
				System.out.print(str.charAt(i) + " ");
			}
		}
		
		int count=0;
		for(int i=0; i<=str.length() - 1; i++ ) {
			if(str.charAt(i) == 't') { 
				count++;
			}
		}
		System.out.println("Count number: " +count);
		
	}

}
