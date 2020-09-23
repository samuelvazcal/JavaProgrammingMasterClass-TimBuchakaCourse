package com.samuelvazquez;

public class Dog extends Animal{


	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	/**
	 *
	 * @param name
	 * @param brain
	 * @param body
	 * @param size
	 * @param weight
	 * Those parameters are dealing with the animal class, name, brain, body, size and weight, have
	 * been created as parameters to the Dog constructor
	 * What super means is to call the constructor that is form the class that we're extending from.
	 * It's initialized the base characteristics of an animal, namely the name, the brain, the body, the size, and the weight, in
	 * a constructor
	 * What this allows us to do is to initialize the Animal class, but now we can add more features to this Dog class.
	 * Things that are unique to a dog and not just a very generic animal.
	 */
	public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}

	private void chew() {
		System.out.println("Dog.chew() called");
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
	}
}
