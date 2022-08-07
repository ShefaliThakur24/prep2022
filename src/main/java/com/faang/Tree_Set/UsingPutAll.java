package com.faang.Tree_Set;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UsingPutAll {
    public static void main(String[] args) {
        TreeMap<String ,Integer> map = new TreeMap<>();
        map.put("Oracle", 43);
        map.put("Microsoft", 56);
        map.put("Apple", 76);
        map.put("Novartis", 87);
        System.out.println(map);


        TreeMap<String ,Integer> finalMap = new TreeMap<>();
        map.put("Google", 65);
        map.put("Audi", 32);
        finalMap.putAll(map);
        System.out.println(finalMap);

        //Fetching the first entry in the Map.

          Map.Entry<String ,Integer> firstEntry = map.firstEntry();
        System.out.println(map.firstKey());
        System.out.println("Smallest key: " + firstEntry.getKey() + ", Value: " + firstEntry.getValue());


        //Fetching the last entry in the Map.
        Map.Entry<String ,Integer> lastEntry  =map.lastEntry();
        System.out.println(map.lastKey());
        System.out.println("largest key: " + lastEntry.getKey() + ", Value: " + lastEntry.getValue());

        //Removing element

        System.out.println("Removing Oracle from Map. This will return the value corresponding to Oracle: " + map.remove("Oracle"));
        System.out.println("Removing Google from Map. This will return null as Google is not present in the Map: " + map.remove("numb"));


        System.out.println("Replacing the value of Oracle : " + map.replace("Oracle", 67));
        System.out.println("Latest value of Oracle : " + map.get("Oracle"));

        System.out.println("Replacing the value of Apple only if current value is 50 : " + map.replace("Apple", 50, 90));
        System.out.println("Latest value of Oracle : " + map.get("Apple"));

        System.out.println("Replacing the value of Apple only if current value is 76 : " + map.replace("Apple", 76, 90));
        System.out.println("Latest value of Oracle : " + map.get("Apple"));
        {

       }
    }
}
