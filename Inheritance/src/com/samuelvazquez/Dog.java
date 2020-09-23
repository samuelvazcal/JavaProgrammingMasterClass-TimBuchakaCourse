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

	public void walk() {
		System.out.println("Dog.walk() called");
		super.move(5);
	}

	public void run() {
		System.out.println("Dog.run() called");
		//super defines where is the method 'move' that should be executed.
		//e.g for this case, the console will display:
		//	Dog.run() called
		//	Animal.move() called. Animal is moving at speed 10
		//And without super it will run the move method located in this class.
		// Dog.run() called
		// Dog.move() called
		// Dog.moveLegs() called
		// Animal.move() called. Animal is moving at speed 10
		move(10);
	}

	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		chew();
		super.eat();
	}

	public void moveLegs() {
		System.out.println("Dog.moveLegs() called");
	}

	@Override
	public void move(int speed) {
		System.out.println("Dog.move() called");
		moveLegs();
		super.move(speed);
	}
}
