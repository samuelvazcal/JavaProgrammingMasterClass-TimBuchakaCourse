package com.samuelvazquez;

class Movie {
	private String name;

	public Movie(String name) {
		this.name=name;
	}

	public String plot() {
		return "No plot here";
	}

	public String getName() {
		return name;
	}
}

class Jaws extends Movie{
	public Jaws() {
		super("Jaws");
	}

	public String plot() {
		return "A shark that eats people";
	}
}

class IndependenceDay extends Movie {
	public IndependenceDay() {
		super("Independence Day");
	}

	@Override
	public String plot() {
		return "Aliens attempt to take over the planet earth";
	}
}

class MazeRunner extends Movie {
	public MazeRunner() {
		super("Maze Runner");
	}

	@Override
	public String plot() {
		return "Kids try to escape a maze";
	}
}

class StarsWars extends Movie {
	public StarsWars() {
		super("Stars Wars");
	}

	@Override
	public String plot() {
		return "Imperial forces try to take over the universe";
	}
}

class Forgetable extends Movie {
	public Forgetable() {
		super("Forgetable");
	}

	//No plot method
}

public class Main {
	public static void main(String[] args) {
		for(int i = 1; i < 11; i++) {
			Movie movie = randomMovie();
			System.out.println("Moive #" + i + ": " + movie.getName() + "\n" + "plot: " + movie.plot() + "\n");
		}
	}

	public static Movie randomMovie() {
		int randomNumber = (int) (Math.random()*5)+1;
		System.out.println("Random number generated was: " + randomNumber);
		switch(randomNumber) {
			case 1:
				return new Jaws();
			case 2:
				return new IndependenceDay();
			case 3:
				return new MazeRunner();
			case 4:
				return new StarsWars();
			case 5:
				return new Forgetable();
			default:
				return null;
		}
	}
}