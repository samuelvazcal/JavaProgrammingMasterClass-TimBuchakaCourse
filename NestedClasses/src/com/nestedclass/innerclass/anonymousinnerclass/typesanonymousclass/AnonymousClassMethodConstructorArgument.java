package com.nestedclass.innerclass.anonymousinnerclass.typesanonymousclass;

public class AnonymousClassMethodConstructorArgument {
	public static void main(String[] args) {
		//short way to replicate the same thread in AnonymousClassImplementsInterface class.
		//Anonymous inner classes in method/constructor arguments are often used in graphical user interface (GUI) applications.
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("a PRO thread from an anonymous class in method/constructor arguments");
			}
		}).start();
		System.out.println("Main Thread");
	}
}
