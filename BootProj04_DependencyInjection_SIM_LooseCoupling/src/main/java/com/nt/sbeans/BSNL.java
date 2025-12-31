package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("bsnl")
public class BSNL implements ISIM {

	//Constructor
	public BSNL() {
		System.out.println("BSNL: 0-param constructor");
	}
	
	@Override
	public void plan() {
		int monthly = 299;
		int yearly = 3500;
		System.out.println("The Monthly plan for BSNL is : "+monthly);
		System.out.println("The Yearly plan for BSNL is : "+yearly);
	}

}
