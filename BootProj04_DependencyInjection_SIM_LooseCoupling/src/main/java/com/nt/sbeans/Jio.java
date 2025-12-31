package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements ISIM {

	//Constructor
	public Jio() {
		System.out.println("Jio: 0-param constructor");
	}
	
	@Override
	public void plan() {
		int monthly = 329;
		int yearly = 3700;
		System.out.println("The Monthly plan for Jio is : "+monthly);
		System.out.println("The Yearly plan for Jio is : "+yearly);
	}

}
