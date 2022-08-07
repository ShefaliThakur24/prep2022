package revision.string;

public class SubstringCountInString {

    public static void main(String[] args) {
        String s = "abcdabcccabc";
        String str = "abc";
        int count = 0;

        int length = s.length();

        for (int i = 0; i <= length - str.length(); i++) {
            String substr = s.substring(i, i + str.length());
            if (substr.equals(str)) {
            count++;

        }

    }
        System.out.println(count);
}}
