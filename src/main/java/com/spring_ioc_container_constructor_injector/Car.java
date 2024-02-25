package com.spring_ioc_container_constructor_injector;

public class Car {

	private String cColor;
	private String cName;
	private Engine engine;
	
	public Car(String cColor, String cName, Engine engine) {
		this.cColor = cColor;
		this.cName = cName;
		this.engine = engine;
	}
	
	public void getCarDetails() {
		System.out.println(cColor);
		System.out.println(cName);
	    engine.getEngineDetails();
	}
}
