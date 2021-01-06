package com.samuelvazquez;
//Static initialization block test

//Block is only executed once when the class is first loaded into the project
//So, in the same way that we can set the value of a field in the constructor, we can also assign the value of a
//static final variable in the static initialization block
public class SIBTest {
	public static final String owner;
	static {
		owner == "tim";
		System.out.println("SIBTest static initialization block called");
	}

	public SIBTest() {
		System.out.println("SIB constructor called");
	}

	static {
		System.out.println("2nd initialization block called");
	}

	public void someMethod() {
		System.out.println("someMethod called");
	}
}
