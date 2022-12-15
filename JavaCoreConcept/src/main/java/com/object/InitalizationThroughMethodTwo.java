package com.object;

class Employee{
	int id;
	String name;
	float salary;
	
	public void insert(int id,String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void display() {
		System.out.println(id+" : "+ name + " : "+salary);
	}
}

public class InitalizationThroughMethodTwo {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		Employee emp3 = new Employee();
		
		emp1.insert(10, "A", 10.2f);
		emp2.insert(12, "B", 12.2f);
		emp3.insert(14, "C", 14.2f);
		
		emp1.display();
		emp2.display();
		emp3.display();
		
	}

}
