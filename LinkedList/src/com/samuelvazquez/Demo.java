package com.samuelvazquez;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;


public class Demo {
	public static void main(String[] args) {
		LinkedList<String> countriesToVisit = new LinkedList<String>();

		addInOrder(countriesToVisit,"Mexico");
		addInOrder(countriesToVisit,"Japan");
		addInOrder(countriesToVisit,"Canada");
		addInOrder(countriesToVisit,"Thailand");
		addInOrder(countriesToVisit,"Brazil");
		addInOrder(countriesToVisit,"Spain");
		addInOrder(countriesToVisit,"Singapore");
		addInOrder(countriesToVisit,"Italy");
		printList(countriesToVisit);

		addInOrder(countriesToVisit,"Australia");
		addInOrder(countriesToVisit,"Italy");
		printList(countriesToVisit);

		visit(countriesToVisit);

	}

	//i.next is moving to the next entry, but it's actually returning what the current value is
	//before it moves on.
	private static void printList(LinkedList<String> linkedList) {
		int count = 1;
		Iterator<String> i = linkedList.iterator();
		while(i.hasNext()) {
			System.out.println((count++) + " now visiting " + i.next());
		}
		System.out.println("==========================");
	}

	public static boolean addInOrder(LinkedList<String>linkedList, String newCity) {
		ListIterator<String> stringListIterator = linkedList.listIterator();
		//Right now is not pointing to the first record, you have to use a .next()
		//to go to the first record. So the first one is just a set up. It is not automatically pointing to the first entry.
		//You need to use that .next first to actually get to the first entry.
		while(stringListIterator.hasNext()) {
			int comparison = stringListIterator.next().compareTo(newCity);
			if(comparison==0) {
				//equal, do not add
				System.out.println(newCity + " is already included as a destination");
				return false;
			} else if (comparison > 0) {
				//newCity should appear before this one
				//So we move to the previous entry again, the one that we're at
				//and then add the new city
				stringListIterator.previous();
				stringListIterator.add(newCity);
				return true;
			} else if(comparison < 0) {
				//move on to next city, you don't need to actually do anything there
				//newCity is move onto the next record, because that record can't be added in.
			}
		}
		stringListIterator.add(newCity);
		return true;
	}

	private static void visit(LinkedList cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		there is no current position as such.
//		So the listiterator actually hovers between the items that would be returned when you go to previous or you go to next
//		So if you go forward with one and then go back with two, then go forward with one, etc, you never actually leave the city that you'are actually in
//		So, its ahead of actually allowed access to the item at .next or previous in the normal way
//		We need to keep tracking of which direction we're going, and allow for the in between nature of the iterater

		//Track the direction
		//When we're going forward or backwards, we'll need to do a test and we need to set that direction
		boolean goingForward = true;
		ListIterator<String> listIterator = cities.listIterator();
		//Retrieves the very first entry link in the link list
		if(cities.isEmpty()) {
			System.out.println("No cities in the itinerary");
			//return;
		} else {
			System.out.println("Now visiting " + listIterator.next());
			printMenu();
		}
		while(!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			switch(action) {
				case 0:
					System.out.println("Holiday (Vacation) over");
					quit = true;
					break;
				case 1:
					//if it's actually going backward currently, but the user has selected to go next,
					//then we need to check whether we can go next
					if(!goingForward) {
						if(listIterator.hasNext()){
							listIterator.next();
						}
						goingForward = true;
					}
					//we are going to go to the next entry, the next city in our list
					if(listIterator.hasNext()) {
						System.out.println("Now visiting " + listIterator.next());
					} else {
						System.out.println("Reached the end of the list");
						goingForward = false;
					}
					break;
				case 2:
					//if it's actually going forward currently, but the user has selected to go previous,
					//then we need to check whether we can go previous
					if(goingForward) {
						if(listIterator.hasPrevious()) {
							listIterator.previous();
						}
						goingForward = false;
					}
					//we are going to the previous entry
					if(listIterator.hasPrevious()) {
						System.out.println("Now visiting " + listIterator.previous());
					} else {
						System.out.println("We are at the start of the list");
						goingForward = true;
					}
					break;
				case 3:
					printMenu();
					break;
			}
		}
	}

	private static void printMenu() {
		System.out.println("Available actions:\npress ");
		System.out.println("0 - to quit\n" +
				"1 - go to the next city\n" +
				"2 - go to previous city\n" +
				"3 - print menu options");
	}
}
