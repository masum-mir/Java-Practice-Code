package com.program;

import java.util.Scanner;

public class SumOfArray {
	
	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50,60,70,80,90};
		
		System.out.print("Input your target number: ");
		Scanner input = new Scanner(System.in);
		int target = input.nextInt();
		
		int index = -1;
		
		for(int i = 0 ; index < 0 && i < arr.length; i++) {
			if(arr[i] > target) {
				index = i;
				arr[i] += 10;
			} 
		}
		
		System.out.println(index >= 0 ? "index : " + index : "number is not found");
		
		for(int i: arr) {
			System.out.print(i+" ");
		}

	}

}
 