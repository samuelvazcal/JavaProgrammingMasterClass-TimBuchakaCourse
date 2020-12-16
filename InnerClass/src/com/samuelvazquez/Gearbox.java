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

		for(int i = 0; i<maxGears; i++) {
			addGear(i,i*5.3);
		}
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
		return revs * gears.get(currentGear).driveSpeed(revs);
	}
	//inner class
	//It can be a good way to improve encapsulation
	//So, objects only know about other objects that they need to know about
	//Nothing apart from the gearbox needs to have any details about the actual gear
	// so we hide the gear class completely by making it a private in-class of the gear class
	//But there's two special cases of inner classes:
	//Local classes and Anonymous classes
	//Local classes are declared inside a block, such as a method and their scope is restricted
	//completely to that particular block
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
