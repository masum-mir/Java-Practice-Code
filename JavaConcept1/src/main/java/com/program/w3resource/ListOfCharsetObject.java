package com.program.w3resource;

import java.nio.charset.Charset;

public class ListOfCharsetObject {
	
	public static void main(String[] agrs) {
		
		System.out.println("List of charsets :: ");
		for(String str: Charset.availableCharsets().keySet()) {
			System.out.println(str);
		}
		
		
	}

}
 