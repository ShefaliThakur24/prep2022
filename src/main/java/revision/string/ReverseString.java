package revision.string;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

    public static String reverseStringUsingTemp(String str) {
        char ch[] = str.toCharArray();
        int low = 0;
        int high = ch.length - 1;
        while (low < high) {
            char temp = ch[low];
            ch[low] = ch[high];
            ch[high] = temp;
            low++;
            high--;


        }
        return new String(ch);
    }

    public static void reverseStringThroughStack() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");

        String inputString = scanner.nextLine();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < inputString.length(); i++) {
            stack.push(inputString.charAt(i));
        }
        System.out.println("Reverse a string");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }

    public static void main(String[] args) {
        String s = "Java Programming";
        //System.out.println(reverseStringUsingTemp(s));
        reverseStringThroughStack();
    }
}
