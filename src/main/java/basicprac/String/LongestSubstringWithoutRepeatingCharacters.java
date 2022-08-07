package basicprac.String;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0;
        for (int end = 0; end < str.length(); end++) {
            if (map.containsKey(str.charAt(end))) {
                start = Math.max(start, map.get(str.charAt(end)) + 1);
            }
            map.put(str.charAt(end), end);
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }


    public static void main(String[] args) {

        String str="pwwkew";
        System.out.println(lengthOfLongestSubstring(str));
    }

    }
