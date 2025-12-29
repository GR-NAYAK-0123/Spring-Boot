package com.nt.sbeans;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("diesel")
@Lazy
public class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("DieselEngine : 0-Param constructor");
	}
	
	@Override
	public void start(String startingPoint) {
		System.out.println("DieselEngine.start()");
	}

	@Override
	public void end(String endPoint) {
		System.out.println("DieselEngine.end()");
	}

}
