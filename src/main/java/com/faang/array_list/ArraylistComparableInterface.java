package com.faang.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class ArraylistComparableInterface {

    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Deepesh", 40, "USA"));
        list.add(new Employee("Shefali", 16, "MEXICO"));
        System.out.println(list);
       //Asc
        Collections.sort(list);
        System.out.println(list);

        List<Vehicle> list2 = new ArrayList<>();
        list2.add(new Vehicle("Audi", 2013));
        list2.add(new Vehicle("bmw",2018));
        System.out.println(list2);
        //Desc
        Collections.sort(list2,Comparator.reverseOrder());
        System.out.println(list2);


    }
}


