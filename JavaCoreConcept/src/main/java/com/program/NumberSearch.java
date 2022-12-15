package com.program;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class NumberSearch {

	public static void main(String []args) {
		
		long startTime = System.currentTimeMillis();
		
		int num[] = {10,20,30,40,50,60,70,80,90};
		
		Scanner input = new Scanner(System.in);
		System.out.print("Input your number: ");
		int value = input.nextInt();

//		forlooplevel : for(int i=0; i<num.length; i++) {
//			if( value == num[i] ) {
//				System.out.print("The value is : "+value + " \nIndex number: "+i);
//				break forlooplevel;
//			} 
//			else{
//				System.out.println("Value not found.");
//			}
//			
//		}
//		boolean found = false;
//		
//		for(int i=0; !found && i<num.length; i++) {
//			if( value == num[i] ) {
//				System.out.print("The value is : "+value + " \nIndex number: "+i);
//				
//			} 
////			else{
////				System.out.println("Value not found.");
////			}
//		}
//		
//		System.out.println( found ? "found" : "Value not found.");
//		
		int index = -1;
		int foundFlag = -1;
//		O(1)
		for(int i=0; i < num.length; i++) {
			System.out.println("------------------------ " + (i+1));
			if( value == num[i] ) {
//				index = i;
				foundFlag = i;
				break;
//				System.out.print("The value is : "+value);
				
			} 
		}
		
		if (foundFlag == -1) {
			System.out.println("Target value " + value + " is not present in array.");
		} else {
			System.out.println("Target value " + num[foundFlag] + " is found in array posistion " + foundFlag + ".");
		}
		
//		System.out.println(index >= 0 ? "Found in " + index : " Value not found");
//		System.out.println(index > 0? "Target value " + value + " is found in array posistion " + index + ".": 
//			"Target value " + value + " is not present in array.");
//		
//		
		
		long endTime = System.currentTimeMillis();
		
		NumberFormat formatter = new DecimalFormat("#0.00000");
		
		String totalTime = formatter.format((endTime - startTime) / 1000d);
		System.out.println(totalTime);
		
	}
	
}
