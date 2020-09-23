package com.samuelvazquez;

public class Fish extends Animal {

	private int gills;
	private int eyes;
	private int fins;

	public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
		super(name, 1, 1, size, weight);
		this.gills = gills;
		this.eyes = eyes;
		this.fins = fins;
	}

	private void rest() {

	}

	private void moveMuscles() {
		System.out.println("Moving muscles...");
	}

	private void moveBackFin() {
		System.out.println("Moving fin...");
	}

	private void swim(int speed) {
		moveMuscles();
		moveBackFin();
		super.move(speed);
	}

	@Override
	public void move(int speed) {
		System.out.println("Fish.move called");
		swim(3);
	}
}
