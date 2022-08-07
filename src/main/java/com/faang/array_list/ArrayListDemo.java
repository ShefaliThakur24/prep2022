package com.faang.array_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ArrayListDemo {

    public static void main(String[] args) {
        List<String> list = new ArrayList();//default constructor
        list.add("1");
        list.add("2");
        list.add("NAINA");

        System.out.println(list);
        /*Adding element at the end*/

        list.add("RUPAL");
        System.out.println(list);

        /*Adding element at the given  index*/// write your code here
        list.add(1,"5");
        System.out.println(list);

        List<String> newlist = new ArrayList();//Creating a new list which will be added to older list

        //Creating a parameterized Collection is very important. Without it, there can be serious errors

        List<String> list2 = new ArrayList<>();
        list2.add("12");
        list2.add("13");
        list2.add("12");
        list2.add(null);
        System.out.println(list2);

        newlist.add("andrew");
        newlist.add("shivam");
        System.out.println(newlist);


        //Adding new list to older list

        list.addAll(newlist);
        System.out.println(list);

        //Adding new list to older list at particular index

        list.addAll(3,newlist);
        System.out.println(list);

        //Fetching element from the arraylist

        System.out.println(list.get(1));

        //Fetching size of  the arraylist
        System.out.println(list.size());

        //Replacing element function replaceAll(UnaryOperator<E> operator).
        // The UnaryOperator interface is a
        // functional interface
        // that has a single abstract method, apply(),
        // that returns a result of the same object type as the operand.

        list.replaceAll((element) -> element.toLowerCase());
        System.out.println(list);
        newlist.replaceAll((element) -> element.toUpperCase());
        System.out.println(newlist);

        //Updating element in the list
        list.set(2,"8");
        System.out.println(list);

        //Checking if element present in the list
        if(list.contains("shivam"))
        {
            System.out.println("list contains Shivam");
        }

            System.out.println(list.indexOf("shivam"));
            System.out.println(list.lastIndexOf("andrew"));



        //Removing element from the list


        list.remove(2);
        System.out.println(list);
        newlist.remove(new String("150"));
        System.out.println(newlist);
        list.removeAll(list);
        System.out.println(list);
        list2.clear();
        System.out.println(list2);
    }
}
