package com.statickeyword;

public class WithoutMainMethod {

	static {
		System.out.println("static block is invoked");
		System.exit(0);
	}
	
}
