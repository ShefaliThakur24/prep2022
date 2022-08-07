package com.faang.Hash_Map;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;


//We already know that the HashMap stores key-value pairs. HashMap has a nested static class called Node as shown below.
//static class Node<K,V> implements Map.Entry<K,V> {
//        final int hash;
//        final K key;
//        V value;
//        Node<K,V> next;


//
public class HashMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> stockprice = new HashMap<>();
        stockprice.put("Oracle", 56);
        stockprice.put("Fiserv", 117);
        stockprice.put("BMW", 73);
        stockprice.put("Microsoft", 213);
        stockprice.put("Oracle", 60); //Inserting share price of Oracle again. This will update the value.


        stockprice.putIfAbsent("Oracle", 70); //Inserting share price of Oracle again
        // using putIfAbsent() method. This will not update the value.

        System.out.println(stockprice.get("audi"));
        //The get(Object key) method takes a key as a
        // parameter and returns the value corresponding
        // to that key. If the key is not present, it returns null.

        System.out.println(stockprice.getOrDefault("Oracle",22));

        //replacing

        // This will not replace the value of Oracle because current value is not 70.

        System.out.println(stockprice.replace("Oracle",70,78));


        // This will replace the value of Oracle because current value is 56.
        System.out.println(stockprice.replace("Oracle",60,78));
        System.out.println(stockprice.get("Oracle"));

// This will replace the value of Fiserv as current value does not matter.
        stockprice.replace("Fiserv", 100);
        System.out.println(stockprice.get("Fiserv"));

        stockprice.replaceAll((k,v)->v+10);
        System.out.println(stockprice);

        //Removing an element from a HashMap

        //This will remove Oracle from the Map and return 60.
        System.out.println(stockprice.remove("Oracle"));

        //This will return null as Google is not present in the Map.
        System.out.println(stockprice.remove("Google"));
//        System.out.println(stockprice.remove("Fiserv"));
//        System.out.println(stockprice.remove("Microsoft"));

        //This will return false because the value passed does not match the value of BMW in the Map.
        System.out.println(stockprice.remove("BMW", 83));
        System.out.println(stockprice.containsKey("Microsoft"));
        System.out.println(stockprice.containsValue(110));
        System.out.println(stockprice.keySet());
        System.out.println(stockprice.values());
        System.out.println(stockprice.isEmpty());

        Map<String,Integer> hm = new HashMap();
        hm.put("Amit",100);
        hm.put("Vijay",101);
        hm.put("Rahul",102);
        for(Map.Entry entry :hm.entrySet())
        {
            System.out.println("key :" + entry.getKey() + "value :" + entry.getValue());
        }
        stockprice.putAll(hm);

        for(Map.Entry entry2 : stockprice.entrySet())
        {
            System.out.println("key:" + entry2.getKey() +"value:" +entry2.getValue());
        }



    }
}
