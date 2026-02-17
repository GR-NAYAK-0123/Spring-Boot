package com.nt.service;

import java.util.List;

import com.nt.commons.Friend;

public interface IFriendService {
	public List<Friend> getFriendDetails(Integer roomNo) throws Exception;
}
