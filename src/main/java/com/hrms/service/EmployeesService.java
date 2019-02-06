package com.hrms.service;

import com.hrms.dao.EmployeesDAO;
import com.hrms.model.Employees;

public interface EmployeesService {
	public Employees getEmployeeById(int id);
	public Employees validateUser(int Id,String firstName);
}
