package com.samuelvazquez;

import java.util.Scanner;


public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static Button btnPrint = new Button("Print");
	public static void main(String[] args) {
		//Gear is an inner class to gearbox, we need to specify that.
		//We need to specify the outer class Gearbox and then gear
		//Gearbox mcLaren  = new Gearbox(7);
		//Gearbox.Gear first = mcLaren.new Gear(1,12.3);
		//These ways don't work for inner classes
		//Gearbox.Gear first = new Gearbox.Gear(1,12.3);
		//Gearbox.Gear second = new mcLaren.Gear(1,12.3);
		//System.out.println(first.driveSpeed(1000));
//		mcLaren.addGear(1,5.3);
//		mcLaren.addGear(2,10.5);
//		mcLaren.addGear(3,15.9);
//		mcLaren.operateClutch(true);
//		mcLaren.changeGear(1);
//		mcLaren.operateClutch(false);
//		System.out.println(mcLaren.wheelSpeed(1000));
//		mcLaren.changeGear(2);
//		System.out.println(mcLaren.wheelSpeed(3000));
//		mcLaren.operateClutch(true);
//		mcLaren.changeGear(3);
//		mcLaren.operateClutch(false);
//		System.out.println(mcLaren.wheelSpeed(3000));
		class ClickListener implements Button.OnClickListener {
			public ClickListener() {
				System.out.println("I've been attached");
			}

			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked");
			}
		}
		btnPrint.setOnClickListener(new ClickListener());
	}
	private static void listen() {
		boolean quit = false;
		while(!quit) {
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
				case 0:
					quit = true;
					break;
				case 1:
					btnPrint.onClick();
			}
		}
	}

}
