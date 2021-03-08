package com.samuelvazquez;

public class Student {
	private int id;
	private String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	// Used to print student details
	// in main()
	public String toString()
	{
		return this.id + " "
				+ this.name;
	}
}
