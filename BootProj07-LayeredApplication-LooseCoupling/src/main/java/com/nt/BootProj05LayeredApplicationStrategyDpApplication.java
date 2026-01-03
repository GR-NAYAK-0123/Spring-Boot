package com.nt;

import com.nt.controller.EmployeeController;
import com.nt.model.Employee;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootProj05LayeredApplicationStrategyDpApplication {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(BootProj05LayeredApplicationStrategyDpApplication.class, args);
		//Getting Controller class object
		EmployeeController controller = ctx.getBean("employee-controller", EmployeeController.class);
		//Invoking the method
		try {
			List<Employee> list = controller.recieveEmployeeDetails("Dublin", "Dagestan");
			list.forEach(emp->{
				System.out.println(emp);		
			});
		} //try
		catch(Exception e) {
			e.printStackTrace();
		} //catch
		
		//close the container
		((ConfigurableApplicationContext) ctx).close();
	} //main

} //class
