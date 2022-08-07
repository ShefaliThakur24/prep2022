package com.faang.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DescSortArrayList {


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(12);
        list.add(9);
        list.add(76);
        list.add(29);
        list.add(75);

        //There is another overloaded version of the sort() method, i.e.,
        // sort(List<T> list, Comparator<? super T> c),
        // which takes a List and Comparator object as the input.
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        //using stream

//      List<Integer> list2=  list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
//        System.out.println(list2);

    }
}
