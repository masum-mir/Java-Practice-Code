package com.program.w3resource;

public class NumberfOfCharacterNumber {
	
	public static void main(String[] args) {
		
		String str = " Aa kiu,I swd skieo 236587. GH kiu: sieo?? 25.33";
		
		char[] ch = str.toCharArray();
		
		int letter=0, digit=0, space=0, others=0;
		
		for(int i=0;i<str.length();i++) {
			if(Character.isLetter(ch[i])) {
				letter++;
			} else if(Character.isDigit(ch[i])) {
				digit++;
			} else if (Character.isSpace(ch[i])) {
				space++;
			}else {
				others++;
			}
		}
		
		System.out.println("letter : " + letter);
		System.out.println("digit : "+ digit);
		System.out.println("space : "+ space);
		System.out.println("others : "+ others);
		
	}

}
