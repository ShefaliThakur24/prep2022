package com.faang.Tree_Set;

import java.sql.SQLOutput;
import java.util.*;

public class HashMapSorting {

    public static void main(String[] args) {
        //Using a TreeMap

        Map<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(123, "Alex");
        employeeMap.put(342, "Ryan");
        employeeMap.put(143, "Joe");
        employeeMap.put(234, "Allen");
        employeeMap.put(432, "Roy");

        System.out.println(employeeMap);

//        Map<Integer, String> map = new TreeMap<>();
//        map.putAll(employeeMap);
//        System.out.println(map);

        //Using an ArrayList

//        List<Integer> keyList = new ArrayList<>(employeeMap.keySet());
//        Collections.sort(keyList);
//        System.out.println(keyList);
//        List<String> valuesList = new ArrayList<>(employeeMap.values());
//        Collections.sort(valuesList);
//        System.out.println(valuesList);

        //Using lambdas and streams#

        System.out.println("Sorting by key Using lambdas and streams");
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        System.out.println("Sorting by values Using lambdas and streams");
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

    }
}
