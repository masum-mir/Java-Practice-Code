package com.string.method;

public class Concat {
	
	public static void main(String ...stri) {
		
		String str1 = "Bangladesh is a beautiful country.";
		String str2 = " Canada is my favaroute country.";
		String str3 = " My dream is error";
		
		System.out.println(str1.concat(str2).concat("@").concat(str3));
	}

}
