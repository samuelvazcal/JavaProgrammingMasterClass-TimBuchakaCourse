package com.samuelvazquez;

import java.util.Comparator;

/*
Comparator interface very useful for multiple comparisons
 */
public class OrderedPeopleByHeight implements Comparator<Person> {
	@Override
	public int compare(Person o1, Person o2) {
		return o1.getHeight() - o2.getHeight();
		//return a positive integer if o1's height is greater than o2's height
	}
}
