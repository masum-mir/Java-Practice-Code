package com.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.test.dao.StudentDao;
import com.test.dao.StudentDaoImp;
import com.test.entity.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/test/config.xml");
//          ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        	ApplicationContext context = new AnnotationConfigApplicationContext(AutoWiringCofig.class);
        
//        JdbcTemplate jdbcTem= context.getBean("jdbcTemplate", JdbcTemplate.class);
//        
//        String query = "insert into student(id,name,city) values(?,?,?)";
//        
//        int st = jdbcTem.update(query,15,"Masum","Sreepur");
        
        StudentDaoImp sd = context.getBean("studentDao", StudentDaoImp.class);
        
        // insert student
        Student student = new Student();
        student.setId(1095);
        student.setName("buri12");
        student.setCity("Sreepur12");
        
        int result = sd.insert(student);
        System.out.println(result);
        
        // update student
//        Student student = new Student();
//        student.setId(14);
//        student.setName("ABC");
//        student.setCity("Gosinga");
//        
//        int result = sd.update(student);
//        System.out.println(result);
        
        //delete student

//        int result = sd.delete(102);
//        System.out.println(result);
        
        // single object
//        Student student1 = sd.getStudent(107);
//        System.out.println("Student Id:: "+student1.getId()+" \nStudent Name:: "+student1.getName()+" \nStudent City:: "+student1.getCity());
        
        
        // multiple objects
        List<Student> students = sd.getAllStudents();
        
        for(Student st: students) {
        	System.out.println(st.getId()+" : "+st.getName()+" : "+st.getCity());
        }
        
        
    }
}
