package com.samuelvazquez;

public class SharedResource {
	private Worker owner;

	public SharedResource(Worker owner) {
		this.owner = owner;
	}

	public Worker getOwner() {
		return owner;
	}

	//we don't want any thread interference when we are setting which thread is currently
	//using the resource
	public synchronized void setOwner(Worker owner) {
		this.owner = owner;
	}


}
