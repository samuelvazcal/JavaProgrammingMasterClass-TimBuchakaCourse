package com.samuelvazquez;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog("Lula");
		dog.breathe();
		dog.eat();

		Parrot parrot = new Parrot("Guacamaya Chiapaneca Tlatoani");
		parrot.breathe();
		parrot.eat();
		parrot.fly();

		Penguin penguin = new Penguin("Imperial Mexican Penguin");
		penguin.fly();
	}
}
