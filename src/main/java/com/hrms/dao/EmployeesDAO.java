package com.hrms.dao;

import com.hrms.model.Employees;

public interface EmployeesDAO {
	public Employees getEmployeeById(int id);
	public Employees validateUser(int Id,String firstName);
}
