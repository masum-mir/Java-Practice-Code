package com.abstraction;

import java.io.Serializable;
import java.util.Scanner;

public class CloneableDemo implements Cloneable{
	int id;
	String name;
	double cost;
	
	public CloneableDemo(int id, String name, double cost) {
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	
	public void print() {
		System.out.println("ID :: "+id);
		System.out.println("Name :: "+name);
		System.out.println("Cost :: "+cost);
	}

	public static void main(String[] agrs) throws CloneNotSupportedException {
		
		Scanner input = new Scanner(System.in);
		int id = input.nextInt();
		String name = input.next();
		double cost = input.nextDouble();
		
		CloneableDemo p1 = new CloneableDemo(id,name,cost);
		
		CloneableDemo p2 = (CloneableDemo) p1.clone();

		p1.print();
		p2.print();
		
//		Object.clone();
//		
//		Serializable
	}
	
}
