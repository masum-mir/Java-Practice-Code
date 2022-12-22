package lifeCycleMethod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifeCycleMethod/config.xml");
			
//		using xml 
		Student student = (Student) context.getBean("marks");
		System.out.println(student.getMarks());
		
		context.registerShutdownHook();
		
		System.out.println("++++++++++++++++++++++++++++++");
		
//		using interface 
		InterfaceEXM in = (InterfaceEXM) context.getBean("i1");
		System.out.println(in);
		
		System.out.println("+++++++++++++++++++++++++++++++");
//		using annotation 
		
		Annotation an = (Annotation) context.getBean("a1");
		System.out.println(an);
		
	}

}
