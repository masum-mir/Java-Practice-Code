package com.methods;

class Student{
	private int num;
	private String name;
	
	public Student() {
	}
	
	public Student(int num, String name) {
		this.num = num;
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}


	public String toString() {
		return "Student [num=" + num + ", name=" + name + "]";
	}

	
	
}


public class MethodDemo {
	
	public static void main(String[] args) {
		Student st = new Student();
		
		st.setNum(23);
		st.setName("abc");
		
	}
	

}
