package com.program.w3resource;

public class MathPow {
	public static void main(String[] agrs) {
		
		double m =2.10000;
		double n = -2;
		double r = m;
		
		
		for(double i=Math.abs(n);i>=Math.round(m);--i) {
			r = r * m;
		}
		
		System.out.println(r);
		
	}

}
