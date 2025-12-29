package com.nt;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.WishMessageGenerator;

@SpringBootApplication
public class BootProj01FirstAppDependencyInjectionApplication {
	
	@Bean("ldt")
	public LocalDateTime getLDT() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		//Getting the IOC container from the "run" method
		ApplicationContext ctx = SpringApplication.run(BootProj01FirstAppDependencyInjectionApplication.class, args);
		//Getting the target class Object
		WishMessageGenerator generator = ctx.getBean("wmg", WishMessageGenerator.class);
		//Invoking the Business method
		String result = generator.getMessage("Raja");
		//Printing the message
		System.out.println("WishMessage : "+result);
		
		//Close the container
		((ConfigurableApplicationContext) ctx).close();
	}

}
