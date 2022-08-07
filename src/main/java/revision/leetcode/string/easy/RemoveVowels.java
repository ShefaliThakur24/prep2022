package revision.leetcode.string.easy;

import java.util.Set;

public class RemoveVowels {
    public static void main(String[] args) {
        String s = "leetcodeisacommunityforcoders";
        String output = removeVowels(s);
        System.out.println(output);
    }

    public static String removeVowels(String s) {

        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        StringBuilder sb = new StringBuilder();

        char[] chArr = s.toCharArray();

        for (Character ch : chArr) {
            if (!vowels.contains(ch)) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

