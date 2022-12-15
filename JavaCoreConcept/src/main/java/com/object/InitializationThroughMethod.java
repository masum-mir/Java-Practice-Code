package com.object;

class Teacher{
	int rollno;
	String name;
	
	public void insertRecord(int r, String n) {
		rollno = r;
		name = n;
	}
	
	public void display() {
		System.out.println(rollno + " : " +name);
	}
	
}

public class InitializationThroughMethod {

	public static void main(String[] args) {
		
		Teacher t1 = new Teacher();
		Teacher t2 = new Teacher();
		
		t1.insertRecord(10, "Masum");
		t2.insertRecord(11, "Ashik");
		
		t1.display();
		t2.display();
		
	}

}
