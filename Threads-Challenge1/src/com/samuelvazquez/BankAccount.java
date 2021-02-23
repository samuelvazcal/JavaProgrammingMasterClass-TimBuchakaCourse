package com.samuelvazquez;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


class BankAccount {

	private double balance;
	private String accountNumber;

	private Lock lock;

	public BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber;
		this.balance = initialBalance;
		//it will be initialize in te constructor
		this.lock = new ReentrantLock();
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
//	public void deposit(double amount) {
//		synchronized (this) {
//			balance += amount;
//		}
//	}
//
//	public void withdraw(double amount) {
//		synchronized (this) {
//			balance -= amount;
//		}
//	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void printAccountMember() {
		System.out.println("Account number = " + accountNumber);
	}

	//Make the BnkAccount class threadsafe again using the synchronized keyword
	//We don't have to make any changes to the code. Because both threads only read the account number,
	//thread interference isn't an issue. We'b be over-synchronizing the code

	//Use ReentrantLock
	//Instead of suing the synchronized keyword, make the BankAccount class threadsafe using
	//the ReentrantLock class
	//We'll create a lock object and use the lock() method in the withdraw() and deposit() methods.
	// - Both threads need to compete for the same lock, so we create only one lock object that we
	// use in all the methods that have critical sections of code
	// - We put the critical section of code within a try/finally block, to ensure that the lock will
	//be released.
	//Don't forget to create the lock instance in the BankAccount constructor.

//	public void deposit(double amount) {
//		lock.lock();
//		try {
//			balance += amount;
//		} finally {
//			lock.unlock();
//		}
//	}
//
//	public void withdraw(double amount) {
//		lock.lock();
//		try {
//			balance -= amount;
//		} finally {
//			lock.unlock();
//		}
//	}

	//Use tryLock with a timeout value
	//Instead of using lock(), use tryLock() with a timeout value of 1 second. If the waiting period
	//times out, print the message, "Could not get the lock" to the console.

	public void deposit(double amount) {

		boolean status = false;

		try {
			if(lock.tryLock(1000, TimeUnit.MILLISECONDS)) {
				try {
					balance += amount;
					status = true;
				} finally {
					lock.unlock();
				}
			} else {
				System.out.println("Could not get the lock");
			}
		} catch(InterruptedException e) {
			//do something here
		}
		System.out.println("Transaction status = " + status);
	}

	public void withdraw(double amount) {

		boolean status = false;

		try {
			if(lock.tryLock(1000,TimeUnit.MILLISECONDS)) {
				try {
					balance -= amount;
					status = true;
				} finally {
					lock.unlock();
				}
			} else {
				System.out.println("Could not get the lock");
			}
		} catch (InterruptedException e) {
			//do something here
		}
		System.out.println("Transaction status = " + status);
	}

	//Update the code so that the status variable is thread safe
	//Since the status variable is a local variable, it's already threadsafe.
	//Local variables are stored on the thread stack, so each thread will have its own copy. Threads won't
	//interfere with each other when it comes to setting and getting the status value.
}
