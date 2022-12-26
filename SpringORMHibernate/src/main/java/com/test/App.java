package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.StudentDao;
import com.test.entites.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       	ApplicationContext con = new ClassPathXmlApplicationContext("com/test/config.xml");      	
       	StudentDao studentDao = con.getBean("studentDao", StudentDao.class);	
       	Student student = new Student(12,"Masum","Dhaka");
       	int r = studentDao.insert(student);
       	
       	System.out.println("hi");
    }
}
