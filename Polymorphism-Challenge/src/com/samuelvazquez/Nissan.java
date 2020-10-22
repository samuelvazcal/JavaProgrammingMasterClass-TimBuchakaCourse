package com.samuelvazquez;

public class Nissan extends Car {

	public Nissan(String name, int cylinders) {
		super(name, cylinders);
	}

	@Override
	public String startEngine() {
		return getClass().getSimpleName() + ", starting engine";
	}

	@Override
	public String accelerate() {
		return getClass().getSimpleName() + ", accelerating!";
	}

	@Override
	public String brake() {
		return getClass().getSimpleName() + ", activating its brake";
	}
}
