package com.program.w3resource;

public class AddTwoBinaryNumber {
	
	public static void main(String[] args) {
		
		String s1 = "101";
		String s2 = "111";
		
		int first = s1.length() - 1;
		
		int second = s2.length() - 1;
		
		StringBuilder sb = new StringBuilder();
		
		int carry = 0;
		
		while(first >= 0 || second >= 0) {
			int sum = carry;
   			if(first >= 0) {
				sum += s1.charAt(first) - '0';
				first--;
			}
			if(second >= 0) {
				sum += s2.charAt(second) - '0';
				second--;
			}
			carry = sum >> 1;
			sum = sum & 1;
			sb.append(sum == 0 ? '0' : '1');
		}
		
		if(carry > 0) {
			sb.append('1');
		}
		
		sb.reverse();
		
		System.out.println(String.valueOf(sb));
		
//		 2nd method
		
		StringBuilder sb2 = new StringBuilder();
		int carry2 = 0;
		
		for(int i=s1.length() - 1,  j = s2.length()-1; i>=0 || j>=0; i--,j--) {
			int sum = carry2 + (i>=0 ? s1.charAt(i)-'0':0) + (j>=0 ? s2.charAt(j)-'0':0);
			sb2.append(sum%2);
			carry2 = sum / 2;
		}
		
		if(carry2 > 0 ) {
			sb2.append(carry2);
			
		}
		sb2.reverse();
		System.out.println(sb2.toString());
		
		
	}

}
