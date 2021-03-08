package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<User>();
        userList.add(new User("Samuel"));
        userList.add(new User("Andrea"));
        userList.add(new User("Sofia"));
        userList.add(new User("Angel"));
        printList(userList);

        List<Athlete> athleteList = new ArrayList<Athlete>();
        athleteList.add(new Athlete("Subject1","Soccer"));
        athleteList.add(new Athlete("Subject2","Volleyball"));
        athleteList.add(new Athlete("Subject3","Swimming"));
        athleteList.add(new Athlete("Subject4","American Football"));
        printList(athleteList);
    }

    //upper bounded wildcard extending User
    public static void printList(List<? extends User> list) {
        for (User x: list) {
            System.out.println(x.getName());
        }
        System.out.println();
    }
}
