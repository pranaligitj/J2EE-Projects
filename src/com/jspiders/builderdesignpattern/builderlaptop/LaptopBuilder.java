package com.jspiders.builderdesignpattern.builderlaptop;

import com.jspiders.builderdesignpattern.laptop.Laptop;

public class LaptopBuilder {
	
	private String brand;
	private String model;
	private String color;
	private double price;
	private int ram;
	private String processor;
	private int memory;
	private int hard_drive;
	private int graphics_card;
	
	public LaptopBuilder brand(String brand) {
		this.brand=brand;
		return this;
	}
	
	public LaptopBuilder model(String model) {
		this.model=model;
		return this;
	}
	
	public LaptopBuilder color(String color) {
		this.color=color;
		return this;
	}
	
	public LaptopBuilder price(double price) {
		this.price=price;
		return this;
	}
	
	public LaptopBuilder ram(int ram) {
		this.ram=ram;
		return this;
	}
	
	public LaptopBuilder processor(String processor) {
		this.processor=processor;
		return this;
	}
	
	public LaptopBuilder memory(int memory) {
		this.memory=memory;
		return this;
	}
	
	public LaptopBuilder hard_drive(int hard_drive) {
		this.hard_drive=hard_drive;
		return this;
	}
	
	public LaptopBuilder graphics_card(int graphics_card) {
		this.graphics_card=graphics_card;
		return this;
	}
	public Laptop getLaptop() {
		Laptop laptop=new Laptop(this.brand, this.model,
		        this.color, this.price, this.ram, this.processor,
				this.memory, this.hard_drive, this.graphics_card);
				return laptop;
	}
	
}
