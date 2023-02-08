package com.string.method;

public class GetBytes {
	
	public static void main(String ...strin) {
		
		String str1 = "Bangladesh";
		
		byte[] st = str1.getBytes();
		
		for(int i =0 ;i<st.length; i++) {			
			System.out.print(st[i] + " ");
		}
		
		String str2 = new String(st);
		
		System.out.println("\n"+ str2);
	}
	
}
