package com.interfacee;

interface PrintTable{
	public void print();
	default void print2() {
		System.out.println("print 2 .............!");
	}
	static void print3() {
		System.out.println("print 3..............!");
	}
	private void print4() {
		System.out.println("print 4.............!");
	}
}

interface ShowTable {
	public void show();
}

public class Multipleinheritaance implements PrintTable,ShowTable{
	
	@Override
	public void print() {
		System.out.println("print table..........!");
	}

	@Override 
	public void show() {
		System.out.println("show table...........!");
	}
	
	
	public static void main(String[] agrs) {
		Multipleinheritaance m1 = new Multipleinheritaance();
		
		m1.print();
		m1.show();
		
		//default method
		m1.print2();
		
		// static method
		PrintTable.print3();
		
		// private method
		m1.print4();

	}

}
