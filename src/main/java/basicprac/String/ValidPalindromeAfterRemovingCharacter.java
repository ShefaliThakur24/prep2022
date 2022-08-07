package basicprac.String;


public class ValidPalindromeAfterRemovingCharacter {


    public static boolean validPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return isPalindrome(str, start + 1, end) || isPalindrome(str, start, end - 1);
            }
            start++;
            end--;
        }
        return true;
    }


    private static boolean isPalindrome(String str, int start, int end) {
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public static void main(String[] args) {
        String str = "abca";
        boolean b = validPalindrome(str);
        System.out.println(b);
    }
}
