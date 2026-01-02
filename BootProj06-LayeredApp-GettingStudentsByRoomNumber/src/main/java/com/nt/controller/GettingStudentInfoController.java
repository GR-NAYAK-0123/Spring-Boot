package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Student;
import com.nt.service.IGettingStudentInfoService;

@Controller("student-controller")
public class GettingStudentInfoController {
	//HAS-A property
	@Autowired
	private IGettingStudentInfoService studentService;
	
	//Non parameterized Constructor
	public GettingStudentInfoController() {
		System.out.println("GettingStudentInfoController : 0-param constructor");
	}
	
	public List<Student> gettingDetails(Integer roomNo) throws Exception {
		List<Student> list = studentService.gettingDetails(roomNo);
		return list;
	}
}
