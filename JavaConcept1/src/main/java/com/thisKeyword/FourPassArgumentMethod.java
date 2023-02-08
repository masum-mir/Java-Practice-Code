package com.thisKeyword;

class A2 {
	void m(A2 obj) {
		System.out.println("method is invoked");
	}
	
	void n() {
		m(this);
	}
}

public class FourPassArgumentMethod {
	
	public static void main(String[] agrs) {
		
		A2 a1 = new A2();
		a1.n();
		
	}

}
