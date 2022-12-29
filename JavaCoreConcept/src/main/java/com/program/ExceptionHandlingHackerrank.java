package com.program;

import java.util.Scanner;

public class ExceptionHandlingHackerrank {
	
	public static void main(String[] args) {
		
		 Scanner input = new Scanner(System.in);
	        int x = Integer.parseInt(input.next());
	        int y = Integer.parseInt(input.next());
	        int result;
	        
	        try {
	            result = x / y;
	            System.out.println(result);
	        } catch(Exception e) {
//	            e.printStackTrace();
	            System.out.println(e.getMessage());
	        }
	        
	        
		
	}

}
