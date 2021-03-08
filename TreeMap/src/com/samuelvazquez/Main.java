package com.samuelvazquez;

import java.util.TreeMap;


public class Main {
	public static void main(String[] args) {
		//Comparing by id
		TreeMap<Student,Integer> treeMap1 = new TreeMap<>(new IdCompare());
		treeMap1.put(new Student(111,"Samuel"),2);
		treeMap1.put(new Student(222,"Andrea"),1);
		treeMap1.put(new Student(333,"Sofia"),3);
		treeMap1.put(new Student(4444,"Angel"),4);

		//Comparing by name
		TreeMap<Student,Integer> treeMap2 = new TreeMap<>(new NameCompare());
		treeMap2.put(new Student(6666,"Yyyy"),4);
		treeMap2.put(new Student(6666,"Xxxx"),3);
		treeMap2.put(new Student(8888,"Wwwww"),1);
		treeMap2.put(new Student(7777,"Zzzz"),2);
		System.out.println(treeMap1);
		System.out.println(treeMap2);


	}
}
