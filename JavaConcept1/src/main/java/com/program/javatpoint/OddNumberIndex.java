package com.program.javatpoint;

public class OddNumberIndex {

	public static void main(String[] args) {
		
		double num1 = 21;
		double num2 = 22;
		int count = 0;
		
		double result = (num2 - num1)/2;

		if(result % 2 == 0 && num1 % 2 == 0 && num2 % 2 == 0) {
			count = (int) result;
		} else if(result % 2 != 0 && num1 % 2 == 0 && num2 % 2 == 0) {
			count = (int) result;
		} else if (result % 2 != 0 && num1 % 2 != 0 && num2 % 2 != 0 ) {
			count = (int) result + 1;
		} else if (result % 2 == 0 && num1 % 2 != 0 && num2 % 2 != 0 ) {
			count = (int) result + 1;
		}
		else if (result % 2 == 0 && num1 % 2 == 0 && num2 % 2 != 0 ) {
			count = (int) result + 1;
		}
		else if (result % 2 == 0 && num1 % 2 == 0 && num2 % 2 == 0 ) {
			count = (int) result + 1;
		} 
		  else {
			count = (int) result + 1;
		}
		
		System.out.println(count);
		
		
//		int x = 8;
//		
//		double result2 = Math.sqrt(x);
//		System.out.println(result2);
		
		int [] digits = {123};
		
//		int arr = digits.length;
        int result1 = 0;
        
        
        for(int i=0; i<digits.length;i++) {
        	int temp = digits[i] % 10;
            result1 = result1 * 10+ temp;
            temp = temp / 10;
        }
		
        
        System.out.println(result1);
		
		
	}


}
 