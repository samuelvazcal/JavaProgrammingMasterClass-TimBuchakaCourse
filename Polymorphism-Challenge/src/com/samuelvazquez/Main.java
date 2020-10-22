package com.samuelvazquez;

public class Main {
	public static void main(String[] args) {
		Car car = new Car("Base car",2);
		System.out.println(car.startEngine());
		System.out.println(car.accelerate());
		System.out.println(car.brake());
		System.out.println();
		Lamborghini lamborghini = new Lamborghini("Diablo",4);
		System.out.println(lamborghini.startEngine());
		System.out.println(lamborghini.accelerate());
		System.out.println(lamborghini.brake());
		System.out.println();
		Nissan nissan = new Nissan("Platina",4);
		System.out.println(nissan.startEngine());
		System.out.println(nissan.accelerate());
		System.out.println(nissan.brake());

	}
}
