package com.samuelvazquez;

public class Refrigerator {
	private int doors;
	private String brand;
	private Dimensions dimensions;

	public Refrigerator(int doors, String brand, Dimensions dimensions) {
		this.doors = doors;
		this.brand = brand;
		this.dimensions = dimensions;
	}

	public void coolLevel(int level) {
		System.out.println("Cool level is: " + level);
	}

	public int getDoors() {
		return doors;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}

	public String getBrand() {
		return brand;
	}
}
