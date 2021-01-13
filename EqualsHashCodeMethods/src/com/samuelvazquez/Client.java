package com.samuelvazquez;

import java.util.Objects;


public class Client {
	private String name;
	private String id;
	private int credit;

	public Client(String name, String id, int credit) {
		this.name = name;
		this.id = id;
		this.credit = credit;
	}

	public String getName() {
		return name;
	}

	public String getId() {
		return id;
	}

	public int getCredit() {
		return credit;
	}

	//Now using the IntelliJ tool, I can create automatically both methods choosing id as main attribute
	//to overwrite them for my personal purposes
	//After that my clientsSet collection won't save duplicate objects by their id
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Client client = (Client) o;
		return id.equals(client.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
