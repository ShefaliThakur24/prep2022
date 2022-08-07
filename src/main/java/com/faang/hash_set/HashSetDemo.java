package com.faang.hash_set;

import java.util.*;

public class HashSetDemo {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(23);
        set.add(34);
        set.add(23);
        set.add(56);
//        set.add(null);
//        set.add(null);

        System.out.println(set);

        //fetching an element from a Hashset

        System.out.println(set.contains(23));
      //  System.out.println(set);

        //Removing an element from a hashset
        //We can use the remove(Object o) method to remove an element from HashSet.

       // set.remove(23);
       // System.out.println(set);
        //We can use the clear() method to remove all the elements from a HashSet.
      //  set.clear();
        //System.out.println(set);
        //checking if hashset is empty

        set.isEmpty();
        //System.out.println(set);

        //Iterating hashset

       // 1.Using enhanced for loop

//        for(int i :set)
//        {
//            System.out.println(i);
//        }


        //2.Using iterator

//        Iterator<Integer> itr = set.iterator();
//
//        while(itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }


       //3. Using forEach() method forEach(Consumer<? super T> action) method defined in the Iterable class

       // set.forEach(System.out::println );

        //Sorting A Hashset

         List<Integer> list = new ArrayList<>(set);
         Collections.sort(list);
        //System.out.println(list);
         list.forEach(System.out::println);
    }
}
