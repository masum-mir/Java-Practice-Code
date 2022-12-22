package lifeCycleMethod;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotation {
	
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Annotation(String subject) {
		super();
		this.subject = subject;
	}

	public Annotation() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Annotation [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting method");
	}
	
	@PreDestroy
	public void distroy() {
		System.out.println("Distroy method");
	}
	

}
