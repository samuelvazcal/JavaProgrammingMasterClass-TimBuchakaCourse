package com.samuelvazquez;

import java.util.ArrayList;


public class PokemonList {
	private ArrayList<String> myPokemonList = new ArrayList<String>();

	public void addPokemon(String pokemon) {
		myPokemonList.add(pokemon);
	}

	public void printPokemonList() {
		System.out.println("You have " + myPokemonList.size() + " items in your Pokemon list");
		for(int i = 0 ; i < myPokemonList.size(); i++) {
			System.out.println((i+1) + ". " + myPokemonList.get(i));
		}
	}

	public void modifyPokemon(int position, String newPokemon) {
		myPokemonList.set(position, newPokemon);
		System.out.println("Pokemon in position " + (position+1) + " has been modified.");
	}

	public void removePokemon(int position) {
		myPokemonList.remove(position);
	}

	public String searchPokemon(String searchPokemon) {
		int position = myPokemonList.indexOf(searchPokemon);
		if(position >= 0) {
			return myPokemonList.get(position);
		}
		return null;
	}
}
