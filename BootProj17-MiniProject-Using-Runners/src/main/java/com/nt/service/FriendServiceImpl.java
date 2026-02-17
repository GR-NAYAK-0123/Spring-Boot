package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.commons.Friend;
import com.nt.dao.IFriendDAO;

@Service("friend-service")
public class FriendServiceImpl implements IFriendService {
	@Autowired
	private IFriendDAO friendDAO;
	
	public FriendServiceImpl() {
		System.out.println("FriendServiceImpl: 0-Param constructor");
	}
	
	@Override
	public List<Friend> getFriendDetails(Integer roomNo) throws Exception {
		//Calling the data access object class method by using his class object
		List<Friend> list = friendDAO.getFriendDetails(roomNo);
		return list;
	}

}
