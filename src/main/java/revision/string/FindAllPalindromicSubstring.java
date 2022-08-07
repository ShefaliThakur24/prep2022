package revision.string;

import java.util.ArrayList;
import java.util.List;


public class FindAllPalindromicSubstring {
    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {
            char ch1 = str.charAt(start);
            char ch2 = str.charAt(end);

            if (ch1 != ch2) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }


    public static List<String> findAllPalindromicSubstrings(String str) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String result = str.substring(i, j);
                if (isPalindrome(result) == true) ;
                list.add(result);
            }

        }
        return list;
    }

    public static void main(String[] args) {
        String[] inputstr = {"aabbbaa", "321230990", "educative"};
        for (String i : inputstr) {
            List<String> list = findAllPalindromicSubstrings(i);
            System.out.println(list);
        }
    }
}
