package basicprac.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacter {
    public static void printDuplicates(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);

            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);

            } else {
                map.put(ch, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            if ((int) entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }

        }

    }

    public static void printDuplicatesUsingSet(String str) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (set.contains(ch)) {
                System.out.println(ch);
            } else {
                set.add(ch);
            }

        }

    }


    public static void main(String args[]) {
        String str = "Programming";
        printDuplicates(str);
      //  printDuplicatesUsingSet(str);

    }
}

