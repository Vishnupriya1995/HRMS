package com.hrms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/*
 * CREATE TABLE salaries (
    emp_no      INT             NOT NULL,
    salary      INT             NOT NULL,
    from_date   DATE            NOT NULL,
    to_date     DATE            NOT NULL,
    # FOREIGN KEY (emp_no) REFERENCES employees (emp_no) ON DELETE CASCADE,
    PRIMARY KEY (emp_no, from_date)
); 
 */
public class Salaries implements Serializable{
	
	@Id
	@OneToOne(cascade=CascadeType.REMOVE)
	@JoinColumn(name="emp_no",nullable=false)
	private Employees empNo;
	
	@Column(name="salary",nullable=false)
	private int salary;
	
	@Id
	@Column(name="from_date",nullable=false)
	private Date fromDate;
	
	@Column(name="to_date",nullable=false)
	private Date toDate;

	public Salaries() {
		// TODO Auto-generated constructor stub
	}

	public Employees getEmpNo() {
		return empNo;
	}

	public void setEmpNo(Employees empNo) {
		this.empNo = empNo;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
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
