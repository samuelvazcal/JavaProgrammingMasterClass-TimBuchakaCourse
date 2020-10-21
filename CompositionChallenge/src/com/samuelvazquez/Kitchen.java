package com.samuelvazquez;

public class Kitchen {
	private Refrigerator theRefrigerator;
	private Stove theStove;

	public Kitchen(Refrigerator theRefrigerator, Stove theStove) {
		this.theRefrigerator = theRefrigerator;
		this.theStove = theStove;
	}

	public void stoveState() {
		theStove.flameLevel(5,2);
		gasSensor();
	}

	private void gasSensor() {
		System.out.println("Sensor: ON");
	}

	public void statusCooler() {
		getTheRefrigerator().coolLevel(4);
	}

	public Refrigerator getTheRefrigerator() {
		return theRefrigerator;
	}

	public Stove getTheStove() {
		return theStove;
	}
}
