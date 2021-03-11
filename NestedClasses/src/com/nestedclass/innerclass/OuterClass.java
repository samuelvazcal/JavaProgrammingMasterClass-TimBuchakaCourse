package com.nestedclass.innerclass;
/*accessing a static nested class*/

public class OuterClass {
    //static member
    static int outerX = 10;

    //instance(non-static) member
    int outerY = 20;

    //private member
    private int outerPrivate = 30;

    class InnerClass {
        void display() {
            //can access static member of outer class
            System.out.println("outerX: " + outerX);

            //can also access non-static member of outer class
            System.out.println("outerY: " + outerY);

            //can also access a private member of the outer class
            System.out.println("outerPrivate: " + outerPrivate);
        }
    }
}
