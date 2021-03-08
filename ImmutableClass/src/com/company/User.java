package com.company;

import java.util.HashMap;
import java.util.Map;
//1. Class mut be declared final
public final class User {
    //2, 3. Data members declared as private and final
    private final String name;
    private final int id;
    private final Map<String, Integer> metadata;

    //4. Parametrized constructor initializing all the fields on deep copy
    //data members can’t be modified with object reference
    public User(String name, int id, Map<String, Integer> metadata) {
        this.name = name;
        this.id = id;
        Map<String, Integer> tempMap = new HashMap<>();
        for(Map.Entry<String,Integer> entry : metadata.entrySet()) {
            tempMap.put(entry.getKey(),entry.getValue());
        }
        this.metadata = tempMap;
    }

    //No setters

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    //5. Deep Copy of objects in getter methods
    //returns a copy rather than returning the actual object reference
    public Map<String, Integer> getMetadata() {
        Map<String,Integer> tempMap = new HashMap<>();
        for(Map.Entry<String, Integer> entry: this.metadata.entrySet()) {
            tempMap.put(entry.getKey(),entry.getValue());
        }
        return tempMap;
    }
}
