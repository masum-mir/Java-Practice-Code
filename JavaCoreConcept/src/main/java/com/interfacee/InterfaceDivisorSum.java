package com.interfacee;

interface AdvancedArithmatic {
	int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmatic{
	int j = 0;
	@Override
	public int divisor_sum(int n) {
		
		for(int i = 1; i <= 1000; i++) {
			if(n % i == 0) {
				j = j + i;
			}
		}
		
		return j;
	}
	
}

public class InterfaceDivisorSum {
	public static void main(String[] args) {
		
		MyCalculator my_calculator = new MyCalculator();
		System.out.print("i am implemented: ");
		ImplementInterfaceNames(my_calculator);
		int n = 6;
		System.out.println(my_calculator.divisor_sum(n));
		
	}

	private static void ImplementInterfaceNames(Object o) {
		Class[] theInterfaces = o.getClass().getInterfaces();
		
		
		for(int i=0; i<theInterfaces.length;i++ ) {
			String interfacesName = theInterfaces[i].getName();
			System.out.println(interfacesName);
		}
		
	}

}
