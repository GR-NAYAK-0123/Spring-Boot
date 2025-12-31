package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.IEmployeeService;

@Controller("employee-controller")
public class EmployeeController {
	//HAS-A property
	@Autowired
	private IEmployeeService empService;
	
	public List<Employee> recieveEmployeeDetails(String add1, String add2) throws Exception {
		List<Employee> list = empService.fetchEmployee(add1, add2);
		return list;
	}
}
