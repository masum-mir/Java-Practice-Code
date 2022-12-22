package com.object;

class Student11 implements Cloneable{
	private String name;
	private int roll;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getRoll() {
		return roll;
	}
	
	public void setRoll(int roll) {
		this.roll = roll;
	}
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
		
	}
}

public class CloneMethod{
	
	public static void main(String[] agrs) {
		Student11 s1 = new Student11();
		s1.setName("Masum");
		s1.setRoll(101);
		
		System.out.println(s1.getName() + " : "+s1.getRoll());
		try {
			Student11 s2 = (Student11)s1.clone();
			System.out.println(s2.getName() + " : "+s2.getRoll());
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
