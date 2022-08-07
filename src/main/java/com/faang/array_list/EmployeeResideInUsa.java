package com.faang.array_list;

import java.util.*;

public class EmployeeResideInUsa {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Alex", 23, "USA"));
        list.add(new Employee("Dave", 34, "India"));
        list.add(new Employee("Carl", 21, "USA"));
        list.add(new Employee("Joe", 56, "Russia"));
        list.add(new Employee("Amit", 64, "China"));
        list.add(new Employee("Ryan", 19, "Brazil"));


        System.out.println(list);
        System.out.println("Removing the employees residing in USA from the List");
        Iterator<Employee> itr = list.iterator();
        while (itr.hasNext()) {
            if (itr.next().country.equals("USA")) {
                itr.remove();
            }

        }

        for (Employee emp : list) {
            System.out.println("Employee Name: " + emp.name + ", Employee Country: " + emp.country);
        }

        //Sort all the employees by country name.
        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.country.compareTo(o2.country);
            }
        });

        for (Employee emp : list) {
            System.out.println("Employee Name: " + emp.name + ", Employee Country: " + emp.country);
        }

    }
}
