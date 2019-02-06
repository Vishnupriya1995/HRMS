package com.hrms.model;
/**
 */

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
/*
 * CREATE TABLE dept_manager (
   emp_no       INT             NOT NULL,
   dept_no      CHAR(4)         NOT NULL,
   from_date    DATE            NOT NULL,
   to_date      DATE            NOT NULL,
   FOREIGN KEY (emp_no)  REFERENCES employees (emp_no)    ON DELETE CASCADE,
   FOREIGN KEY (dept_no) REFERENCES departments (dept_no) ON DELETE CASCADE,
   PRIMARY KEY (emp_no,dept_no)
); 
 */

@Entity
@Table(name="dept_manager")
public class DepartmentManager implements Serializable{
	
	@Id
	@OneToOne(cascade=CascadeType.REMOVE)
	@JoinColumn(name="emp_no",nullable=false)
	private Employees empNo;
	
	@Id
	@OneToOne(cascade=CascadeType.REMOVE)
	@JoinColumn(name="dept_no",nullable=false)
	private Departments deptNo;
	
	@Column(name="from_date",nullable=false)
	private Date fromDate;
	
	@Column(name="to_date",nullable=false)
	private Date toDate;
	
	public DepartmentManager() {
		super();
	}
	
	public DepartmentManager(Employees empNo, Departments deptNo, Date fromDate, Date toDate) {
		super();
		this.empNo = empNo;
		this.deptNo = deptNo;
		this.fromDate = fromDate;
		this.toDate = toDate;
	}

	public Employees getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Employees empNo) {
		this.empNo = empNo;
	}

	public Departments getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(Departments deptNo) {
		this.deptNo = deptNo;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

		
	
	
}
