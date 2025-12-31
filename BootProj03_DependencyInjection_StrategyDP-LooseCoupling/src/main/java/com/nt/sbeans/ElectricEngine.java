package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("electric")
@Lazy
public class ElectricEngine implements IEngine {

	public ElectricEngine() {
		System.out.println("ElectricEngine : 0-Param constructor");
	}
	
	@Override
	public void start(String startingPoint) {
		System.out.println("ElectricEngine.start()");
	}

	@Override
	public void end(String endPoint) {
		System.out.println("ElectricEngine.end()");
	}

}
