package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("petrol")
public class PetrolEngine implements IEngine {

	public PetrolEngine() {
		System.out.println("PetrolEngine : 0-Param constructor");
	}
	
	@Override
	public void start(String startingPoint) {
		System.out.println("PetrolEngine.start()");
	}

	@Override
	public void end(String endPoint) {
		System.out.println("PetrolEngine.end()");
	}

}
