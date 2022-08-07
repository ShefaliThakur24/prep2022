package com.faang.Hash_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemoveBelowFifty {
    public static void main(String[] args) {
        Map<String ,Integer> map= new HashMap<>();
        map.put("Oracle", 56);
        map.put("Fiserv", 117);
        map.put("BMW", 73);
        map.put("Microsoft", 28);
        map.put("Google", 421);
        map.put("Ford", 456);
        map.put("Novartis", 43);
        map.put("TCS", 23);

     Iterator<Map.Entry<String ,Integer>> itr =  map.entrySet().iterator();
     while(itr.hasNext())
     {
         Map.Entry<String, Integer> entry=  itr.next();
         if(entry.getValue()<50)
         {
             itr.remove();
         }
     }
        System.out.println(map);
    }
}
