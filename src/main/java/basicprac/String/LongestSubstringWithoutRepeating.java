package basicprac.String;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String str) {
        int maxCount = 0;
        int i = 0;
        int j = 0;
        int length = str.length();
        Set<Character> set = new HashSet<>();
        while (i < length && j < length) {
            if (!set.contains(str.charAt(j))) {
                set.add(str.charAt(j));
                j++;
                maxCount = Math.max(maxCount,j-i);
            } else {
                set.remove(str.charAt(i));
                i++;

            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        String str = "pwwkew";
        int len = lengthOfLongestSubstring(str);
        System.out.println(len);
    }
}
