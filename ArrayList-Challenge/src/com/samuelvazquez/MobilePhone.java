package com.samuelvazquez;

import java.util.ArrayList;
import java.util.Scanner;


public class MobilePhone {
	public static Scanner scanner = new Scanner(System.in);
	private String myNumber;
	private ArrayList<Contacts> myContacts;

	public MobilePhone(String myNumber) {
		this.myNumber = myNumber;
		this.myContacts = new ArrayList<Contacts>();
	}

	public boolean addNewContact(Contacts contacts) {
		if(findContact(contacts.getName()) >= 0) {
			System.out.println("Contact is already on file");
			return false;
		}

		myContacts.add(contacts);
		return true;
	}

	public boolean updateContact(Contacts oldContact, Contacts newContant) {
		int foundPosition = findContact(oldContact);
		if(foundPosition <0) {
			System.out.println(oldContact.getName() + ", was not found.");
			return false;
		}
		this.myContacts.set(foundPosition,newContant);
		System.out.println(oldContact.getName() + ", was replaced with " + newContant.getName());
		return true;
	}
	private int findContact(Contacts contacts) {
		return this.myContacts.indexOf(contacts);
	}

	private int findContact(String contactName) {
		for(int i=0; i<this.myContacts.size(); i++) {
			Contacts contact = this.myContacts.get(i);
			if(contact.getName().equals(contactName)) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {

	}
}
