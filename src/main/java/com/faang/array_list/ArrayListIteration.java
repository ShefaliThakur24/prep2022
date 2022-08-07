package com.faang.array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListIteration {
    public static void main(String[] args) {
        List <String> list1 = new ArrayList();
        list1.add("naina");
        list1.add("shubham");
        list1.add("peter");
        list1.add("mark");
        list1.add("luke");
        list1.add("11");
       // System.out.println(list1);

        //iterating  arraylist through simple for loop
//      for(int i=0;i<list1.size();i++)
//        {
//            System.out.println(list1.get(i));
//        }
//
//        //  //iterating  arraylist through  foreach loop
//
//        for(String i : list1)
//        {
//            System.out.println(i);
//        }

        //Iterating arraylist through iterator

        Iterator<String> iterator = list1.iterator();
//If an element is added to
// the ArrayList after the iterator is created t
// hen also ConcurrentModificationException will be thrown.

        list1.add("raheem");

while(iterator.hasNext())
{
   String next = iterator.next();

    System.out.println(next);
    if(next == "mark")
    {
     //   list1.remove("mark");  //Exception in thread "main" java.util.ConcurrentModificationException
        iterator.remove();

    }

}

        System.out.println(list1);
//Iterating using ForEachRemaining() method
//        System.out.println("Iterating using forEachRemaining() method");
//Iterator<String> itr = list1.iterator();
//itr.forEachRemaining(element -> System.out.println(element));
//
//


    }

}
