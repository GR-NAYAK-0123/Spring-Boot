package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.nt.commons.Friend;

@Repository("mysql-dao")
@Profile({"dev","test","default"})
public class MySqlFriendDAOImpl implements IFriendDAO {
	//Query for getting the details of the students according to the room number
		private final static String GET_FRIEND_DETAILS="SELECT * FROM PULASTYA WHERE ROOMNO IN (?) ORDER BY ROLLNO";
		
		//Injecting the data source object
		@Autowired
		private DataSource ds;
		
		public MySqlFriendDAOImpl() {
			System.out.println("MySqlFriendDAOImpl : 0-Param constructor");
		}
		
		@Override
		public List<Friend> getFriendDetails(Integer roomNo) throws Exception {
			//Declaring the List
			List<Friend> list;
			//Getting the connection to the connection pool by using the Data source object
			try(Connection con=ds.getConnection();
					                         PreparedStatement pstm = con.prepareStatement(GET_FRIEND_DETAILS)){
				//Setting the value for the statement
				pstm.setInt(1, roomNo);
				
				//Getting the data from the database through result set
				try(ResultSet rs = pstm.executeQuery()){
					//Initialized the list
					list = new ArrayList<Friend>();
					//Traversing the result set and add all the value to the Java bean object that is Friend
					while(rs.next()) {
						Friend friend = new Friend();
						friend.setRollNo(rs.getInt(1));
						friend.setName(rs.getString(2));
						friend.setRoomNo(rs.getInt(3));
						friend.setBranch(rs.getString(4));
						// Adding that java bean object to the list
						list.add(friend);
					}
				} // 2nd try
			} // 1st try
			catch(Exception e) {
				e.printStackTrace();
				throw e;
			} // catch block
			//Returning the list
			return list;
		}

}
