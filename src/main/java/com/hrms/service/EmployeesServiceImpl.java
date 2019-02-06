package com.hrms.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hrms.dao.EmployeesDAO;
import com.hrms.model.Employees;

@Service
public class EmployeesServiceImpl implements EmployeesService{


	@Autowired
	EmployeesDAO employeesDAO;
	public void setEmployeesDAO(EmployeesDAO employeesDAO) {
		this.employeesDAO = employeesDAO;
	}
	public EmployeesServiceImpl() {
		// TODO Auto-generated constructor stub
	}


	@Transactional
	public Employees getEmployeeById(int id) {
		return employeesDAO.getEmployeeById(id);

	}
	@Override
	@Transactional
	public Employees validateUser(int Id, String firstName) {
		// TODO Auto-generated method stub
		System.out.println("service  :::  "+Id+"   "+firstName);
		Employees emp=employeesDAO.validateUser(Id, firstName);
		return emp;
	}


}
