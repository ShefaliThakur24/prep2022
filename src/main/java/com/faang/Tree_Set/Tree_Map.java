package com.faang.Tree_Set;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {

        // Creating a TreeMap which will store all the elements in reverse order.
        Map<String, Integer> map = new TreeMap<>(Comparator.reverseOrder());
        map.put("Oracle", 43);
        map.put("Microsoft", 56);
        map.put("Apple", 76);
        map.put("Novartis", 87);
        System.out.println("Elements are stored in reverse order: " + map);



        // Creating a HashMap which will store all the elements in random order.
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Oracle", 43);
        hashMap.put("Microsoft", 56);
        hashMap.put("Apple", 43);
        hashMap.put("Novartis", 87);

        System.out.println("Elements are stored in random order: " + hashMap);

        Map<String, Integer> treeMap1= new TreeMap<>(hashMap);
        //Using constructor with the argument of type Map#
        //A TreeMap can be created from another Map as well. The keys are stored in ascending order
        // irrespective of the order that the elements are stored in the provided Map.
        System.out.println("Elements are stored in ascending order: " + treeMap1);


        //		// Creating a TreeMap using existing TreeMap.
       // Using constructor with the argument of type SortedMap#
        //		This will store the elements in the same order as it was in the passed Map.
        Map<String, Integer> treeMap2 = new TreeMap<>(map);
        System.out.println("Elements are stored in descending order: " + treeMap2);


    }
}
