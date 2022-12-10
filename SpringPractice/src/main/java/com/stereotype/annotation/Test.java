package com.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String ...d) {
		System.out.println("hi");
		
		ApplicationContext context  = new ClassPathXmlApplicationContext("com/stereotype/annotation/config.xml");
		
		Student student = context.getBean("ob", Student.class);
		
		System.out.println(student);
		System.out.println(student.getCourses());
		
		System.out.println(student.getCourses().getClass().getName());
		
	}

}
