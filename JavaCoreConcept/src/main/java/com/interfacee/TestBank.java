package com.interfacee;

abstract class Bank{
	abstract int getInterest();
}

class MTB extends Bank{
	int getInterest() {
		return 5;
	}
}

class ICICI extends Bank{
	int getInterest() {
		return 7;
	}
}

public class TestBank {
	public static void main(String[] agrs) {
		MTB m = new MTB();
		System.out.println("Mutual Trast Bank interest is: "+m.getInterest()+" %");
		
		ICICI ic = new ICICI();
		System.out.println("ICICI Bank interest is: "+m.getInterest()+" %");
		
	}

}
