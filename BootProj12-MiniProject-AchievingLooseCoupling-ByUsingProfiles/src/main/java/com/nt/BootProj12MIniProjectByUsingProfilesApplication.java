package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.commons.Friend;
import com.nt.controller.FriendController;

@SpringBootApplication
public class BootProj12MIniProjectByUsingProfilesApplication {

	public static void main(String[] args) {
		//Getting IOC container and used try with resource for auto closing 
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootProj12MIniProjectByUsingProfilesApplication.class, args)){
			//Getting the object of the controller class
			FriendController controller = ctx.getBean("friend-controller", FriendController.class);
			//Getting the List of Friend 
			List<Friend> list = controller.getFriendDetails(318);
			//Printing all the friend details
			System.out.println(list);
		} // try
		catch(Exception e) {     //Handling the exception
			e.printStackTrace();
		} //catch
		
	} //main

} //class
