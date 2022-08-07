package basicprac.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
//Java Program to Find Frequency of Each Character in a String if we want to maintain the frequency as per the occurencec we use
//linkedhashmap as it maintains the order.

public class CharacterCount {
    public static void main(String[] args) {
        String str = "Programming";
     //   Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (Character c : str.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }

        }
        System.out.println(map);
    }
}
