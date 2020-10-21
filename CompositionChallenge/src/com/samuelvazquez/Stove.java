package com.samuelvazquez;

public class Stove {
	private int burners;
	private String brand;
	private Dimensions dimensions;

	public Stove(int burners, String brand, Dimensions dimensions) {
		this.burners = burners;
		this.brand = brand;
		this.dimensions = dimensions;
	}

	public void flameLevel(int level, int burner) {
		System.out.println("Flame level is " + level + " in burner " + burner);
	}

	public int getBurners() {
		return burners;
	}

	public Dimensions getDimensions() {
		return dimensions;
	}

	public String getBrand() {
		return brand;
	}
}
