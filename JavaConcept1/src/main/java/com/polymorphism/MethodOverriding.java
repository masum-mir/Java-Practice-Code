package com.polymorphism;

class Bank{
	public int getRateOfInterest() {
		return 0;
	}
}

class MTB extends Bank{
	public int getRateOfInterest() {
		return 10;
	}
}

class ICICI extends Bank{
	public int getRateOfInterest() {
		return 8;
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
	
		MTB m = new MTB();
		ICICI ic = new ICICI();
		
		int m1 = m.getRateOfInterest();
		int ic1 = ic.getRateOfInterest();
		
		System.out.println("MTB Bank rate of interest: " + m1);
		System.out.println("ICICI bank rate of interest: "+ ic1);
	}

}
