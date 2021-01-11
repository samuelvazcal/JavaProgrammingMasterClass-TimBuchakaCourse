package com.samuelvazquez;

import java.util.HashMap;
import java.util.Map;


public class MapProgram {
	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>();
		if(languages.containsKey("Java")) {
			System.out.println("Java already exists");
		} else {
			languages.put("Java","a compiled high level, object-oriented, platform independent language");
			System.out.println("Java added successfully");
		}
		languages.put("Python","an interpreted, object oriented, high-level programming language with dynamic semantic");
		languages.put("Algol", "an algorithmic language");
		System.out.println(languages.put("BASIC","Beginners All Purposes Symbolic Instruction Code"));
		System.out.println(languages.put("Lisp","Therein lies madness"));
		System.out.println(languages.get("Java"));
		if(languages.containsKey("Java")) {
			System.out.println("Java is already in the map");
		} else {
			languages.put("Java","this course is about Java");
		}
		//Pinting map content
		//One way to do that is to look through the keys in a map using the key set method and it returns
		//a set of all the keys
		System.out.println("======================");
		for(String key: languages.keySet()) {
			System.out.println(key + " : " + languages.get(key));
		}
	}
}
