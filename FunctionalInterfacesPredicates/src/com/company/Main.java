package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee samuel = new Employee("Samuel V",30);
        Employee lana = new Employee("Lana R", 24);
        Employee riley = new Employee("Riley R",29);
        Employee emily = new Employee("Emily W", 22);
        Employee blair = new Employee("Blair W", 28);
        Employee savannah = new Employee("Savannah S", 23);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(samuel);
        employeeList.add(lana);
        employeeList.add(riley);
        employeeList.add(emily);
        employeeList.add(blair);
        employeeList.add(savannah);

        System.out.println("Employees over 25 via lambdas");
        employeeList.forEach(employee -> {
            if(employee.getAge()>25) {
                System.out.println(employee.getName());
            }
        });

        System.out.println("Employees under 25 via lambdas");
        employeeList.forEach(employee -> {
            if(employee.getAge()<25) {
                System.out.println(employee.getName());
            }
        });

//        System.out.println("Employees over 25 before lambdas: ");
//        System.out.println("===========");
//        for(Employee employee: employeeList) {
//            if(employee.getAge() > 25) {
//                System.out.println(employee.getName());
//            }
//        }

        //using foreach iterable
        //System.out.println("foreach:");
//        employeeList.forEach(employee -> {
//            System.out.println(employee.getName());
//            System.out.println(employee.getAge());
//        });
    }

    private static void printEmployeesByAge(List<Employee> employees) {
        //lambda expression for the above method
        System.out.println("Employees over 25 via lambdas");
        employeeList.forEach(employee -> {
            if(employee.getAge()>25) {
                System.out.println(employee.getName());
            }
        });

    }
}