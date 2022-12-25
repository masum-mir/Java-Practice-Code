package com.test.dao;

import java.util.List;

import com.test.entity.Student;

public interface StudentDao {
	
	public int insert(Student st);
	public int update(Student st);
	public int delete(int id);
	
	public Student getStudent(int studentId);
	
	public List<Student> getAllStudents();

}
