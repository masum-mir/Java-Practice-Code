package com.test;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.test.dao.StudentDao;
import com.test.dao.StudentDaoImp;

@Configuration
public class JdbcConfig {

	@Bean("ds")
	public DataSource getDataSource() {
		
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/test");
		ds.setUsername("root");
		ds.setPassword("root");
		
		return ds;
	}
	
	@Bean("jdbcTemplate")
	public JdbcTemplate getTemplate() {
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(getDataSource());
		
		return jdbcTemplate;
	}
	
	@Bean("studentDao")
//	@Bean(name={"studentDao"})
	public StudentDao getStudentDao() {
		
		StudentDaoImp studentDao = new StudentDaoImp();
		studentDao.setJdbcTemplate2(getTemplate());
		
		return studentDao;
	}
	
	
}
