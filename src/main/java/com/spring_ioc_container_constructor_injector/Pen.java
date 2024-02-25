package com.spring_ioc_container_constructor_injector;

public class Pen {

	private String color;
	private String brand;
	private String price;
	public Pen(String color, String brand, String price) {
	
		this.color = color;
		this.brand = brand;
		this.price = price;
	}
	
	public void getPenDetails() {
		System.out.println(color);
		System.out.println(brand);
		System.out.println(price);
	}
	
}
