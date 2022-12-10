package com.auto.wiring;

import org.springframework.beans.factory.annotation.Autowired;

public class A {
	
	@Autowired
	private B b;

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}

	/* @Autowired */
	public A(B b) {
		super();
		this.b = b;
	}


	public B getB() {
		return b;
	}
	/* @Autowired */
	public void setB(B b) {
		this.b = b;
	}

	@Override
	public String toString() {
		return "A [b=" + b + "]";
	}
	
	
	

}
