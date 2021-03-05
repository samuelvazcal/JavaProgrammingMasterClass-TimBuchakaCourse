package com.samuelvazquez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class BinarySearchUserObjects {
	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		list.add(new User(7,"Samuel V"));
		list.add(new User(25,"Andrea B"));
		list.add(new User(10,"Sofia V"));
		list.add(new User(20,"Angel V"));

		Comparator<User> comparator = new Comparator<User>() {
			public int compare(User user1, User user2) {
				return user1.getId().compareTo(user2.getId());
			}
		};

		Collections.sort(list,comparator);


		//Searching a domain with key value 10. To search we create
		//an object of domain with key 10
		int index = Collections.binarySearch(list,new User(10,null),comparator);
		System.out.println("Found at index " + index);
	}

}

class User {
	private int id;
	private String name;

	//Constructor
	public User(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}
}
