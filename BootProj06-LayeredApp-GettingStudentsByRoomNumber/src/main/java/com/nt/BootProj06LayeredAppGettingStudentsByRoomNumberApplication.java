package com.nt;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nt.controller.GettingStudentInfoController;
import com.nt.model.Student;

@SpringBootApplication
public class BootProj06LayeredAppGettingStudentsByRoomNumberApplication {

	//Non parameterized Constructor
	public BootProj06LayeredAppGettingStudentsByRoomNumberApplication() {
		System.out.println(
				"BootProj06LayeredAppGettingStudentsByRoomNumberApplication: 0-param contructor");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Getting the IOC container
		ApplicationContext ctx = SpringApplication.run(BootProj06LayeredAppGettingStudentsByRoomNumberApplication.class, args);
		
		//selecting the Room Number
		System.out.println("Enter the Room Number : ");
		Integer roomNo = sc.nextInt();
		sc.close();  //Closed the scanner
		
		//Getting the target class object
		GettingStudentInfoController controller = ctx.getBean("student-controller", GettingStudentInfoController.class);
		//Invoking the method
		try{
			List<Student> list = controller.gettingDetails(roomNo);
			list.forEach(st->{
				System.out.println(st);		
			});
		} //try
		catch(Exception e) {
			e.printStackTrace();
		} //catch
	} //main

} //class
