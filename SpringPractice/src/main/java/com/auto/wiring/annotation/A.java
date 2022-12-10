package com.auto.wiring.annotation;

public class A {
	
	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}

	public A(B b) {
		super();
		this.b = b;
	}

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
	

}
