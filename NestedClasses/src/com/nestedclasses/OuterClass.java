package com.nestedclasses;
/*accessing a static nested class*/

public class OuterClass {
    //static member
    static int outerX = 10;
    //instance (non-static) member
    int outerY = 20;
    //private member
    static int outerPrivate = 30;

    static class StaticNestedClass {
        void display() {
            //can access static member of outer class
            System.out.println("outerX: " + outerX);
            //can access display private static member of outer class
            System.out.println("outerPrivate: " + outerPrivate);
            //static nested class cannot access non-static members
            //uncomment line above will display error
            //System.out.println("outerY: " + outerY);
        }
    }
}
