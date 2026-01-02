package com.nt.service;

import java.util.List;

import com.nt.model.Student;

public interface IGettingStudentInfoService {
	public List<Student> gettingDetails(Integer roomNo) throws Exception;
}
