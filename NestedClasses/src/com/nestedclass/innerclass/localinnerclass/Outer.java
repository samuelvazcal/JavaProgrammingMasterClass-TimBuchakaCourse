package com.nestedclass.innerclass.localinnerclass;
/* Illustrates how a local inner class works*/
public class Outer {
    private void getValue() {
        //this sentence will work only in JDK8 and later
        int sum = 20;
        //Local inner class inside method
        class Inner {
            public int divisor;
            public int remainder;

            public Inner() {
                divisor = 4;
                remainder = sum%divisor;
            }
            private int getDivisor() {
                return divisor;
            }
            private int getRemainder() {
                return sum%divisor;
            }
            private int getQuotient() {
                System.out.println("Inside inner class");
                return sum / divisor;
            }
        }
        Inner inner = new Inner();
        System.out.println("Divisor = "+ inner.getDivisor());
        System.out.println("Remainder = " + inner.getRemainder());
        System.out.println("Quotient = " + inner.getQuotient());
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.getValue();
    }

}
