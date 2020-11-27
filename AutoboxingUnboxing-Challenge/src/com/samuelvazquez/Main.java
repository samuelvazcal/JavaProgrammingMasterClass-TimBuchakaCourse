package com.samuelvazquez;

public class Main {
	public static void main(String[] args) {
		Bank bank = new Bank ("National Australia Bank");
		bank.addBranch("Adelaide");

		bank.addCustomer("Adelaide","Tim",50.05);
		bank.addCustomer("Adelaide","Mike",100.32);
		bank.addCustomer("Adelaide","Percy",222.79);

		bank.addBranch("Sydney");
		bank.addCustomer("Sydney","Bob",150.54);

		bank.addCustomerTransaction("Adelaide","Tim",44.22);
		bank.addCustomerTransaction("Adelaide","Tim",12.44);
		bank.addCustomerTransaction("Adelaide","Mike",1.44);

		bank.listCustomer("Adelaide",false);

	}



}
