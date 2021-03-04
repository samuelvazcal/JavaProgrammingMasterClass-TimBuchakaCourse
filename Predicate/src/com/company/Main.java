package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        //creating a list of people
        List<Person> list = new ArrayList<>();
        Person p1 = new Person("Samuel",30);
        Person p2 = new Person("Andrea",28);
        Person p3 = new Person("Sofia",7);
        Person p4 = new Person("Angel",5);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        //printing list
        for (Person x : list) {
            System.out.println(x.getName());
        }

        //creating a predicate and its respective condition
        Predicate<Person> predicateName = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getName().startsWith("S");
            }
        };

        //using filter function and adding predicate
        System.out.println("*********************");
        list.stream().filter(predicateName).forEach(person -> System.out.println(person.getName()));
    }
}
