package com.spring_ioc_container_constructor_injector;

public class Mouse {

	private String color;
	private String name;
	private boolean isGaming;
	
	public Mouse(String color, String name, boolean isGaming) {
		this.color = color;
		this.name = name;
		this.isGaming = isGaming;
	}
	
	public void getMouseDetails() {
		System.out.println(color);
		System.out.println(name);
		System.out.println(isGaming);
	}
	
}
