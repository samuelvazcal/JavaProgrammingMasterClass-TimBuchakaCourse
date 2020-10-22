package com.samuelvazquez;

public class Lamborghini extends Car {

	public Lamborghini(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public String startEngine() {
		return "You are starting the Lamborghini's engine";
	}

	@Override
	public String accelerate() {
		return "You are accelerating the lamborghini!";
	}

	@Override
	public String brake() {
		return "You are activating the Lambo's brake";
	}
}
