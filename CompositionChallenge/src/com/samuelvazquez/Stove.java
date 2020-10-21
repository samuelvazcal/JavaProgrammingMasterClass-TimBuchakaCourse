package com.samuelvazquez;

public class Stove {
	private int burners;
	private double wight;
	private String brand;

	public Stove(int burners, double wight, String brand) {
		this.burners = burners;
		this.wight = wight;
		this.brand = brand;
	}

	public void flameLevel(int level, int burner) {
		System.out.println("Flame level is " + level + " in burner " + burner);
	}

	public int getBurners() {
		return burners;
	}

	public double getWight() {
		return wight;
	}

	public String getBrand() {
		return brand;
	}
}
