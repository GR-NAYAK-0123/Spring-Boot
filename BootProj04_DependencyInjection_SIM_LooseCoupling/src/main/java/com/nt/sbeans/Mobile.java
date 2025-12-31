package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mobile")
public class Mobile {
	//HAS-A Property
	@Autowired
	@Qualifier("sim")
	private ISIM sim;
	
	//Constructor
	public Mobile() {
		System.out.println("Mobile: 0-param constructor");
	}
	
	//Business method
	public void rechargePackage() {
		sim.plan();
	}
}
