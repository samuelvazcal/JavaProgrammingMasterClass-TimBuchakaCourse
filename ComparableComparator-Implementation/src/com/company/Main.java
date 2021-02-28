package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Movie> movieList = new ArrayList<>();
        movieList.add(new Movie("Movie 1",10,2015));
        movieList.add(new Movie("Movie 2",7,2016));
        movieList.add(new Movie("Movie 3",8,2017));
        movieList.add(new Movie("Movie 4",6,2018));
        movieList.add(new Movie("Movie 5",9,2019));

        System.out.println("Sorted by year using Comparable");
        Collections.sort(movieList);
        for(Movie x: movieList) {
            System.out.println(x.getYear() + " " + x.getName() + " " + x.getRating());
        }

        System.out.println("Sorted by name using Comparator:");
        NameCompare nameCompare = new NameCompare();
        Collections.sort(movieList,nameCompare);
        for(Movie x: movieList) {
            System.out.println(x.getYear() + " " + x.getName() + " " + x.getRating());
        }

        System.out.println("Sorted by rating using Comparator:");
        RatingCompare ratingCompare = new RatingCompare();
        Collections.sort(movieList,ratingCompare);
        for (Movie x: movieList) {
            System.out.println(x.getYear() + " " + x.getName() + " " + x.getRating());
        }
    }
}
