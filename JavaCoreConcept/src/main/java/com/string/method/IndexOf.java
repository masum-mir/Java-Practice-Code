package com.string.method;

public class IndexOf {
	
	public static void main(String ...string) {
		
		String str = "Bangladesh is a small country.";
		
//		int index1 = str.indexOf("is");
//		int index2 = str.indexOf("a");
//		
//		System.out.println(index1);
//		System.out.println(index2);
//		
//		int index3 = str.indexOf("small",14);
//		
//		System.out.println(index3);
//		
		int count = 0;
		int startForm = 0;
		
		for(; ;) {
			
			int index = str.indexOf('a', startForm);
			
			if(index >= 0) {
				count++;
				startForm = index + 1;
			} else {
				break;
			}
		} 
		
		
		System.out.println("String is : " +str);
		
		System.out.println("The 'a' character is " + count +" times.");
		
		
		String value = "I like BD. But hate this culture.";
		
		int index5 = value.indexOf("hate");
		
		System.out.println(index5);
		
		int index6 = value.indexOf("hate", 15);
		
		System.out.println(index6);
		
	}
}
