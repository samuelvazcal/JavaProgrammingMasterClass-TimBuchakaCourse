package com.samuelvazquez;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class Locations implements Map<Integer,Location> {
	private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

	public static void main(String[] args) {
		FileWriter locFile = null;
		try {
			locFile = new FileWriter("locations.txt");
			for(Location location : locations.values()) {
				locFile.write(location.getLocationID()+ "," + location.getDescription()+ "\n");
			}
		} catch(IOException e) {
			System.out.println("In catch block");
			e.printStackTrace();
			//finally is a block code that is used to execute (cleanup) important code such as closing connection, stream, etc.
			//It's always executed whether exception is handled or not
		} finally {
			System.out.println("In finally block");
			try {
				if(locFile!=null) {
					System.out.println("Attempting to close locfile");
					locFile.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}


	//There is only one copy of static data that is shared amongst all classes instances
	//static initialization block will be executed once and that's when the locations classes loaded
	//we guaranteed that only one instance is created, as an option before singleton lesson
	static {
		Map<String, Integer> tempExit = new HashMap<String, Integer>();
		locations.put(0, new Location(0, "You are sitting in front of a computer learning Java",null));

		tempExit = new HashMap<String, Integer>();
		tempExit.put("W", 2);
		tempExit.put("E", 3);
		tempExit.put("S", 4);
		tempExit.put("N", 5);
		locations.put(1, new Location(1, "You are standing at the end of a road before a small brick building",tempExit));

		tempExit = new HashMap<String, Integer>();
		tempExit.put("N", 5);
		locations.put(2, new Location(2, "You are at the top of a hill",tempExit));

		tempExit = new HashMap<String, Integer>();
		tempExit.put("W", 1);
		locations.put(3, new Location(3, "You are inside a building, a well house for a small spring",tempExit));

		tempExit = new HashMap<String, Integer>();
		tempExit.put("N", 1);
		tempExit.put("W", 2);
		locations.put(4, new Location(4, "You are in a valley beside a stream",tempExit));

		tempExit = new HashMap<String, Integer>();
		tempExit.put("S", 1);
		tempExit.put("W", 2);
		locations.put(5, new Location(5, "You are in the forest",tempExit));
	}

	@Override
	public int size() {
		return locations.size();
	}

	@Override
	public boolean isEmpty() {
		return locations.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		return locations.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return locations.containsValue(value);
	}

	@Override
	public Location get(Object key) {
		return locations.get(key);
	}

	@Override
	public Location put(Integer key, Location value) {
		return locations.put(key, value);
	}

	@Override
	public Location remove(Object key) {
		return locations.remove(key);
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends Location> m) {

	}

	@Override
	public void clear() {
		locations.clear();
	}

	@Override
	public Set<Integer> keySet() {
		return locations.keySet();
	}

	@Override
	public Collection<Location> values() {
		return locations.values();
	}

	@Override
	public Set<Entry<Integer, Location>> entrySet() {
		return locations.entrySet();
	}
}
