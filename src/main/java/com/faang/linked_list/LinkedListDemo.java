package com.faang.linked_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1); // Adds 1 to the list.
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);// Adds 2 to the end of the list.
        list.addLast(3);// Adds 3 to the end of the list.
        System.out.println(list);


        list.addFirst(10) ; // Adds 10 to the start of the list.
        System.out.println(list);

        list.add(2,20);// Adds 20 to second position in the list.
        System.out.println(list);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(101);
        list2.add(102);
        list2.add(103);
        System.out.println(list2);


        list.addAll(3,list2);
        System.out.println(list);

        //Fetching the first element.

        System.out.println(list.getFirst());


        System.out.println(list);

        //sFetching the last element.
        System.out.println(list.getLast());
        System.out.println(list);
//Fetching the element at second index.
        System.out.println(list.get(2));

        System.out.println(list.remove(5));
        System.out.println(list);

        System.out.println(list.removeFirst());
       ;

        System.out.println(list.removeLast());


        System.out.println(list.removeFirstOccurrence(5));
        System.out.println(list);


        System.out.println(list.removeLastOccurrence(1));
        System.out.println(list);


        Collections.sort(list);
        System.out.println(list);


    }
}
