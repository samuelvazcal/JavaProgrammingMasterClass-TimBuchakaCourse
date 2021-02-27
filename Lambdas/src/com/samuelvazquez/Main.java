package com.samuelvazquez;

import java.util.ArrayList;
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
