package com.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		
		System.out.println("HEllo ");
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/reference/config.xml");
		
		
		A a = (A) context.getBean("aref");
		
		System.out.println(a);
		System.out.println(a.getX());
		System.out.println(a.getOb().getY());
		System.out.println(a.getOb());
		
		
	}

}
