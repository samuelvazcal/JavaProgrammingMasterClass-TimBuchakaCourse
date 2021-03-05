package com.samuelvazquez;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        List<Integer> x = elementsArrayList(10);
        System.out.println("list of random integers");
        displayArrayList(x);
        Collections.sort(x);
        System.out.println("\nsorted list: ");
        displayArrayList(x);
        //Returns index of key in sorted list sorted in ascending order
        //If key not present, it will return (-(insertion point) -1)
        int index = Collections.binarySearch(x,2);
        System.out.println("\n" + index);


    }

    public static List<Integer> elementsArrayList(int n) {
        List<Integer> arrayListRandom = new ArrayList<>(n);
        for(int i=0; i<n; i++) {
            Random random = new Random();
            Integer r = random.nextInt(10);
            arrayListRandom.add(r);
        }
        return arrayListRandom;
    }

    public static void displayArrayList(List<Integer> randomArray) {
        int n = randomArray.size();
        Iterator<Integer> i = randomArray.iterator();
        while(i.hasNext()) {
            System.out.print(i.next() + " ");
        }
    }

}
