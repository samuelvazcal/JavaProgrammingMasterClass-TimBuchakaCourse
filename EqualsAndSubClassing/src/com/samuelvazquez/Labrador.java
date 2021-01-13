package com.samuelvazquez;

public class Labrador extends Dog{

	public Labrador(String name) {
		super(name);
	}

//	@Override
//	public boolean equals(Object o) {
//		if (this == o) {
//			return true;
//		}
//		if (o instanceof Labrador) {
//			String tempDogName = ((Labrador) o).getName();
//			return this.getName().equals(tempDogName);
//		}
//		return false;
//	}
}
