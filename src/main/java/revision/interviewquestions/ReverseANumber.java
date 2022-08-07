package revision.interviewquestions;


//run a loop till num is greater than zero.
//
//extract last digit using modulus operator (digit = num % 10)
//
//add last digit with sum * 10 to make number reverse (sum = (sum * 10) + digit)
//
//divide num by to 10 so that we can get new last digit.
public class ReverseANumber {

    public static int reverseAnum(int num) {
        int sum = 0;
        while (num != 0) {
            int lastDigit = num % 10;
            sum = (sum * 10) + lastDigit;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println(reverseAnum(num));

    }
}
