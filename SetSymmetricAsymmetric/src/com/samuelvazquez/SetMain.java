package com.samuelvazquez;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class SetMain {
	public static void main(String[] args) {
		Set<Integer> squares = new HashSet<>();
		Set<Integer> cubes = new HashSet<>();

		for(int i=1; i<=100;i++) {
			squares.add(i*i);
			//System.out.println("This is i: " + i*i);
			cubes.add(i*i*i);
			//System.out.println("This is i: " + i*i*i);
		}
		System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes.");
		//union is created using data from 'squares' collection, so
		//the constructor initializes with the content of 'squares'
		//To calculate the union, intersection, or set difference of two sets nondestructively, the caller must copy
		//one set before calling the appropriate bulk operation.
		Set<Integer> union = new HashSet<>(squares);
		//and we add the values from 'cubes' collection, if they're not already present
		union.addAll(cubes);
		//after that, the size is 196 'cause <1, 64, 729, 4096> are in both previous sets
		System.out.println("Union contains " + union.size() + " elements");

		//Here I'm retaining the elements that are duplicated from 'squares' and 'cubes' in my new set 'intersection'
		Set<Integer>intersection  = new HashSet<>(squares);
		intersection.retainAll(cubes);
		//It shows the four elements and their respective square and cube root
		System.out.println("Intersection contains "+ intersection.size() + " elements.");
		for(int i: intersection) {
			System.out.println(i + " is the square of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
		}
		Set<String> words = new HashSet<>();
		String sentence = "one day in the year of the fox";
		String[] arrayWords = sentence.split(" ");
		words.addAll(Arrays.asList(arrayWords));
		for(String s: words) {
			System.out.println(s);
		}

		Set<String> nature = new HashSet<>();
		Set<String> divine = new HashSet<>();
		String[] natureWords = {"all","nature","is", "but","art", "unknown","to","thee"};
		nature.addAll(Arrays.asList(natureWords));
		String[] divineWords = {"to","err","is", "human","to", "forgive","divine"};
		divine.addAll(Arrays.asList(divineWords));

		System.out.println();
		System.out.println("nature - divine");
		Set<String> diff1 = new HashSet<>(nature);
		diff1.removeAll(divine);
		printSet(diff1);

		System.out.println("divine - nature");
		Set<String> diff2 = new HashSet<>(divine);
		diff2.removeAll(nature);
		printSet(diff2);

		//First we handle the bulky operation creating a new collection for the union set
		Set<String> unionTest = new HashSet<>(nature);
		unionTest.addAll(divine);
		//Then we create a new collection for only the intersection set elements
		Set<String> intersectionTest = new HashSet<>(nature);
		intersectionTest.retainAll(divine);
		//For symmetric difference we just remove the intersection from the union
		System.out.println("Symmetric difference");
		unionTest.removeAll(intersectionTest);
		printSet(unionTest);

		//Contains all is used to test it if one set is a super set of another. It is a non-destructive operation
		if(nature.containsAll(divine)) {
			System.out.println("divine is a subset of nature");
		}
		if(nature.containsAll(intersectionTest)) {
			System.out.println("intersection is a subset of nature");
		}
		if(divine.containsAll(intersectionTest)) {
			System.out.println("intersection is a subset of divine");
		}
	}
	private static void printSet(Set<String>set) {
		System.out.print("\t");
		for(String s: set) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
}


















