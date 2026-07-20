package org.example.LLD.Comparables_interface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Formattable;
import java.util.List;

public class Client {
    public static void main(String args[]){
        List<Employee> employees = new ArrayList<>();

        Employee e1 = new Employee(4, "Pratik", 100000);
        employees.add(e1);
        Employee e2 = new Employee(1, "Nikita", 60000);
        employees.add(e2);
        Employee e3 = new Employee(3, "Rohit", 40000);
        employees.add(e3);
        Employee e4 = new Employee(2, "Mohit", 30000);
        employees.add(e4);

        // before
        System.out.println("----------------BEFORE--------------");
        for (Employee e: employees){
            System.out.println(e);
        }

        // use compareTo
        Collections.sort(employees);
        System.out.println("---------------After-----------------");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
