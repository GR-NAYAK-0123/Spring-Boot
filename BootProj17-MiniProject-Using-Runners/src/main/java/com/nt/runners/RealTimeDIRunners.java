package com.nt.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.commons.Friend;
import com.nt.controller.FriendController;

@Component
public class RealTimeDIRunners implements CommandLineRunner {
	@Autowired
	private FriendController controller;
	
	@Override
	public void run(String... args) throws Exception {
		
		try {
		//Invoking the business method of the controller class
		List<Friend> list = controller.getFriendDetails(Integer.parseInt(args[0]));
		//Printing the list to get the details of the friends
		System.out.println(list);
		} //try
		catch(Exception e) {
			e.printStackTrace();
		}//catch
		
	} //run method

} //Runner class 
