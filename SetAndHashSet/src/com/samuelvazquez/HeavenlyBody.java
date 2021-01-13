package com.samuelvazquez;

import java.util.HashSet;
import java.util.Set;


public class HeavenlyBody {
	private final String name;
	private final double orbitalPeriod;
	private final Set<HeavenlyBody> satellites;

	public HeavenlyBody(String name, double orbitalPeriod) {
		this.name = name;
		this.orbitalPeriod = orbitalPeriod;
		this.satellites = new HashSet<>();
	}

	public String getName() {
		return name;
	}

	public double getOrbitalPeriod() {
		return orbitalPeriod;
	}

	//So we want to have the option to add a moon
	public boolean addMoon(HeavenlyBody moon) {
		return this.satellites.add(moon);
	}

	//just for security reasons about immutable classes
	// we are creating a new hash set of the current contents of our satellite which again means
	//that the code that is calling this object doesn't have access to our original hash set
	public Set<HeavenlyBody> getSatellites() {
		return new HashSet<>(this.satellites);
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		System.out.println("obj.getClass() is " + obj.getClass());
		System.out.println("this.getClass() is " + this.getClass());
		if((obj == null) || (obj.getClass()!= this.getClass())) {
			return false;
		}
		String objName = ((HeavenlyBody) obj).getName();
		return this.name.equals(objName);
	}













}
