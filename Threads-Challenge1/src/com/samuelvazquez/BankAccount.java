package com.samuelvazquez;

class BankAccount {

	private double balance;
	private String accountNumber;

	public BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
	}
	//Making BankAccount threadsafe, one solution is synchronizing any method that is updating a field

//	public synchronized  void deposit(double amount) {
//		balance += amount;
//	}
//
//	public synchronized  void withdraw(double amount) {
//		balance -= amount;
//	}

	//second solution is synchronize the code within the methods
	//with a synchronized block.
	//Unlike the first method, if the deposit and withdraw methods contained more code and not all the code
	//was a critical section then this second solution would be a better solution

	//Generally speaking we want to synchronize the smallest amount of code possible to minimize the
	//performance impact on the application
	public void deposit(double amount) {
		synchronized (this) {
			balance += amount;
		}
	}

	public void withdraw(double amount) {
		synchronized (this) {
			balance -= amount;
		}
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void printAccountMember() {
		System.out.println("Account number = " + accountNumber);
	}

	//Make the BnkAccount class threadsafe again using the synchronized keyword
	//We don't have to make any changes to the code. Because both threads only read the account number,
	//thread interference isn't an issue. We'b be over-synchronizing the code
}
