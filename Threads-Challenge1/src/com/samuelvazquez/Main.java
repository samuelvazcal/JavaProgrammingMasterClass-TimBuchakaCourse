package com.samuelvazquez;

/*
We could have two people using a joint bank account at the same time.
Create and start threads that use the same BankAccount instance and an initial
balance of $1000.00. One will deposit $300.00 into the bank account, and then
withdraw $50.00. The other will deposit $203.75 and then withdraw $100.00
 */
public class Main {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345-678",1000.00);

        //There are two ways to start the threads, the first is to extend the thread class and
        //implement the run method, it wouldn't make sense to have the bank account class extend
        //thread because each transaction on a bank account will be different, if we wanna create the
        //threads by extending thread we use anonymous thread classes.
        //Create and start the threads here...
//        Thread t1 = new Thread(){
//            @Override
//            public void run() {
//                account.deposit(300.00);
//                account.withdraw(50.00);
//            }
//        };
//
//        Thread t2 = new Thread(){
//            @Override
//            public void run() {
//                account.deposit(203.75);
//                account.withdraw(100.00);
//            }
//        };
//
//        t1.start();
//        t2.start();

        //Second way is to create and  start threads to use the runnable interface

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(300.00);
                account.withdraw(50.00);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                account.deposit(203.75);
                account.withdraw(100.00);
            }
        });

        t1.start();
        t2.start();
    }

}
