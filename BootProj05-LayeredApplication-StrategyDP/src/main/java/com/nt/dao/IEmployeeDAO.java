package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface IEmployeeDAO {
	public List<Employee> getEmployeeDetails(String add1, String add2) throws Exception;
}
