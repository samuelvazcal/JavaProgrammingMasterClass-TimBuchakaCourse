package com.samuelvazquez;


import java.util.ArrayList;

//angle brackets (a diamond) with a T to indicate there's gonna be a type there
// T - type parameter
//This way we're basically adding the type parameter so we can make this
//more generic and it's going to work for any type of player.
//When we instantiate a class, the T will be replaced automatically by Java with the
//actual class we're using,

//This way, we are restricting the type of class that we can actually use for team.
public class Team<T extends Player> implements Comparable<Team<T>> {
	private String name;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;

	//create an array list that's using generic for out player object
	private ArrayList<T> members = new ArrayList<>();

	//now, create a constructor
	public Team(String name) {
		this.name = name;
	}

	//geter got name
	public String getName() {
		return name;
	}

	//we're gonna add the player
	//The type T is unknown until we actually instantiate a class, there's actually no way for
	//Java to know that an object of type T in this case really does have a getName method
	public boolean addPlayer(T player) {
		if(members.contains(player)) {
			System.out.println(player.getName() + " is already on this team");
			return false;
		} else {
			members.add(player);
			System.out.println(player.getName() + " picked for team " + this.name);
			return true;
		}
	}

	public int numPlayers() {
		return this.members.size();
	}

	public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
		String message;
		if(ourScore > theirScore) {
			won++;
			message = " beat ";
		} else if(ourScore == theirScore) {
			tied++;
			message = " drew with ";
		} else {
			lost++;
			message = " lost to ";
		}
		played++;
		if(opponent!=null) {
			System.out.println(this.getName() + message + opponent.getName());
			opponent.matchResult(null, theirScore,ourScore);
		}
	}

	public int ranking() {
		return (won*2) + tied;
	}

	@Override
	public int compareTo(Team<T> team) {
		if(this.ranking() > team.ranking()) {
			return -1;
		} else if(this.ranking() < team.ranking()) {
			return 1;
		} else {
			return 0;
		}
	}
}
