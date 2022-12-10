package com.jspiders.builderdesignpattern.laptopmain;

import com.jspiders.builderdesignpattern.builderlaptop.LaptopBuilder;
import com.jspiders.builderdesignpattern.laptop.Laptop;

public class LaptopMain {
	public static void main(String[] args) {
		Laptop laptop=new LaptopBuilder().brand("Intel").ram(8)
				.price(85000.00).getLaptop();
		System.out.println(laptop);
	}
}
