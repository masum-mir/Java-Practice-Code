package com.polymorphism;

class Bicycle {
	String define_me() {
		return "a bicyle with pedals.";
	}
	
}

class MotoBike extends Bicycle {
	@Override
	String define_me() {
		return "a bike with engine.";
	}
	
	MotoBike() {
		
		System.out.println(define_me());
		
		String temp = super.define_me();
		
		System.out.println(temp);
	}
	
	
}

public class MethodOverrideSuperKeyword {
	
	public static void main(String[] args) {
		MotoBike mb = new MotoBike();
	}
	
}
