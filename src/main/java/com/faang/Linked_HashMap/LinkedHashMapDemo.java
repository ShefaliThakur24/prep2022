package com.faang.Linked_HashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        //Map<String, Integer> stocks = new LinkedHashMap<>();
        //Using the constructor that takes access order flag
        HashMap<String, Integer> stocks = new LinkedHashMap<>(16,0.75f,true);
        stocks.put("Apple", 123);
        stocks.put("BMW", 54);
        stocks.put("Google", 87);
        stocks.put("Microsoft", 232);
        stocks.put("Oracle", 76);

        System.out.println(stocks);

        stocks.get("BMW");
        stocks.get("Google");
        System.out.println(stocks);

    }
}
