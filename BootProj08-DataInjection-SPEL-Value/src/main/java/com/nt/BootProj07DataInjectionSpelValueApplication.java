package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Outfit;
import com.nt.sbeans.StyleBazar;

@SpringBootApplication
public class BootProj07DataInjectionSpelValueApplication {

	public static void main(String[] args) {
		//Getting the IOC container
		ApplicationContext ctx = SpringApplication.run(BootProj07DataInjectionSpelValueApplication.class, args);
		//Getting the object of the Outfit class
		Outfit outfiit = ctx.getBean("of", Outfit.class);
		//Printing all the outfit class properties value
		System.out.println(outfiit);
		
		//Getting the object of the StyleBazar class
		StyleBazar bazar = ctx.getBean("sb", StyleBazar.class);
		//Printing the StyleBazar class properties
		System.out.println(bazar);
		
		//Closing the IOC container
		((ConfigurableApplicationContext) ctx).close();
	}

}
