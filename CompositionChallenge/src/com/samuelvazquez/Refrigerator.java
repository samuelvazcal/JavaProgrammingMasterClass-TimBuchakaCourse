package com.samuelvazquez;

public class Refrigerator {
	private int doors;
	private double height;
	private String brand;

	public Refrigerator(int doors, double height, String brand) {
		this.doors = doors;
		this.height = height;
		this.brand = brand;
	}

	public void coolLevel(int level) {
		System.out.println("Cool level is: " + level);
	}

	public int getDoors() {
		return doors;
	}

	public double getHeight() {
		return height;
	}

	public String getBrand() {
		return brand;
	}
}
