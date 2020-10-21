package com.samuelvazquez;

public class Kitchen {
	private Refrigerator theRefrigerator;
	private Stove theStove;

	public Kitchen(Refrigerator theRefrigerator, Stove theStove) {
		this.theRefrigerator = theRefrigerator;
		this.theStove = theStove;
	}


	public Refrigerator getTheRefrigerator() {
		return theRefrigerator;
	}

	public void setTheRefrigerator(Refrigerator theRefrigerator) {
		this.theRefrigerator = theRefrigerator;
	}

	public Stove getTheStove() {
		return theStove;
	}

	public void setTheStove(Stove theStove) {
		this.theStove = theStove;
	}
}
