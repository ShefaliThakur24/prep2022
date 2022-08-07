package revision.interviewquestions;

public class NumberPalindrome {

    public static int reverse(int num) {
        int sum = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            sum = (sum * 10) + lastdigit;
            num = num / 10;
        }
        return sum;
    }

    public static boolean isPalindrome(int num) {
        int reverseNumber = reverse(num);
        return num == reverseNumber;
    }

    public static void main(String[] args) {
        int number = 121;
        System.out.println(isPalindrome(number));
    }
}
