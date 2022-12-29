package com.test.dao;

import java.util.List;

import com.test.entites.Employee;

public interface EmployeeDao {
	
	public int insertEmployee(Employee emp);
	public Employee getEmployee(int id);
	public List<Employee> getAllEmployee();
	public void deleteEmployee(Employee e);
	public void updateEmployee(Employee e);

}
