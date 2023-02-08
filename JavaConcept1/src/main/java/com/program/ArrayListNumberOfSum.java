package com.program;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNumberOfSum {

	public static void main(String ...st) {

		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		list.add(90);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input your search number: ");
		int num = input.nextInt();
		
//		list.forEach((value) -> {
//			if(num == value) {
//				System.out.println("The value is : "+num);
//			}
//		});
		
		for(Integer li: list) {
			if(num == li) {
				System.out.println("The number is : "+num);
				
			} 
			else{
				System.out.println("Number is not found");
			}
		}
		
	}
}
