package basicprac.String;

import java.util.ArrayList;
import java.util.List;

//when we do reverse of string they both are same
//Find all palindromic string
public class StringPalindrome {

    public static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i <= j) {
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(j);

            if (ch1 != ch2) {
                return false;
            } else {
                i++;
                j--;
            }
        }

        return true;
    }

    public static List<String> findAllPalindromeSubstrings(String input) {
        List<String> palindrome = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String str = input.substring(i, j);
                    if (isPalindrome(str) == true) {
                    System.out.println(palindrome.add(str));
                }
            }
        }
        return palindrome;
    }

    public static void main(String args[]) {

        String[] inputstr = {"aabbbaa", "321230990", "educative"};
        for (String i : inputstr) {
            List<String> result = findAllPalindromeSubstrings(i);
            System.out.println(result);

        }

    }
}
