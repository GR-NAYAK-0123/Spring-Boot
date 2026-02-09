package com.nt.dao;

import java.util.List;

import com.nt.commons.Friend;

public interface IFriendDAO {
	public List<Friend> getFriendDetails(Integer roomNo) throws Exception;
}

