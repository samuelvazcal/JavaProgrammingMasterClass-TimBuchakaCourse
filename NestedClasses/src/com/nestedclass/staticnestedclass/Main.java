package com.nestedclass.staticnestedclass;

public class Main {

    public static void main(String[] args) {
        //accessing a static nested class
        OuterClass.StaticNestedClass nestedObject = new OuterClass.StaticNestedClass();
        nestedObject.display();
    }
}
