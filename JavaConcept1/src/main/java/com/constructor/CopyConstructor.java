package com.constructor;

import java.util.Scanner;

public class CopyConstructor {
	
	int num;
	String name;
	
	public CopyConstructor(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public CopyConstructor(CopyConstructor ref) {
		int num2 = ref.num;
		String value = ref.name;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String name = in.nextLine();
		
		CopyConstructor cc = new CopyConstructor(10,name);
		
		System.out.println(cc.name);
		System.out.println(cc.num);
		
		
	}

}
