package com.samuelvazquez;

//This is an abstract class that itself is extending from another abstract class
//It's implementing the required methods that the Animal class requires it to,
//but it's also defining an abstract method fly'
public abstract class Bird extends Animal{

	public Bird(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName() + " is pecking");
	}

	@Override
	public void breathe() {
		System.out.println(getName() + " is Breathing in, breathing out, ...");
	}

	public abstract void fly();
}
