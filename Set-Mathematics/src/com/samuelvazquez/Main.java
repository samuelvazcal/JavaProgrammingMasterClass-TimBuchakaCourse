package com.samuelvazquez;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Main {

    public static void main(String[] args) {
        Integer[] A = {1, 7, 25, 10, 91, 93, 15};
        Integer[] B = {7, 25, 91, 93, 14,23,25};
        Set<Integer> set1 = new HashSet<Integer>();
        set1.addAll(Arrays.asList(A));
        Set<Integer> set2 = new HashSet<Integer>();
        set2.addAll(Arrays.asList(B));

        //Finding union of set1 and set2
        Set<Integer> union = new HashSet<Integer>(set1);
        union.addAll(set2);
        System.out.println("Union of set1 and set2 is: ");
        System.out.println(union);

        //Finding Intersection of set1 and set2
        Set<Integer> intersection = new HashSet<Integer>(set1);
        intersection.retainAll(set2);
        System.out.println("Intersection of set1 and set2 is: ");
        System.out.println(intersection);

        //Finding Difference of set1 and set2
        Set<Integer> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println("Difference of set1 and set2 is: ");
        System.out.println(difference);


    }
}
