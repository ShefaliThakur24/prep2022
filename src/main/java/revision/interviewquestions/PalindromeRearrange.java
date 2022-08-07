package revision.interviewquestions;

import java.util.HashMap;
import java.util.Map;

public class PalindromeRearrange {


    public static boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    public static boolean palindromeRearranging(String str) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            } else
                map.put(str.charAt(i), 1);
        }
        int oddCount = 0;
        for (Character c : map.keySet()) {
            if (map.get(c) % 2 != 0) {
                oddCount++;
                if (oddCount == 2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return isPalindrome(s, i + 1, j) || isPalindrome(s, i, j - 1);

            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "abbcccda";
       // boolean result = palindromeRearranging(s);
        boolean resultKevin = validPalindrome(s);
       // System.out.println(result);
        System.out.println(resultKevin);
    }
}
