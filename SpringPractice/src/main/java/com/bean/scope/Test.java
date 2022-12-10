package com.bean.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String ...str) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/bean/scope/config.xml");
		
		Student student = context.getBean("student", Student.class);
		
		System.out.println(student.hashCode());

		Student st = context.getBean("student", Student.class);
		
		System.out.println(st.hashCode());
		
		Student stt = context.getBean("student", Student.class);
		
		System.out.println(stt.hashCode());
		
		
	}
}
