package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Employee samuel = new Employee("Samuel V",30);
        Employee lana = new Employee("Andrea B", 28);
        Employee riley = new Employee("Sofia V",9);
        Employee emily = new Employee("Angel M", 7);
        Employee blair = new Employee("Maximiliano S", 5);
        Employee savannah = new Employee("Miriam V", 3);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(samuel);
        employeeList.add(lana);
        employeeList.add(riley);
        employeeList.add(emily);
        employeeList.add(blair);
        employeeList.add(savannah);

        printEmployeesByAge(employeeList,"Employees over 25",employee -> employee.getAge()>25);
        printEmployeesByAge(employeeList,"\nEmployees under 25",employee -> employee.getAge()<25);
        printEmployeesByAge(employeeList, "\nEmployees under 10", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge()<10;
            }
        });
    }

    private static void printEmployeesByAge(List<Employee> employees,String ageText,
                                            Predicate<Employee> ageCondition) {
        //lambda expression for the above method
        System.out.println(ageText);
        System.out.println("============");
        for (Employee employee : employees) {
            if (ageCondition.test(employee)) {
                System.out.println(employee.getName());
            }
        }
    }
}