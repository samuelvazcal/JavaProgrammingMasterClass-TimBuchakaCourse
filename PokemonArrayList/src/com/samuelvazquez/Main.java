package com.samuelvazquez;

import javax.swing.*;
import java.util.Scanner;


public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static PokemonList pokemonList = new PokemonList();

	public static void main(String[] args) {
		boolean flag = false;
		int opt = 0;
		printInstructions();
		while(!flag) {
			System.out.println("Enter your option: ");
			opt = scanner.nextInt();
			scanner.nextLine();
			switch(opt) {
				case 0:
					printInstructions();
					break;
				case 1:
					pokemonList.printPokemonList();
					break;
				case 2:
					addPokemon();
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

	public static void addPokemon() {
		System.out.println("Enter a new favorite Pokemon:");
		pokemonList.addPokemon(scanner.nextLine());
	}
}
