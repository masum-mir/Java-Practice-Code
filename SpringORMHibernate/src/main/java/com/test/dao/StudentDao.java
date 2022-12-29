package com.test.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.test.entites.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student) {
		
		Integer i = (Integer) hibernateTemplate.save(student);
		
		return i;
	}
	
	@Transactional
	public void delete(int id) {
		Student student = hibernateTemplate.get(Student.class,id);
		hibernateTemplate.delete(student);
	}
	
	@Transactional
	public void delete(Student s) {
		hibernateTemplate.delete(s);
	}
	
	@Transactional
	public void update(Student s) {
		hibernateTemplate.update(s);
	}
	
	public Student getStudent(int id) {
		return hibernateTemplate.get(Student.class,id);
	}

	public List<Student> getAllStudent() {
		return  hibernateTemplate.loadAll(Student.class);
	}
	
	

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	
	

}
