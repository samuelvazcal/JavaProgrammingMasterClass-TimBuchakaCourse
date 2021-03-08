package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("1",7012021);
        map.put("2",25102021);
        User user = new User("Samuel",777,map);
        System.out.println(user.getName());
        System.out.println(user.getId());
        System.out.println(user.getMetadata());

        //Uncommenting below code line cause error because id is private
        //user.id = 888;

        map.put("3",12302022);
        //Keep original info, due deep copy in constructor
        System.out.println(user.getMetadata());

        user.getMetadata().put("4",6162022);
        //Remains unchanged due to deep copy in getter method
        System.out.println(user.getMetadata());
    }
}
