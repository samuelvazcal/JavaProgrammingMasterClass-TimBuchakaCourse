package com.nestedclass.innerclass.anonymousinnerclass;

public class HelloWorldAnonymousClasses {
	interface HelloWorld {
		void greet();
		void greetSomeone(String someone);
	}

	public void sayHello() {
		//EnglishGreeting is a local inner class. "Subclassing" an interface
		class EnglishGreeting implements HelloWorld {
			String name = "world";
			public void greet() {
				greetSomeone("world");
			}
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hello " + name);
			}
		}

		//initialization and instantiation of EnglishGreeting
		HelloWorld englishGreeting = new EnglishGreeting();

		//Anonymous class implementing interface
		HelloWorld frenchGreeting = new HelloWorld() {
			String name = "tout le monde";
			@Override
			public void greet() {
				greetSomeone("tout le monde");
			}
			@Override
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Salut " + name);
			}
		};

		//Anonymous class implementing interface
		HelloWorld spanishGreeting = new HelloWorld() {
			String name = "mundo";
			public void greet() {
				greetSomeone("mundo");
			}
			public void greetSomeone(String someone) {
				name = someone;
				System.out.println("Hola, " +name);
			}
		};

		englishGreeting.greet();
		frenchGreeting.greetSomeone("Samuel");
		spanishGreeting.greet();
	}

	public static void main(String[] args) {
		HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();
		myApp.sayHello();
	}
}
