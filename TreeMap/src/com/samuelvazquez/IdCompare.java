package com.samuelvazquez;

import java.util.Comparator;


public class IdCompare implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b) {
		return  a.getId() - b.getId();
	}
}
