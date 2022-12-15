package com.program;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListNumberSearch {
	
	public static void main(String[] args) {
		
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
		
		for(Integer li: list) {
			if(num == li) {
				System.out.print("The search value: " +li + " ");
			} 
			
		}
		
		System.out.println();
		
		for(Integer li: list) {
			
			if(li > num) {
				li += 10;
			}
			
			System.out.print(li + " ");
			
		}
		
		
		
		
	}
			

}
