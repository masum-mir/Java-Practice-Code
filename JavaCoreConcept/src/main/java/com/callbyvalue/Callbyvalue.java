package com.callbyvalue;

public class Callbyvalue {
	
	int num = 50;
	
	void display(Callbyvalue cv) {
		cv.num = cv.num + 10;
	}
	
	public static void main(String ...stri) {
		Callbyvalue value = new Callbyvalue();
		
		System.out.println(value.num);
		
		value.display(value);
		
		System.out.println(value.num);
		
		
	}

}
