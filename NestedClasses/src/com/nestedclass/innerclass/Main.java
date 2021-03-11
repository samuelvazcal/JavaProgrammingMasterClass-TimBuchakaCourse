package com.nestedclass.innerclass;

public class Main {
    public static void main(String[] args) {
        //accessing an inner class
        //first instantiate the outer class, then create the inner object
        //within the outer object
        OuterClass outerObject = new OuterClass();
        OuterClass.InnerClass innerObject = outerObject.new InnerClass();
        innerObject.display();
    }
}
