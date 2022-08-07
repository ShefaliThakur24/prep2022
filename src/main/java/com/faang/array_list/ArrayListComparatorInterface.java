package com.faang.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListComparatorInterface {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<>();
        list.add(new Vehicle("Volkswagen", 2010));
        list.add(new Vehicle("Audi", 2009));
        list.add(new Vehicle("Ford", 2001));
        list.add(new Vehicle("BMW", 2015));
        System.out.println(list);

        System.out.println("Sorting by brand name.");
        Collections.sort(list,new BrandComparator());
        for(Vehicle vehicle : list)
        {
            System.out.println("Vehicle Brand: " + vehicle.brand + ", Vehicle Make: " + vehicle.makingYear);
        }

        System.out.println("Sorting by making year.");
        Collections.sort(list,new MakeYearComparator());
        for(Vehicle vehicle : list)
        {
            System.out.println("Vehicle Brand: " + vehicle.brand + ", Vehicle Make: " + vehicle.makingYear);
        }

    }
}
