package com.samuelvazquez;

import java.util.ArrayList;


public class SystemBank {
	private String myNumber;
	private ArrayList<Account> myAccounts;

	//Create a constructor. Its going to accept as a
	//parameter the myNumber
	public SystemBank(String myNumber) {
		this.myNumber = myNumber;
		this.myAccounts = new ArrayList<Account>();
	}

	public boolean addNewAccount(Account account) {
		if(findAccount(account.getName()) >= 0) {
			System.out.println("Account is already on file");
			return false;
		}
		myAccounts.add(account);
		return true;
	}


	public boolean updateAccount(Account oldAccount, Account newAccount) {
		int foundPosition = findAccount(oldAccount);
		if(foundPosition < 0) {
			System.out.println(oldAccount.getName() + ", was not found");
			return false;
		}
		this.myAccounts.set(foundPosition, newAccount);
		System.out.println(oldAccount.getName() + ", was replaced with " + newAccount.getName());
		return true;
	}

	//We're going to have two findAccount methods
	//First one that returns the index position
	//It's going to return an integer showing us what the element
	//position is in the array for that particular account object
	//The number tha will be returned will be zero or greater if it exists
	//in the ArrayList, and it will return a number less than zero if it doesn't
	//exist
	private int findAccount(Account account) {
		return this.myAccounts.indexOf(account);
	}

	//This method does a loop through all the records and we're gonna extract the name out.
	//and then compare that to the name that's been parsed, and return the index position if it's
	//actually on file
	private int findAccount(String accountName) {
		for(int i= 0; i < this.myAccounts.size(); i++) {
			Account account = this.myAccounts.get(i);
			if(account.getName().equals(accountName)){
				return i;
			}
		}
		return -1;
	}
}
