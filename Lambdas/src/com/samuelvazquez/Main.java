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

//        String sillyString = doStringStuff(new UpperConcat() {
//            @Override
//            public String upperAndContact(String s1, String s2) {
//                return s1.toUpperCase() + s2.toUpperCase();
//            }
//        },
//        employeeList.get(0).getName(),employeeList.get(1).getName());
//        System.out.println(sillyString);

        UpperConcat uc = (s1, s2) -> s1.toUpperCase() + s2.toUpperCase();

    }

    //static method that uses an UpperConcat instance to create new string
    public final static String doStringStuff(UpperConcat uc, String s1, String s2) {
        return uc.upperAndContact(s1,s2);
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
    public String upperAndContact(String s1, String s2);
}


