package revision.string;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringAnagram {


    public static boolean areAnagram(char[] str1, char[] str2) {
        int stringLength = str1.length;
        int stringLengt2 = str2.length;

        if (stringLength != stringLengt2) {
            return false;
        }

        Arrays.sort(str1);
        Arrays.sort(str2);

        for (int i = 0; i < stringLength; i++) {
            if (str1[i] != str2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean areAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str1.length(); i++) {
            if (map.containsKey(str1.charAt(i))) {
                map.put(str1.charAt(i), map.get(str1.charAt(i)) + 1);
            } else {
                map.put(str1.charAt(i), 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (map.containsKey(str2.charAt(i))) {
                map.put(str2.charAt(i), map.get(str2.charAt(i)) - 1);
            }
        }

        Set<Character> keys = map.keySet();
        for (Character key : keys) {
            if (map.get(key) != 0) {
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

        areAnagram(str1, str2);
        if(areAnagram(str3, str4)){
            System.out.println("Is Anagram");
        }

    }

}
