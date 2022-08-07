package com.faang.Hash_Map;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HighestStockPriceExer {

    public static void main(String[] args) {
        Map<String, Integer> stockPrice = new HashMap<>();

        stockPrice.put("Oracle", 56);
        stockPrice.put("Fiserv", 117);
        stockPrice.put("BMW", 73);
        stockPrice.put("Microsoft", 213);
        stockPrice.put("Google", 421);
        stockPrice.put("Ford", 456);
        stockPrice.put("Novartis", 43);
        stockPrice.put("TCS", 23);
//Find the highest stock price

        int max = 0;
        String company ="";

        for(Map.Entry<String, Integer> entry : stockPrice.entrySet())
        {
            if(entry.getValue() > max)
            {
                company=entry.getKey();
                max=entry.getValue();

            }
        }
        System.out.println("Company with max stock price is: " + company);

        //Find the average stock price

    Collection<Integer> values= stockPrice.values();
    int sum=0;
    for(int i : values)
    {
        sum= sum +i;

    }
        System.out.println(sum/ values.size());


      //  Remove companies with stock price below 50

    }
}
