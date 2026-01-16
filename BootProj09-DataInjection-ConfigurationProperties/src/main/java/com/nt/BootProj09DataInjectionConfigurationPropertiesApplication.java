package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.nt.sbeans.Company;

@SpringBootApplication
@PropertySource("com/nt/commons/Info.properties")
public class BootProj09DataInjectionConfigurationPropertiesApplication {

	public static void main(String[] args) {
		//Getting the IOC container
		ApplicationContext ctx = SpringApplication.run(BootProj09DataInjectionConfigurationPropertiesApplication.class, args);
		//Getting the object of the Company class
		Company company = ctx.getBean("cmp", Company.class);
		//Printing the properties of the company class
		System.out.println(company);
		
		//Closing the container
		((ConfigurableApplicationContext) ctx).close();
	}

}
