package com.samuelvazquez;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//Comparable
//A comparable object is capable of comparing itself with another object.
//Comparator
//A comparator object is capable of comparing two different objects. The class is not comparing its instances, but some other class’s instances.
public class Main {
	public static void main(String[] args) {
		ArrayList<Person> personListComparable = new ArrayList<Person>();
		personListComparable.add(new Person(1,"Samuel",180));
		personListComparable.add(new Person(2,"Andrea",164));
		personListComparable.add(new Person(3,"Bryan",178));
		personListComparable.add(new Person(4,"Laylah",170));
		Collections.sort(personListComparable);
		System.out.println("People ordered by alphabetical order:");
		System.out.println(personListComparable);

		ArrayList<Person> personListComparator = new ArrayList<Person>();
		personListComparator.add(new Person(5,"Sofia",171));
		personListComparator.add(new Person(6,"Matias",181));
		personListComparator.add(new Person(7,"Angel",182));
		personListComparator.add(new Person(8,"Valeria",168));
		Collections.sort(personListComparator, new OrderedPeopleByHeight());
		System.out.println("People ordered by height");
		System.out.println(personListComparator);
	}
}
