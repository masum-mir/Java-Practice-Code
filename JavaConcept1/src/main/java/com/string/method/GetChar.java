package com.string.method;

public class GetChar {
	public static void main(String[] args) {
		
		String str = "Bangladesh is a beautiful country";
		
		char[] ch = new char[1533231];
		
		try {
			
			str.getChars(0, 33, ch, 0);
			
			System.out.println(ch);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
