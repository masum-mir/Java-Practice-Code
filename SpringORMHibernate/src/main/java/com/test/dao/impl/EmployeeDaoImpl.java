package com.test.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.test.dao.EmployeeDao;
import com.test.entites.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private HibernateTemplate hibernateTemplate;

	public int insertEmployee(Employee emp) {
		return (Integer) hibernateTemplate.save(emp);
		
	}

	public Employee getEmployee(int id) {
		return hibernateTemplate.get(Employee.class,id);
	}

	public List<Employee> getAllEmployee() {
		return hibernateTemplate.loadAll(Employee.class);
	}

	public void deleteEmployee(Employee e) {
		hibernateTemplate.delete(e);
	}

	public void updateEmployee(Employee e) {
		hibernateTemplate.update(e);
		
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	


	

}
