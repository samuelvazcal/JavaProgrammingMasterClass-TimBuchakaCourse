package com.samuelvazquez;

import java.util.ArrayList;


//base class
public class Gearbox {
	private ArrayList<Gear> gears;
	private int maxGears;
	private int currentGear = 0;
	private boolean isClutchIn;

	public Gearbox(int maxGears) {
		this.maxGears = maxGears;
		this.gears = new ArrayList<>();
		Gear neutral = new Gear(0,0.0);
		this.gears.add(neutral);
	}

	public void operateClutch(boolean in) {
		this.isClutchIn = in;
	}

	public void addGear(int number, double ratio) {
		if((number>0)&&(number <= maxGears)) {
			this.gears.add(new Gear(number,ratio));
		}
	}

	public void changeGear(int newGear) {
		if((newGear >= 0) && (newGear <this.gears.size()) && this.isClutchIn) {
			this.currentGear = newGear;
			System.out.println("Gear " + newGear + " selected.");
		} else {
			System.out.println("Grind!");
			this.currentGear = 0;
		}
	}

	public double wheelSpeed(int revs) {
		if(isClutchIn) {
			System.out.println("Scream!!!");
			return 0.0;
		}
		return revs * gears.get(currentGear).getRatio();
	}
	//inner class
	private class Gear {
		private int gearNumber;
		private double ratio;

		public double getRatio() {
			return ratio;
		}

		public Gear(int gearNumber, double ratio) {
			this.gearNumber = gearNumber;
			this.ratio = ratio;
		}

		public double driveSpeed(int revs) {
			return revs * (this.ratio);
		}

	}
}
