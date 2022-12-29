package com.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.test.dao.StudentDao;
import com.test.dao.impl.EmployeeDaoImpl;
import com.test.entites.Employee;
import com.test.entites.Student;

public class App 
{
    public static void main( String[] args )
    {
       	ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");      	
//       	StudentDao studentD = con.getBean("studentDao", StudentDao.class);	
       	EmployeeDaoImpl employeeD = con.getBean("employeeDao", EmployeeDao.class);
       
       	// insert student;
       	
//       	Student student = new Student(155,"Masum12","Dhaka12");
//       	int r = studentD.insert(student);
//       	
//       	System.out.println("hi"+r);
       	
       	//update student
       	
//       	Student student = studentD.getStudent(12);
//       	student.setStudentName("Buri");
//       	studentD.update(student);
       	
       	//get student
       	
//       	Student student = studentD.getStudent(12);
//       	System.out.println(student.getStudentID() + " : "+ student.getStudentName());
       	
       	//get all student
       	
//       	List<Student> student2 = studentD.getAllStudent();
//       	
//       	for(Student st:student2) {
//       		System.out.println(st.getStudentName()+" : "+st.getStudentCity());
//       	}
       	
       	// delete student
       	
//       	studentD.delete(13);
       	
//       	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//       	boolean go = true;
//       	while(go) {
//       		
//       		try {
//       			int input = Integer.parseInt(br.readLine());
//       			
//       			System.out.println("Press 1 ");
//       			System.out.println("Press 2 ");
//       			System.out.println("Press 3");
//       			System.out.println("Press 4");
//       			System.out.println("Press 5");
//       			System.out.println("Press 6 exit");
//       			
//       			switch(input) {
//       			case 1:
//       				break;
//       			case 2:
//       				break;
//       			case 3:
//       				break;
//       			case 4:
//       				break;
//       			case 5:
//       				break;
//       			case 6:
//       				go = false;
//       				break;
//       			
//       			}
//       			
//       			
//       		} catch(Exception e) {
//       			System.out.println("Invalid input try with another one.!!");
//       			System.out.println(e.getMessage());      		
//       		}
//       	}
       	
       	
       	
       	
    }
}
