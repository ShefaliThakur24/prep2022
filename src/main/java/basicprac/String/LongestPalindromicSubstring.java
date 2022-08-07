package basicprac.String;

public class LongestPalindromicSubstring {

    int resultStart;
    int resultLength;

    public String longestPalindrome(String s) {
        int length = s.length();
        if (length < 2) {
            return s;
        }
        for (int start = 0; start < length - 1; start++) {
            expandRange(s, start, start);
            expandRange(s, start, start + 1);
        }
        return s.substring(resultStart, resultStart + resultLength);
    }

    private void expandRange(String s, int begin, int end) {
        while (begin >= 0 && end <= s.length() && s.charAt(begin) == s.charAt(end)) {
            begin--;
            end++;
        }

        if (resultLength < end - begin - 1) {
            resultStart = begin + 1;
            resultLength = end - begin - 1;
        }
    }

    public static void main(String[] args) {
        String str = "forgeeksskeegfor";
        LongestPalindromicSubstring lbs= new LongestPalindromicSubstring();
        String result = lbs.longestPalindrome(str);
        System.out.println("Length is " + result);
    }

}
