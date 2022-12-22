package com.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/collection/config.xml");
		
		Student student = (Student) context.getBean("student1");
		
		Student student2 = (Student) context.getBean("student2");
		
		System.out.println(student.getName());
		System.out.println(student.getAddress());
		System.out.println(student.getPhones());
		System.out.println(student.getCourses());
		
		System.out.println(student2.getStId());
		System.out.println(student2.getName());
		System.out.println(student2.getPhones());
		System.out.println(student2.getAddress());
		System.out.println(student2.getCourses());
		
	}

}
