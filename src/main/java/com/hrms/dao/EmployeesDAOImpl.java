package com.hrms.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hrms.model.DepartmentManager;
import com.hrms.model.Employees;

@Repository
public class EmployeesDAOImpl implements EmployeesDAO{

	public EmployeesDAOImpl() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory = sessionFactory;
	}
	
	 protected Session getSession() {
	        return sessionFactory.getCurrentSession();
	    }
	@Override
	public Employees getEmployeeById(int id) {
		Session session = this.sessionFactory.getCurrentSession();		
		Employees p = (Employees) session.load(Employees.class, new Integer(id));
		System.out.println("EmployeeVO loaded successfully, Person details="+p);
		return p;
	}

	@Override
	public Employees validateUser(int Id, String firstName) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		org.hibernate.Query query = session.createQuery("from Employees where emp_no = :id");
		query.setParameter("id", Id);
		Employees em = (Employees) query.uniqueResult();
		System.out.println("unique"+query.uniqueResult());
		return em;
	}

}
