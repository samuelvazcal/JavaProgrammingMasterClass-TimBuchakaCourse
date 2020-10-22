package com.samuelvazquez;

public class Car {
	private String name;
	private int wheels;
	private int cylinders;
	private boolean engine;

	public Car(String name, int cylinders) {
		this.name = name;
		this.cylinders = cylinders;
		this.wheels = 4;
		this.engine = true;
	}

	public String startEngine() {
		return "Starting engine...";
	}

	public String accelerate() {
		return "Accelerating";
	}

	public String brake() {
		return "Brake activated...";
	}

	public String getName() {
		return name;
	}

	public int getWheels() {
		return wheels;
	}

	public int getCylinders() {
		return cylinders;
	}

	public boolean isEngine() {
		return engine;
	}
}
