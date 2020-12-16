package com.samuelvazquez;

public class Song {
	private String title;
	private double duration;

	public Song(String title, double duration) {
		this.title = title;
		this.duration = duration;
	}

	//Return a toString
	//This is just a quick way to actually output
	//the contents of an actual object

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		//return super.toString();
		return this.title + ": " + this.duration;
	}
}
