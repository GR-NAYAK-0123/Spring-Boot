package com.nt.dao;

import java.util.List;

import com.nt.model.Student;

public interface IGettingStudentInfoDAO {
	public List<Student> gettingDetails(Integer roomNo) throws Exception;
}
