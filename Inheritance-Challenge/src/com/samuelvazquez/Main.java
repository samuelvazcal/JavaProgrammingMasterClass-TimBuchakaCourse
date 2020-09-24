package com.samuelvazquez;

public class Main {
	public static void main(String[] args) {
		Suv suv = new Suv(2.8);

		suv.accelerate(0);
		suv.steer(45);
		suv.accelerate(30);
		suv.accelerate(20);
		suv.accelerate(-40);
	}
}
