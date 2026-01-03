package com.nt.service;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeService {
	public List<Employee> fetchEmployee(String add1, String add2) throws Exception;
}
