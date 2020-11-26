package com.samuelvazquez;

public class Account {
	private String name;
	private String bankAccount;

	public Account(String name, String bankAccount) {
		this.name = name;
		this.bankAccount = bankAccount;
	}

	public String getName() {
		return name;
	}

	public String getBankAccount() {
		return bankAccount;
	}

	//Create a new contact record
	//Calling a constructor to create a new account record
	//It's static because in the Main class we prefer it static. It's more convenient
	public static Account createAccount(String name, String bankAccount) {
		return new Account(name,bankAccount);
	}
}
