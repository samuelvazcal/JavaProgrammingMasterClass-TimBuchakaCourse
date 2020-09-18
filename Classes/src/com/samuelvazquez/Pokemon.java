package com.samuelvazquez;

public class Pokemon {
	private int number;
	private int level;
	private String name;
	private String gender;
	private String color;

	public void setName(String name) {
		String validName = name.toLowerCase();
		if(validName.equals("storm")||validName.equals("blazer")) {
			this.name  = name;
		} else {
			this.name = "Unknown";
		}
	}

	public String getName() {
		return this.name;
	}

}
