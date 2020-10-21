package com.samuelvazquez;

public class Main {
	public static void main(String[] args) {
		Dimensions dimensions1 = new Dimensions(100,120,20);
		Dimensions dimensions2 = new Dimensions(90,180,40);
		Stove stove = new Stove(6,"ABNB",dimensions1);
		Refrigerator refrigerator = new Refrigerator(2,"MACR",dimensions2);
		Kitchen kitchen = new Kitchen(refrigerator,stove);
		kitchen.stoveState();
		kitchen.statusCooler();
	}
}
