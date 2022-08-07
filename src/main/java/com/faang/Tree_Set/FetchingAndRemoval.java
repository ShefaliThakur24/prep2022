package com.faang.Tree_Set;

import java.util.Set;
import java.util.TreeSet;

public class FetchingAndRemoval {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(21);
        set.add(32);
        set.add(44);
        set.add(11);
        set.add(54);
        set.add(3);
        set.add(9);
        set.add(41);
        System.out.println(set);


        System.out.println("Fetching the first element in TreeSet " +set.first());
        System.out.println("Fetching the last element in TreeSet " +set.last());
        System.out.println(set.headSet(54));
        System.out.println(set.tailSet(54));

        System.out.println(set.remove(54));
        System.out.println(set);

        System.out.println( set.isEmpty());
        System.out.println(  set.size());
        System.out.println( set.contains(44));


    }
}
