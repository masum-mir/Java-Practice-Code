package com.string;

import java.util.Date;

public class StringDemo {

	public static void main(String[] agrs) {
		String st = new String("Hello world");
		System.out.println(st);
		byte[] ascii= {71,70,71,44};
		String st2 = new String(ascii);
		System.out.println(st2);
		String st3 = new String(ascii,2,1);
		System.out.println(st3);
		
		char c[] = {'G','f','g'};
		
		String s1 = new String(c);
		String s2 = new String(s1);
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		if(s1.equals(s2)) {
			System.out.println("hello");
		}
//		
//		String s = "Masum";
//		
//		s.concat("ABC");
//		System.out.println(s);
		
		
		String name = "Bangladesh";
		
		char ch = name.charAt(2);
		System.out.println(ch);
		
		int strLength  = name.length();
		System.out.println(name.charAt(strLength-1));
		
		// compareTo()
		
		String s5 = "ABC";
		String s6 = "DEF";
		String s7 = "GHI";
		String s8 = "JKL";
		
		System.out.println(s6.compareTo(s5));
		System.out.println(s6.compareTo(s6));
		System.out.println(s6.compareTo(s7));
		System.out.println(s6.compareTo(s8));
		
		// contains() 
		System.out.println(name.contains("desh"));
		
		// getBytes()
		byte[] e = name.getBytes();
		for(int i=0;i<e.length;i++) {
			System.out.print(e[i] + " ");
		}
		
		System.out.println();
		
		int index = name.indexOf("an",3);
		System.out.println(index);
		
		// indexOf()
		String e1 = new String("Hello").intern();
		String e2 = "Hello";
		
		System.out.println(e1==e2);
		
		// join()
		String joinString = String.join("- ", "A","B","C");
		System.out.println(joinString);


		String time = String.join(":", "10","33","2");
		System.out.println(time);
		
		String txt  = "Bangladesh is a beautiful country, but this calture";
		
		String[] words = txt.split("\\s");
		
		for(String w:words) {
			System.out.println(w);
		}
		
		 String str = "word1, word2 word3@word4?word5.word6";
		 
		 String[] arr = str.split("[, . ? @]");
		for(String a: arr) {
			System.out.println(a);
		}
		
		int n= 102;
		
		String sn = String.valueOf(n);
		
		if(sn.startsWith("1")) {
			System.out.println(sn);
		}
		
		
		
		
		
	}
	
}
