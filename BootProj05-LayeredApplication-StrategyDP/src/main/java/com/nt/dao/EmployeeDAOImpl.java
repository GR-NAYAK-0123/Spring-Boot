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

import com.nt.model.Employee;

@Repository("employee-dao")
public class EmployeeDAOImpl implements IEmployeeDAO {
	//Query for getting the employee details
	private static final String GET_EMP_BY_ADD = "SELECT EID,EFNAME,ELNAME,ESAL,EADDRESS "
			                                                                                                + "FROM EMPLOYEE WHERE EADDRESS IN (?,?) ORDER BY EADDRESS";
	
	//HAS-A Property
	@Autowired
	private DataSource ds;
	
	@Override
	public List<Employee> getEmployeeDetails(String add1, String add2) throws Exception {
		List<Employee> list = null;
		try(Connection con = ds.getConnection();
				          PreparedStatement pstm = con.prepareStatement(GET_EMP_BY_ADD)){
			pstm.setString(1, add1);
			pstm.setString(2, add2);
			
			try(ResultSet rs = pstm.executeQuery()){
				list = new ArrayList<Employee>();
				while(rs.next()) {
					Employee emp = new Employee();
					emp.setEid(rs.getInt(1));
					emp.setFirstName(rs.getString(2));
					emp.setLastName(rs.getString(3));
					emp.setSalary(rs.getDouble(4));
					emp.setAddress(rs.getString(5));
					list.add(emp);
				}
			} // try1
		} //try2
		catch(SQLException se) {
			se.printStackTrace();
			throw se;
		}
		catch(Exception e) {
			e.printStackTrace();
			throw e;
		}
		return list;
	}

}
