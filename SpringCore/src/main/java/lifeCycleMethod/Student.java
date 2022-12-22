package lifeCycleMethod;

public class Student {

	private double marks;

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		System.out.println("Marks set");
		this.marks = marks;
	}

	public Student(double marks) {
		super();
		this.marks = marks;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
	
	
}
