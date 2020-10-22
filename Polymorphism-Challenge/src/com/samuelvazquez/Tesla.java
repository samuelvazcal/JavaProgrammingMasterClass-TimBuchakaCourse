package com.samuelvazquez;

public class Tesla extends Car {
	private double batteryCapacity;

	public Tesla(String name, int cylinders, double batteryCapacity) {
		super(name, cylinders);
		this.batteryCapacity = batteryCapacity;
	}

	@Override
	public String startEngine() {
		return "You are starting the Tesla's engine";
	}

	@Override
	public String accelerate() {
		return "You are accelerating the Tesla!";
	}

	@Override
	public String brake() {
		return "You are activating the Tesla's brake";
	}
}
