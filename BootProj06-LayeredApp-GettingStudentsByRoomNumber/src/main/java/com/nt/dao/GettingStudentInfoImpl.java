package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nt.model.Student;

@Repository("student-dao")
public class GettingStudentInfoImpl implements IGettingStudentInfoDAO {
	//Query for getting the students Info from the room Number
	private static final String GET_STU_DETAILS = "SELECT ROLLNO,NAME,ROOMNO,BRANCH FROM PULASTYA "
			                                                                                                                           + "WHERE ROOMNO IN (?) ORDER BY ROLLNO";
	//HAS-A property
	@Autowired
	private DataSource ds;
	
	//Non-parameterized constructor
	public GettingStudentInfoImpl() {
		System.out.println("GettingStudentInfoImpl : 0-param constructor");
	}
	
	@Override
	public List<Student> gettingDetails(Integer roomNo) throws Exception {
		//Declaring the List
		List<Student> list = null;
		//Getting the connection object and Making prepared statement
		try(Connection con = ds.getConnection();
				               PreparedStatement pstm = con.prepareStatement(GET_STU_DETAILS)){
			//Setting the value to the query
			pstm.setInt(1, roomNo);
			//Getting the data through result set
			try(ResultSet rs = pstm.executeQuery()){
				list = new ArrayList<Student>();  //Initializing the Array list
				while(rs.next()) {
					Student st = new Student();   //Creating the student class object
					//Setting the value gathering from result set
					st.setRollNo(rs.getInt(1));
					st.setName(rs.getString(2));
					st.setRoomNo(rs.getInt(3));
					st.setBranch(rs.getString(4));
					//Added the student object to the list
					list.add(st);
				}
			} //try2
		} //try1
		catch(SQLException se) {          //Exception propagation
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {                   //Exception propagation
			e.printStackTrace();
			throw e;
		}
		return list;
	}

}
