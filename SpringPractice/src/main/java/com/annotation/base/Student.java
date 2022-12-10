package com.annotation.base;

import org.springframework.stereotype.Component;

//@Component

public class Student {
	
	private Teacher teacher;
	private Person person;
	
	
	

	public Student(Teacher teacher, Person person) {
		super();
		this.teacher = teacher;
		this.person = person;
	}



	public Person getPerson() {
		return person;
	}



	public void setPerson(Person person) {
		this.person = person;
	}


	public Teacher getTeacher() {
		return teacher;
	}



	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}



	public void display() {
		this.person.show();
		this.teacher.show();
		System.out.println("Show Show Show");
	}
}
