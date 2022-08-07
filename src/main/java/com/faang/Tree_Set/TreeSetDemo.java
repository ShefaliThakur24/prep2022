package com.faang.Tree_Set;

import java.util.*;

public class TreeSetDemo {
//Creating a TreeSet#

    //Using a constructor with a Collection type argument#
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(21);
        list.add(32);
        list.add(44);
        list.add(11);
        list.add(54);

        System.out.println(list);
        Set<Integer> set = new TreeSet<>(list);
        set.addAll(list);
       // System.out.println(set);

        // This TreeSet will store the elements in reverse order.

        Set<Integer> reverseSet = new TreeSet<>(Comparator.reverseOrder());
        reverseSet.add(21);
        reverseSet.add(32);
        reverseSet.add(44);
        reverseSet.add(11);
        reverseSet.add(54);
        reverseSet.add(21);
        reverseSet.add(32);
        reverseSet.add(44);
        reverseSet.add(11);
        reverseSet.add(54);
        reverseSet.add(3);
        reverseSet.add(9);
        reverseSet.add(41);
        System.out.println("TreeSet elements in descending order " + reverseSet);
        System.out.println("Fetching the first element in TreeSet " +reverseSet);




    }
}
