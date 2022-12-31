package com.program.hackerrank;

import java.util.Scanner;

public class StdInAndStdOut {
	public static void main(String[] agrs) {
		
		Scanner input = new Scanner(System.in);
		
		int i = input.nextInt();
		Double d = input.nextDouble();
//		input.nextLine();
		String s = input.nextLine();
		
		if(input.hasNextLine() & s.isEmpty()) {
			s = input.nextLine();
		}
		
		System.out.println("String s = "+ s);
		System.out.println("Double d = "+ d);
		System.out.println("Int i = "+i);
		
		
		
	}

}
