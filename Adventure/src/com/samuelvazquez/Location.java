package com.samuelvazquez;

import java.util.HashMap;
import java.util.Map;


public class Location {
	private final int locationID;
	private final String description;
	private final Map<String, Integer> exits;

	public Location(int locationID, String description, Map<String, Integer> exits) {
		this.locationID = locationID;
		this.description = description;
		//we make our class immutable, once an instance is created can't be changed
		this.exits = new HashMap<String, Integer>(exits);
		this.exits.put("Q",0);
	}

	public void addExit(String direction, int location) {
		exits.put(direction, location);
	}

	public int getLocationID() {
		return locationID;
	}

	public String getDescription() {
		return description;
	}

	//Instead of just returning the exits map, I'm creating a new HashMap
	//and passing out exits in the constructor
	//I'm creating a new HashMap with the content of a collection, in this case 'exits'
	public Map<String, Integer> getExits() {
		return new HashMap<String, Integer>(exits);
	}
}
