package com.faang.Hash_Map;

import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;


public class HashMapIteration {
    public static void main(String[] args) {
        Map<String ,Integer> map = new HashMap<>();
        map.put("Oracle", 56);
        map.put("Fiserv", 117);
        map.put("BMW", 73);
        map.put("Microsoft", 213);

        //Iterating using for loop
        // Returns a Set of Entries
      Set<Entry<String ,Integer>> entrySet = map.entrySet();// Returns a Set of Entries
        for(Map.Entry<String ,Integer> entry : entrySet)
        {
        System.out.println("key ::" + entry.getKey() + "value ::" + entry.getValue());
        }

        //Iterating using iterator
        Iterator<Entry<String ,Integer>> itr =entrySet.iterator();
        while (itr.hasNext())
        {
       Entry<String,Integer> entry =  itr.next();

            System.out.println("key ::" + entry.getKey() + "value ::" + entry.getValue());

            if(entry.getKey().equals("Fiserv"))
            {
                itr.remove();

            }

        }
        //Using for each bi consumer method
        System.out.println(map);

        map.forEach((key, value)-> System.out.println("Company Name " + key + "stockprice " + value ));

    }
}
