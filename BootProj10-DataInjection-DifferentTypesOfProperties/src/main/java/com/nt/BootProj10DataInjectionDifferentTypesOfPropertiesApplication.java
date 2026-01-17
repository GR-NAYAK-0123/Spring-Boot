package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Company;

@SpringBootApplication
public class BootProj10DataInjectionDifferentTypesOfPropertiesApplication {

	public static void main(String[] args) {
		//Getting the IOC container
		ApplicationContext ctx =  SpringApplication.run(BootProj10DataInjectionDifferentTypesOfPropertiesApplication.class, args);
		//Getting the Company class object
		Company company = ctx.getBean("cmp", Company.class);
		//Printing the properties of the company class
		System.out.println(company);
		
		//Closing the Container
		((ConfigurableApplicationContext) ctx).close();
	}

}
