package com.hrms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.validator.constraints.NotEmpty;
/*
CREATE TABLE employees (
    emp_no      INT             NOT NULL,
    birth_date  DATE            NOT NULL,
    first_name  VARCHAR(14)     NOT NULL,
    last_name   VARCHAR(16)     NOT NULL,
    gender      ENUM ('M','F')  NOT NULL,    
    hire_date   DATE            NOT NULL,
    PRIMARY KEY (emp_no)
);

 */
@Entity
@Table(name="employees")
public class Employees implements Serializable{
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_no",nullable=false)
	private Integer empNo;
	/**
	 * 
	 */
	
	@Column(name="birth_date",nullable=false)
	private Date birthDate;
	/**
	 * 
	 */
	@Column(name="first_name",nullable=false)
	@NotEmpty(message="provide password")
	private String firstName;
	/**
	 * 
	 */
	@Column(name="last_name",nullable=false)
	private String lastName;
	/**
	 * 
	 */
	@Column(name="gender",nullable=false)
	@Enumerated(EnumType.STRING)
	private Gender gender;
	/**
	 * 
	 */
	@Column(name="hire_date",nullable=false)
	private Date hireDate;
	
	public Employees(){
		
	}
	
	
	/**
	 * 
	 * @return
	 */
	public Integer getEmpNo() {
		return empNo;
	}
	/**
	 * 
	 * @param empNo
	 */
	public void setEmpNo(Integer empNo) {
		this.empNo = empNo;
	}
	/**
	 * 
	 * @return
	 */
	public Date getBirthDate() {
		return birthDate;
	}
	/**
	 * 
	 * @param birthDate
	 */
	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	/**
	 * 
	 * @return
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * 
	 * @return
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * 
	 * @return
	 */
	public Gender getGender() {
		return gender;
	}
	/**
	 * 
	 * @param gender
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	/**
	 * 
	 * @return
	 */
	public Date getHireDate() {
		return hireDate;
	}
	/**
	 * 
	 * @param hireDate
	 */
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	@Override
	public String toString(){
		return "[empNo: "+this.empNo+" , firstName : "+this.firstName+" , last name : "+this.lastName+" , gender : "+this.gender+",birtdate : "+this.birthDate+"]";
		
	}

}

enum Gender{
	M, F	
}