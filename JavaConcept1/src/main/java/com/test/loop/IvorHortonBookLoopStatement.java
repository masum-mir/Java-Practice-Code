package com.test.loop;

public class IvorHortonBookLoopStatement {
	
	public static void main(String[] args) {
		int isNumbers = 10;
		
		outer:
		for(int i=2 ; ; i++) {
			for(int j=2;j<i;j++) {
				if(i % j == 0) {
					continue outer;
				}
			}
			System.out.print(i + " ");
			if(--isNumbers == 0) {
				break outer;
			}
		}
		
		
		
	}

}
