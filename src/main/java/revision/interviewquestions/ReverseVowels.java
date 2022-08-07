package revision.interviewquestions;

import java.util.Set;

public class ReverseVowels {

    public static String reverseVowelsString(String s) {
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        char[] charArr = s.toCharArray();
        int i = 0;
        int j = charArr.length - 1;
        while (i < j) {
            while (i < j && !vowels.contains(charArr[i])) {
                i++;
            }
            while (i < j && !vowels.contains(charArr[j])) {
                j--;
            }
            char temp = charArr[i];
            charArr[i++] = charArr[j];
            charArr[j--] = temp;

        }
        return new String(charArr);
    }

    public static void main(String[] args) {
        String s = "hello";
        String out=reverseVowelsString(s);
        System.out.println(out);
    }
}
