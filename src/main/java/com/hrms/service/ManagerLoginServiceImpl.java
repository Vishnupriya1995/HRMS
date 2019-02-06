package com.hrms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.hrms.dao.ManagerLoginDAO;
import com.hrms.model.DepartmentManager;

@Service
public class ManagerLoginServiceImpl implements ManagerLoginService{

	@Autowired
	private ManagerLoginDAO managerLoginDAO;
	
	public ManagerLoginServiceImpl(){
		// TODO Auto-generated constructor stub
	}

	public DepartmentManager validateUser(int uname, String password) {
		// TODO Auto-generated method stub
		System.out.println("serviceImpl:::"+uname+""+password);
		 DepartmentManager employee = managerLoginDAO.validateUser(uname, password);
		return employee;
	}

	public ManagerLoginDAO getManagerLoginDAO() {
		return managerLoginDAO;
	}

	public void setManagerLoginDAO(ManagerLoginDAO managerLoginDAO) {
		this.managerLoginDAO = managerLoginDAO;
	}

	
	

}
