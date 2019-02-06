package com.hrms.service;

import com.hrms.model.DepartmentManager;

public interface ManagerLoginService {
	
	public DepartmentManager validateUser(int uname,String password);

}
