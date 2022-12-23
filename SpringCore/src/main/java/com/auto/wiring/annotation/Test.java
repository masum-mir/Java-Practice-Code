package com.auto.wiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	private static ApplicationContext context;

	public static void main(String ...args) {
		
		context = new ClassPathXmlApplicationContext("com/auto/wiring/annotation/config.xml");
		
		A a = context.getBean("a", A.class);
		
		System.out.println(a);
		
		
		
	}

}
