package com.abstraction;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	int id;
	// jodi serialization krtey nah chii tkn , transient use krbo
	transient String name;
	public Student(int id, String name) {
		this.id = id;
		this.name  = name;
	}
}

public class SerializableDemo {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student  emp = new Student(12,"Masum");
		
		/// serialization
		FileOutputStream fout = new FileOutputStream("student.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(emp);
		out.flush();
		out.close();
		System.out.println("seriablization done");
		
		
		/// deserialization
		
		FileInputStream finput = new FileInputStream("student.txt");
		ObjectInputStream input = new ObjectInputStream(finput);
		
		Student s = (Student) input.readObject();
		
		System.out.println(s.id + " " + s.name);
		
		input.close();
		
	}

}
