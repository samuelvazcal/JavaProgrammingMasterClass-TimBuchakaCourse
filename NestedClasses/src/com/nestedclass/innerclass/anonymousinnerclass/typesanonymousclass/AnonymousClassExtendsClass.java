package com.nestedclass.innerclass.anonymousinnerclass.typesanonymousclass;

public class AnonymousClassExtendsClass {
	public static void main(String[] args) {
		Thread t = new Thread(){
			@Override
			public void run(){
				System.out.println("a thread from an anonymous class");
			}
		};
		t.start();
		System.out.println("Main Thread");
	}
}
