package com.constructor;

public class CopingWithoutConstructor {
	
	int id;
	String name;
	
	CopingWithoutConstructor(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	CopingWithoutConstructor(){
		
	}
	
	void display() {
		System.out.println(id + " : " + name);
	}
	
	public static void main(String[] args) {
		CopingWithoutConstructor cc1 = new CopingWithoutConstructor(121,"Masum");
		CopingWithoutConstructor cc2 = new CopingWithoutConstructor();
		
		cc2.id = cc1.id;
		cc2.name = cc1.name;
		
		cc1.display();
		cc2.display();
		
		
	}

}
