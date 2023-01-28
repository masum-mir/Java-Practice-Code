package com.program.w3resource;

public class UniqueThreeDigitNumber {
	
	public static void main(String[] agrs) {
		
		int numbers = 0;
		
		for(int i=1;i<=3;i++) {
			for(int j=1; j<=3;j++) {
				for(int k=1; k<=3;k++) {
					if(i != j && j != k && k!=i) {
						numbers++;
						System.out.println(i + "" + j + "" +k);
					}
				}
				
			}
		}
		
		System.out.println("\nTotal numbers :: " + numbers);
	}

}
