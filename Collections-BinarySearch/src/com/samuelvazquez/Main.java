package com.samuelvazquez;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

        List<Integer> x = elementsArrayList(7);
        displayArrayList(x);



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
