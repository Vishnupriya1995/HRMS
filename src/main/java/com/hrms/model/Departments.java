package com.hrms.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 * @author vishnupriya
 *
 */
/*
 * CREATE TABLE departments (
    dept_no     CHAR(4)         NOT NULL,
    dept_name   VARCHAR(40)     NOT NULL,
    PRIMARY KEY (dept_no),
    UNIQUE  KEY (dept_name)
);
 */
@Entity
@Table(name="departments")
public class Departments implements Serializable{
	@Id
	@Column(name="dept_no",nullable=false,length=4)
	private String deptNo;
	
	@Column(name="dept_name",unique=true,nullable=false,length=40)
	private String deptName;
	
	public Departments(){
		
	}
	
	public Departments(String deptNo, String deptName) {
		super();
		this.deptNo = deptNo;
		this.deptName = deptName;
	}

	public String getDeptNo() {
		return deptNo;
	}

	public void setDeptNo(String deptNo) {
		this.deptNo = deptNo;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	

}
