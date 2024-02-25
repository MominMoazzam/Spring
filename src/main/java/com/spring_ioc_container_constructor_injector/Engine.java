package com.spring_ioc_container_constructor_injector;

public class Engine {

	private String eName;
	private String ecc;
	
	public Engine(String eName, String ecc) {
		
		this.eName = eName;
		this.ecc = ecc;
	}

	@Override
	public String toString() {
		return "Engine [eName=" + eName + ", ecc=" + ecc + "]";
	}
	
	public void getEngineDetails() {
		System.out.println(eName);
		System.out.println(ecc);
		
	}
	
	
}
