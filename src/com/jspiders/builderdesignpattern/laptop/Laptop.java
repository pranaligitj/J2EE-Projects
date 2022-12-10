package com.jspiders.builderdesignpattern.laptop;

public class Laptop {
	private String brand;
	private String model;
	private String color;
	private double price;
	private int ram;
	private String processor;
	private int memory;
	private int hard_drive;
	private int graphics_card;
	
	
	public Laptop(String brand, String model, String color, double price, int ram, String processor, int memory,
			int hard_drive, int graphics_card) {
		super();
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.price = price;
		this.ram = ram;
		this.processor = processor;
		this.memory = memory;
		this.hard_drive = hard_drive;
		this.graphics_card = graphics_card;
	}


	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", model=" + model + ","
				+ "color=" + color + ", price=" + price + ", ram=" + ram
				+ ", processor=" + processor + ", memory="
				+ memory + ",hard_drive=" + hard_drive + ", graphics_card="
				+ graphics_card + "]";
	}
	
}
