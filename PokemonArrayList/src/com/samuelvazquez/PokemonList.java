package com.samuelvazquez;

import java.util.ArrayList;


public class PokemonList {
	private ArrayList<String> myPokemonList = new ArrayList<String>();

	public void addPokemon(String pokemon) {
		myPokemonList.add(pokemon);
	}

//	public ArrayList<String> getMyPokemonList() {
//		return myPokemonList;
//	}



	public ArrayList<String> getMyPokemonList() {
		return myPokemonList;
	}

	public void printPokemonList() {
		System.out.println("You have " + myPokemonList.size() + " items in your Pokemon list");
		for(int i = 0 ; i < myPokemonList.size(); i++) {
			System.out.println((i+1) + ". " + myPokemonList.get(i));
		}
	}

	public void modifyPokemon(String currentPokemon, String newPokemon) {
		int position = searchPokemon(currentPokemon);
		if(position >= 0) {
			modifyPokemon(position,newPokemon);
		} else {
			System.out.println("That Pokémon is not in the list");
		}
	}

	private void modifyPokemon(int position, String newPokemon) {
		myPokemonList.set(position, newPokemon);
		System.out.println("Pokemon in position " + (position+1) + " has been modified.");
	}

	public void removePokemon(String newPokemon) {
		int position = searchPokemon(newPokemon);
		if(position >= 0) {
			removePokemon(position);
		}
	}

	private void removePokemon(int position) {
		myPokemonList.remove(position);
	}

	private int searchPokemon(String searchPokemon) {
		return myPokemonList.indexOf(searchPokemon);
	}

	public boolean onFile(String searchItem) {
		int position = searchPokemon(searchItem);
		if(position >= 0) {
			return true;
		}
		return false;
	}
}
