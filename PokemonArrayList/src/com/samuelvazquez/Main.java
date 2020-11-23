package com.samuelvazquez;

import java.util.Scanner;


public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static PokemonList pokemonList = new PokemonList();

	public static void main(String[] args) {
		boolean quit = false;
		int option = 0;
		printInstructions();
		while(!quit) {
			System.out.println("Enter your option: ");
			option = scanner.nextInt();
			scanner.nextLine();
			switch(option) {
				case 0:
					printInstructions();
					break;
				case 1:
					pokemonList.printPokemonList();
					break;
				case 2:
					addItem();
					break;
				case 3:
					modifyItem();
					break;
				case 4:
					removeItem();
					break;
				case 5:
					searchItem();
					break;
				case 6:
					quit = true;
					break;
			}
		}
	}

	public static void printInstructions() {
		System.out.println("\n Press");
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item to the list");
		System.out.println("\t 3 - To modify an item to the list");
		System.out.println("\t 4 - To remove an item from the list");
		System.out.println("\t 5 - To search for an item in the list");
		System.out.println("\t 6 - To quit the application");
	}

	public static void addItem() {
		System.out.println("Please enter one of your favorite Pokémon:");
		//pokemonList.printPokemonList();
		pokemonList.addPokemon(scanner.nextLine());
	}

	public static void modifyItem() {
		System.out.println("Please enter the Pokemon name that you want to change:");
		String itemNo = scanner.nextLine();
		System.out.println("Enter new Pokémon:");
		String newPokemon = scanner.nextLine();
		pokemonList.modifyPokemon(itemNo, newPokemon);
	}

	public static void removeItem() {
		System.out.println("Please enter the Pokemon name that you want to remove:");
		String itemNo = scanner.nextLine();
		pokemonList.removePokemon(itemNo);
	}

	public static void searchItem() {
		System.out.println("Pokemon you want to search:");
		String itemSearch = scanner.nextLine();
		//if(pokemonList.searchPokemon(itemSearch)!=null) {
		if(pokemonList.onFile(itemSearch)) {
			System.out.println(itemSearch + " was founded in the list" );
		} else {
			System.out.println(itemSearch + " is not in the list");
		}
	}
}
