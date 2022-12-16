package com.statickeyword;

class Count{
	static int count = 0;
	
	Count(){
		count++;
		System.out.println(count);
	}
	
}

public class StaticAndwithoutStaticVariable {
	
	public static void main(String[] agrs) {
		
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 =new Count();
		
	}

}
