package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        Employee samuel = new Employee("Samuel V",30);
        Employee lana = new Employee("Andrea B", 28);
        Employee riley = new Employee("Sofia V",9);
        Employee emily = new Employee("Angel M", 7);
        Employee blair = new Employee("Maximiliano S", 5);
        Employee savannah = new Employee("Jeanne B", 16);

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

        IntPredicate greatThan15 = i -> i > 15;
        IntPredicate lessThan100 = i -> i < 100;
        //it will return false, because 10 isn't greater than 15
        System.out.println(greatThan15.test(10));
        int a = 20;
        System.out.println(greatThan15.test(a+5));
        //we can join predicates and preserve their original functionality
        System.out.println(greatThan15.and(lessThan100).test(50));
        System.out.println(greatThan15.and(lessThan100).test(15));

        //creating random number old school
        Random random = new Random();
//        for(int i= 0; i<10; i++) {
//            System.out.println(random.nextInt(10));
//        }

        //creating random number using a supplier
        Supplier<Integer> randomSupplier = () -> random.nextInt(100);
        for(int i=0; i<10;i++) {
            System.out.println(randomSupplier.get());
        }

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