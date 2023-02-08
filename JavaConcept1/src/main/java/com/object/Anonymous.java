package com.object;

class Calculation{
	public void fact(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println("factorial is : "+fact);
	}
}

public class Anonymous {
	
	public static void main(String ...strin) {
		
		new Calculation().fact(5);
		
	}

}
