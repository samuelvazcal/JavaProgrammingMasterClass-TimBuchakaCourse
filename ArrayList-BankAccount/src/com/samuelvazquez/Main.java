package com.samuelvazquez;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;


public class Main {
	private static Scanner scanner = new Scanner(System.in);
	//We initialize with a random number, for the SystemBank constructor.
	private static SystemBank systemBank = new SystemBank("222 333 4444");

	public static void main(String[] args) {
		boolean quit = false;
		startSystem();
		printActions();
		while(!quit) {
			System.out.println("\nEnter action: (6 to show available actions)");
			int action = scanner.nextInt();
			scanner.nextLine();

			switch(action) {
				case 0:
					System.out.println("\nShutting down...");
					quit = true;
					break;
				case 1:
					systemBank.printAccounts();
					break;
				case 2:
					addNewAccount();
					break;
				case 3:
					updateAccount();
					break;
				case 4:
					removeAccount();
					break;
				case 5:
					queryAccount();
					break;
				case 6:
					printActions();
					break;
			}
		}
	}

	private static void addNewAccount() {
		System.out.println("Enter new account name: ");
		String name = scanner.nextLine();
		System.out.println("Enter number account: ");
		String bankAccount = scanner.nextLine();
		Account newAccount = Account.createAccount(name,bankAccount);
		if(systemBank.addNewAccount(newAccount)) {
			System.out.println("New contact added: " + name + ", phone: ");
		} else {
			System.out.println("Cannot add, " + name + " already on file");
		}
	}

	private static void updateAccount() {
		System.out.println("Enter existing account name: ");
		String name = scanner.nextLine();
		Account existingAccountRecord = systemBank.queryAccount(name);
		if(existingAccountRecord == null) {
			System.out.println("Contact not found.");
			return;
		}
		System.out.println("Enter new account name: ");
		String newName = scanner.nextLine();
		System.out.println("Enter new bank account");
		String newBankAccount = scanner.nextLine();
		Account newAccount = Account.createAccount(newName, newBankAccount);
		if(systemBank.updateAccount(existingAccountRecord, newAccount)) {
			System.out.println("Successfully updated record");
		} else {
			System.out.println("Error updating record.");
		}

	}

	private static void removeAccount() {
		System.out.println("Enter existing account name: ");
		String name = scanner.nextLine();
		Account existingAccountRecord = systemBank.queryAccount(name);
		if (existingAccountRecord == null)
		{
			System.out.println("Contact not found.");
			return;
		}
		if (systemBank.removeAccount(existingAccountRecord))
		{
			System.out.println("Successfully deleted");
		}
		else
		{
			System.out.println("Error deleting contact");
		}
	}

	private static void queryAccount() {
		System.out.println("Enter existing account name: ");
		String name = scanner.nextLine();
		Account existingAccountRecord = systemBank.queryAccount(name);
		if (existingAccountRecord == null)
		{
			System.out.println("Contact not found.");
			return;
		}
		System.out
				.println("Name: " + existingAccountRecord.getName() + " bank account is " + existingAccountRecord.getBankAccount());
	}

	private static void startSystem() {
		System.out.println("Starting system...");
	}

	private static void printActions() {
		System.out.println("Available actions:\npress");
		System.out.println("0 - to shutdown\n" +
				"1 - to print contacts\n" +
				"2 - to add a new contact\n" +
				"3 - to update an existing contact\n" +
				"4 - to remove an existing contact\n" +
				"5 - query if an existing contact exists\n" +
				"6 - to print a list of available actions\n");
		System.out.println("Choose your action: ");
	}
}
