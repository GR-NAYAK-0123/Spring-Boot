package com.nt;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.commons.Friend;
import com.nt.controller.FriendController;

@SpringBootApplication
public class BootProj12MIniProjectByUsingProfilesApplication {

	@Autowired
	private Environment env;
	
	@Bean("c3p0")
	@Profile("test")
	public DataSource getc3p0() throws Exception{
		ComboPooledDataSource c3p0 = new ComboPooledDataSource();
		c3p0.setDriverClass(env.getRequiredProperty("spring.datasource.driver-class-name"));
		c3p0.setJdbcUrl(env.getRequiredProperty("spring.datasource.url"));
		c3p0.setUser(env.getRequiredProperty("spring.datasource.username"));
		c3p0.setPassword(env.getRequiredProperty("spring.datasource.password"));
		c3p0.setMinPoolSize(Integer.parseInt(env.getRequiredProperty("c3P0.minSize")));
		c3p0.setMaxPoolSize(Integer.parseInt(env.getRequiredProperty("c3P0.maxSize")));
		return c3p0;
	}
	public static void main(String[] args) {
		//Getting IOC container and used try with resource for auto closing 
		try(ConfigurableApplicationContext ctx = SpringApplication.run(BootProj12MIniProjectByUsingProfilesApplication.class, args)){
			//Getting the object of the controller class
			FriendController controller = ctx.getBean("friend-controller", FriendController.class);
			//Getting the List of Friend 
			List<Friend> list = controller.getFriendDetails(323);
			//Printing all the friend details
			System.out.println(list);
		} // try
		catch(Exception e) {     //Handling the exception
			e.printStackTrace();
		} //catch
		
	} //main

} //class
