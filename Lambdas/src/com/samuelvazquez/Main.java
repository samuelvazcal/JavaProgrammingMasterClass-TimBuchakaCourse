package com.samuelvazquez;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {

    public static void main(String[] args) {
        new Thread(()-> {
            System.out.println("Printing from the Runnable via lambda expression");
            System.out.println("Line 2");
            System.out.println("And this is Line 3");
        }).start();

        Employee samuel = new Employee("Samuel V",30);
        Employee lana = new Employee("Lana R", 24);
        Employee riley = new Employee("Riley R",29);
        Employee emily = new Employee("Emily W", 22);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(samuel);
        employeeList.add(lana);
        employeeList.add(riley);
        employeeList.add(emily);

        //let's sort the employees by name in ascending order and print results
//        System.out.println("\nSorting by name: ");
//        Collections.sort(employeeList, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                return e1.getName().compareTo(e2.getName());
//            }
//        });

        //let's actually change the code to use a lambda expression
        System.out.println("\nSorting by name using lambda exp: ");
        Collections.sort(employeeList,
                (employee1, employee2) -> employee1.getName().compareTo(employee2.getName()));

        for (Employee x : employeeList) {
            System.out.println(x.getName());
        }

        //interface implementation, first look for fill the doStringStuff parameters and then
        //then goes to the rabbit hole (build 'uc', the UpperConcat reference)
//Z        String sillyString = doStringStuff(new UpperConcat() {
//            @Override
//A            public String upperAndConcat(String s1, String s2) {
//B                //here is where we do the string process to upper case
//C                return s1.toUpperCase() + s2.toUpperCase();
//D            }
//        }, employeeList.get(0).getName(),employeeList.get(1).getName());
//        System.out.println(sillyString);

        //same algorithm, different implementation, now via lambda exp.
        //Lines A, B, C, D
        //creates UpperConcat instance implementing the interface
        UpperConcat uc = (s1, s2) -> {
            String result = s1.toUpperCase() + s2.toUpperCase();
            return result;
        };
        //Line Z
        String sillyString = doStringStuff(uc,employeeList.get(0).getName(),employeeList.get(1).getName());
        System.out.println(sillyString);

        AnotherClass anotherClass = new AnotherClass();
        String s = anotherClass.doSomething();
        System.out.println(s);
    }

    //static method that uses an UpperConcat "instance" to create new string.
    //Being static can be used inside static methods
    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndConcat(s1,s2);
    }
}

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    public String upperAndConcat(String s1, String s2);
}

class AnotherClass {
    public String doSomething(){
        return Main.doStringStuff(new UpperConcat() {
            @Override
            public String upperAndConcat(String s1, String s2) {
                return s1.toUpperCase() + s2.toUpperCase();
            }
        },"String1","String2");
    }
}



