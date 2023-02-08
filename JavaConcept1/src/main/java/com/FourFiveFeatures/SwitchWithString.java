package com.FourFiveFeatures;

public class SwitchWithString {

	public static void main(String[] args) {
		
		String name = "Ludo";
		
		switch(name) {
			case "Cricket": case "Football": case "Hadodo":
				System.out.println("Outdoor Game.");
				break;
			case "Daba": case "Ludo":
				System.out.println("Indoor Game.");
				break;
			default:
				System.out.println("No Game Found.");
		}
		
	}
}
