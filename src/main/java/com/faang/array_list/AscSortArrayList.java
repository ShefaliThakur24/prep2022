package com.faang.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AscSortArrayList {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);
        System.out.println(list);
        //The Collections class contains a sort(List<T> list) method,
        // which is used to sort an ArrayList. This method
        // takes an ArrayList as input and sorts it in ascending order.
        //Collections.sort(List<T> t) method takes an ArrayList of type T objects as the input
        // It is a must that T should implement the Comparable interface; otherwise, the code will not compile.

     Collections.sort(list);
//        System.out.println(list);

        //Using Stream

      List<Integer>  sortedlist =  list.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedlist);

    }
}
