package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.nt.dao.IEmployeeDAO;
import com.nt.model.Employee;

@Service("employee-service")
public class EmployeeServiceImpl implements IEmployeeService {
	//HAS-A property
	@Autowired
	@Qualifier("db")
	private IEmployeeDAO empDAO;
	
	@Override
	public List<Employee> fetchEmployee(String add1, String add2) throws Exception {
		List<Employee> list = empDAO.getEmployeeDetails(add1, add2);
		return list;
	}

}
