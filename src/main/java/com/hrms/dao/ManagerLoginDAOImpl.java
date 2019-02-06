package com.hrms.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hrms.model.DepartmentManager;
@Repository
public class ManagerLoginDAOImpl implements ManagerLoginDAO{
	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public DepartmentManager validateUser(int uname, String password) {
		Session session = sessionFactory.getCurrentSession();
		Criteria criteria = session.createCriteria(DepartmentManager.class);
		criteria.add(Restrictions.eq("empNO", uname));
		criteria.add(Restrictions.eq("deptNO", password));
		DepartmentManager employee = (DepartmentManager) criteria.uniqueResult();
		System.out.println("department Id for login User"+employee.getEmpNo());
		return employee;
	}

}
