package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Mobile;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootProj04DependencyInjectionSimLooseCouplingApplication {

	public static void main(String[] args) {
		try(ConfigurableApplicationContext ctx =  SpringApplication.run(BootProj04DependencyInjectionSimLooseCouplingApplication.class, args);){
			//Getting the target class object
			Mobile mobile = ctx.getBean("mobile", Mobile.class);
			//Invoking the business methods
			mobile.rechargePackage();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
