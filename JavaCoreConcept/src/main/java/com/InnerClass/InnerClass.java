package com.InnerClass;

public class InnerClass {
	public static void main(String[] args) {
		
		OuterClass inn = new OuterClass();
		OuterClass.InnerClass outt = inn.new InnerClass();
		
		System.out.println(inn.num);
		System.out.println(outt.num2);
		System.out.println(outt.myInnerMethod());
		
		
	}
}
