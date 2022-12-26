package com.test.dao;

import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.test.entity.Student;

@Component("studentDao")
public class StudentDaoImp implements StudentDao{

	@Autowired
	private JdbcTemplate jdbcTemplate2;
	
	public int insert(Student st) {
		String query = "insert into student(id,name,city) values(?,?,?)";
		
		int info = this.jdbcTemplate2.update(query, st.getId(), st.getName(), st.getCity());
		
		return info;
	}
	
	public int update(Student st) {
		String query = "update student set name=?, city=? where id=?";
		
		int info = this.jdbcTemplate2.update(query, st.getName(), st.getCity(), st.getId());
		
		return info;
	}
	
	public int delete(int id) {
		String query = "delete from student where id=?";
		
		int info = jdbcTemplate2.update(query, id);
		
		return info;
	}
	
	// select single student data
	public Student getStudent(int studentId) {
		String query = "select * from student where id=?";
		org.springframework.jdbc.core.RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate2.queryForObject(query, rowMapper, studentId);
		
		return student;
	}
	
	public List<Student> getAllStudents() {
		
		String query = "select * from student";
		List<Student> students = this.jdbcTemplate2.query(query, new RowMapperImpl());
		
		
		return students;
	}

	public void setJdbcTemplate2(JdbcTemplate jdbcTemplate2) {
		this.jdbcTemplate2 = jdbcTemplate2;
	}
	
	public JdbcTemplate getJdbcTemplate2() {
		return jdbcTemplate2;
	}


	
}
