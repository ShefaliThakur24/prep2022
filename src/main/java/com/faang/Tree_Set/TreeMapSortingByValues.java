package com.faang.Tree_Set;

import com.sun.source.tree.Tree;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSortingByValues {

    public static TreeMap<String,Integer> sortByValues(Map<String, Integer> map) {
        //Comparator<String> valueComparator = new Comparator<String>()
           Comparator<String> valueComparator =(o1,o2)-> {
               // public int compare(String o1, String o2) {
               int comp = map.get(o1).compareTo(map.get(o2));
               if (comp == 0) {
                   return 1;
               } else {
                   return comp;
               }
        //   }
        };
        TreeMap<String,Integer> mapSortedByValues = new TreeMap<>(valueComparator);
        mapSortedByValues.putAll(map);
        return mapSortedByValues;


    }
        public static void main(String[] args) {
        Map<String,Integer>  map = new TreeMap<>();
        map.put("Oracle", 43);
        map.put("Microsoft", 56);
        map.put("Apple", 76);
        map.put("Novartis", 87);
       map.put("Google", 23);
       map.put("Audi", 101);

        System.out.println(sortByValues(map));
    }

}