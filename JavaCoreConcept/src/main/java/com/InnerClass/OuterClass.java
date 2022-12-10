package com.InnerClass;

public class OuterClass {
	
	int num = 30;
	
	public class InnerClass {
		int num2 =50;
		
		public int myInnerMethod() {
			return num;
		}
	}

}
