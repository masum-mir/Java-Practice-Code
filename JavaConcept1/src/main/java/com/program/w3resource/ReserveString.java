package com.program.w3resource;

public class ReserveString {
	public static void main(String[] args) {
		
		String str = "Bangladesh";
		
		char[] letters= str.toCharArray();
		
		for(int i = letters.length - 1; i >= 0; i--) {
			System.out.print(letters[i] + " ");
		}
		
	}

}
