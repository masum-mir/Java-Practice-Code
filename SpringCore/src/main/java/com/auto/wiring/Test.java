package com.auto.wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String ...args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/auto/wiring/config.xml");
		
		A a = (A) context.getBean("a"); 
		
		System.out.println(a);
	}
}
