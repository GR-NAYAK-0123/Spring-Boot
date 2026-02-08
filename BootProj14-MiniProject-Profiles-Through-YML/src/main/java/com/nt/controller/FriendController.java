package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.commons.Friend;
import com.nt.service.IFriendService;

@Controller("friend-controller")
public class FriendController {
	@Autowired
	private IFriendService friendService;
	
	public FriendController() {
		System.out.println("FriendController: 0-Param constructor");
	}
	
	public List<Friend> getFriendDetails(Integer roomNo) throws Exception {
		//Calling the method of service class by using his object
		List<Friend> list = friendService.getFriendDetails(roomNo);
		return list;
	}
}
