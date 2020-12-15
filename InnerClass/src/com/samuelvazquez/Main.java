package com.samuelvazquez;

public class Main {
	public static void main(String[] args) {
		//Gear is an inner class to gearbox, we need to specify that.
		//We need to specify the outer class Gearbox and then gear
		Gearbox mcLaren  = new Gearbox(7);
		Gearbox.Gear first = mcLaren.new Gear(1,12.3);
		//These ways don't work for inner classes
		//Gearbox.Gear first = new Gearbox.Gear(1,12.3);
		//Gearbox.Gear second = new mcLaren.Gear(1,12.3);
		System.out.println(first.driveSpeed(1000));
	}

}
