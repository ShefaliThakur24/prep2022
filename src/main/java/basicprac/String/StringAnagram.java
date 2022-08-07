package basicprac.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class StringAnagram {
    //Using Sorting
    //Sort both strings
    //Compare the sorted strings

    //time complexity O(n)
    static boolean areAnagramHashing(String str1, String str2) {
        // Check if length of both strings is same or not
        if (str1.length() != str2.length()) {
            return false;
        }
        // Create a HashMap containing Character as Key and
        // Integer as Value. We will be storing character as
        // Key and count of character as Value.
        HashMap<Character, Integer> map = new HashMap<>();
        // Loop over all character of String a and put in
        // HashMap.
        for (int i = 0; i < str1.length(); i++) {
            // Check if HashMap already contain current
            // character or not
            if (map.containsKey(str1.charAt(i))) {
                // If contains increase count by 1 for that
                // character
                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
            } else {
                // else put that character in map and set
                // count to 1 as character is encountered
                // first time
                map.put(str1.charAt(i), 1);
            }
        }
// Now loop over String b
        for (int i = 0; i < str2.length(); i++) {
            if (map.containsKey(str2.charAt(i))) {
                // If contains reduce count of that
                // character by 1 to indicate that current
                // character has been already counted as
                // idea here is to check if in last count of
                // all characters in last is zero which
                // means all characters in String a are
                // present in String b.
                map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
            }
        }

        // Extract all keys of HashMap/map

        //Set<Character> keys = map.keySet();
        // Loop over all keys and check if all keys are 0.
        // If so it means it is anagram.
        for (Character key : map.keySet()) {
            {
                if (map.get(key) != 0) {
                    return false;
                }
            }
        }

        return true;
    }


    //time complexity O(nlogn)
    static boolean areAnagram(char[] str1, char[] str2) {
        int n1 = str1.length;
        int n2 = str2.length;

        if (n1 != n2) {
            return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);

        //COMPARE SORTED strings

        for (int i = 0; i < n1; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        char str1[] = {'t', 'e', 's', 't'};
        char str2[] = {'t', 't', 'e', 'w'};


        String str3 = "geeksforgeeks";
        String str4 = "forgeeksgeeks";

        if (areAnagram(str1, str2)) {
            System.out.println("The two strings are"
                    + " anagram of each other");
        } else {
            System.out.println("The two strings are not"
                    + " anagram of each other");
        }

        if (areAnagramHashing(str3, str4)) {
            System.out.println("The two strings are"
                    + " anagram of each other");
        } else {
            System.out.println("The two strings are not"
                    + " anagram of each other");
        }
    }
}
