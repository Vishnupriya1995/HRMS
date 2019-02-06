package com.hrms.dao;

import com.hrms.model.*;

public interface ManagerLoginDAO {

	public DepartmentManager validateUser(int uname,String password);
}
