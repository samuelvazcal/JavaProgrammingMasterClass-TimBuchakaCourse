package com.samuelvazquez;

import java.util.ArrayList;


public class PokemonList {
	private ArrayList<String> myPokemonList = new ArrayList<String>();

	public void addPokemon(String pokemon) {
		myPokemonList.add(pokemon);
	}

	public void printPokemonList() {
		System.out.println("You have " + myPokemonList.size() + " elements in your Pokemon List");
		for(int i = 0; i < myPokemonList.size(); i++) {
			System.out.println((i+1) + ". " + myPokemonList.get(i));
		}
	}

}
