package com.nt;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootProj02DependencyInjectionStrategyDpApplication {

	public static void main(String[] args) {
		//Gets the IOC container inside the try with resource
		try(ConfigurableApplicationContext ctx = 
				                               SpringApplication.run(BootProj02DependencyInjectionStrategyDpApplication.class, args);){
			
			//Getting the target class oject
			Vehicle vehicle = ctx.getBean("vehicle", Vehicle.class);
			//Invoking the business method
			vehicle.startVehicle("India", "Europe");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
