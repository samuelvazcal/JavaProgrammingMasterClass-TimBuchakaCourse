package com.samuelvazquez;

public class Main {
	public static void main(String[] args) {
		String varFour = "this is private to main()";
		ScopeCheck scopeInstance = new ScopeCheck();
		scopeInstance.userInner();

		ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
		System.out.println("varThree is not accesible here " + innerClass.varThree);
//		System.out.println("scopeInstance varOne is " + scopeInstance.getPrivateVar());
//		System.out.println(varFour);
//
//		scopeInstance.timesTwo();
//		System.out.println("************");
//		ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
//		innerClass.timesTwo();

	}
}
