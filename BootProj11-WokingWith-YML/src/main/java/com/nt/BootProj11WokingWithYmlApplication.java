package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Company;

@SpringBootApplication
public class BootProj11WokingWithYmlApplication {

	public static void main(String[] args) {
		//Getting the IOC container
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj11WokingWithYmlApplication.class, args);
		//Getting the target class object
		Company comp = ctx.getBean("cmp", Company.class);
		//Printing all the properties
		System.out.println(comp);
		
		//Closing the container
		ctx.close();
	}

}
