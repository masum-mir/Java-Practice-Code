package com.interfacee;

abstract class Book {
	String name;
	abstract void setName(String n);
	
	abstract String getName();
}

class MyBook extends Book {
	
	String name;

	@Override
	void setName(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		return name;
		
	}
	
}

public class AbstractVariable {

	public static void main(String[] args) {
		String n="Masum";
		MyBook mb = new MyBook();
		
		mb.setName(n);
		System.out.println(mb.getName());
		
	}

}
