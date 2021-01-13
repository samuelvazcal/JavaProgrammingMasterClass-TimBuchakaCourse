package com.samuelvazquez;

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

}
