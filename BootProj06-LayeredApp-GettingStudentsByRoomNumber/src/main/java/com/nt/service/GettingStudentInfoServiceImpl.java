package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.IGettingStudentInfoDAO;
import com.nt.model.Student;

@Service("student-service")
public class GettingStudentInfoServiceImpl implements IGettingStudentInfoService {
	//HAS-A property
	@Autowired
	private IGettingStudentInfoDAO studentDAO;
	
	//Non parameterized Constructor
	public GettingStudentInfoServiceImpl() {
		System.out.println("GettingStudentInfoServiceImpl: 0-param constructor");
	}
	
	@Override
	public List<Student> gettingDetails(Integer roomNo) throws Exception {
		List<Student> list = studentDAO.gettingDetails(roomNo);
		return list;
	}

}
