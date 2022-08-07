package com.faang.Tree_Set;

import java.util.TreeSet;

public class NumberGreaterFifty {
    public static void main(String[] args) {
        int[] numbers = {1,4,5,2,34,66,5,4,33,45,6,8,56,76,78,98,34,37,12,12,23,43,54,56};

        TreeSet<Integer> set = new TreeSet<>();

        for(int num : numbers)
        {
            set.add(num);

        }
        System.out.println(set.tailSet(50));
        System.out.println("Smallest element " + set.first());
        System.out.println("Largest element " + set.last());

        //
    }
}
