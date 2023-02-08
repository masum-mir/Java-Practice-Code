package com.inheritance;

class Employee{
	float salary = 2000.5f;
}

public class FirstTest extends Employee{
	int bonus = 1000;
	
	public static void main(String[] args) {
		FirstTest obj = new FirstTest();
		System.out.println(obj.bonus);
		System.out.println(obj.salary);
	}

}
