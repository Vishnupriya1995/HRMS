package com.hrms.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.hrms.model.DepartmentManager;
import com.hrms.model.Employees;
import com.hrms.service.EmployeesService;
import com.hrms.service.ManagerLoginService;

@Controller
@RequestMapping("/")

public class LoginController {
	@Autowired
	EmployeesService employeesService;
	
	public void setEmployeesService(EmployeesService employeesService) {
		this.employeesService = employeesService;
	}

	public LoginController(){
		System.out.println("====================================");
	}

	@RequestMapping("login")
	public String loginHr(Model model){
		Employees emp=new Employees();
		System.out.println(emp);
		model.addAttribute("Employee",emp);
		//modelAndView.addObject("DepartmentManager", new DepartmentManager());
		return "loginpage";
	}

	@RequestMapping("validate")
	private String method(@Valid @ModelAttribute("Employee") Employees emp, BindingResult result) {
		// TODO Auto-generated method stub
		boolean status=true;
		if(emp.getEmpNo()==null){
			result.rejectValue("empNo", "error.empNo", "Enter User Name");
			status=false;
		}
		if(emp.getFirstName()==null){
			result.rejectValue("firstName", "error.firstName", "Enter Password");
			status=false;
		}
		else{
			Employees validEmp= employeesService.validateUser(emp.getEmpNo(), emp.getFirstName());
			if(validEmp != null){
				if(!emp.getFirstName().equals(validEmp.getFirstName())){
					result.rejectValue("firstName", "error.firstName", "PassWord InCorrect");
					status=false;
				}
				
			}else{
				result.rejectValue("empNo", "error.empNo", "User Doesont Existed");
				status=false;
			}
		}
		
		System.out.println(status);
		if(status){
			System.out.println("file11111111111111111111111111");
			return "NewFile";
		}else{
			System.out.println("same========================");
			return "loginpage";
		}
		
		
		
		
	}



}
