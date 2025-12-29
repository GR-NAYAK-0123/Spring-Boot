package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	//HAS-A property
	@Autowired
	@Qualifier("electric")
	private IEngine engine;
	
	public Vehicle() {
		System.out.println("Vehicle : 0-Param constructor");
	}
	
	public void startVehicle(String start, String end) {
		//Calling the start method by using HAS-A property
		engine.start(start);
		System.out.println("Vehicle is strated from : "+start);
		
		System.out.println("Vehicle Arrived at : "+end);
		//Calling the end method by using HAS-A property
		engine.end(end);
	}
}
