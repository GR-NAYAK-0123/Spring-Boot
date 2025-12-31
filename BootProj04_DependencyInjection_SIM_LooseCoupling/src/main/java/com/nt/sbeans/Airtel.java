package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("airtel")
public class Airtel implements ISIM {

	//Constructor
	public Airtel() {
		System.out.println("Airtel: 0-param constructor");
	}
	
	@Override
	public void plan() {
		int monthly = 399;
		int yearly = 4500;
		System.out.println("The Monthly plan for Airtel is : "+monthly);
		System.out.println("The Yearly plan for Airtel is : "+yearly);
	}

}
