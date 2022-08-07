package basicprac.String;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

    public static String reverseStringOp(String str) {
        Stack<Character> stack = new Stack<>();
        char ch[] = str.toCharArray();
        for (char c : ch) {
            stack.push(c);
        }
        for (int i = 0; i < str.length(); i++) {
            ch[i] = stack.pop();
        }
        return new String(ch);
    }

    public static void reverseStringOpUsingStack() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");

        String str = in.nextLine();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        System.out.println("Reverse a string");
        while (!stack.empty()) {
            System.out.print(stack.pop());
        }

    }

    public static void main(String[] args) {
       // String str = "ABCD";
       // System.out.println(reverseStringOp(str));
        reverseStringOpUsingStack();
        //  String rev = "";
//        for(int i=str.length()-1;i>=0;i--){
//            rev=rev+str.charAt(i);
//        }
//        System.out.println(rev);
//    }

        //Using char array

//        char ch[] = str.toCharArray();
//        int length = ch.length;
//        for (int i = length - 1; i >= 0; i--) {
//            rev = rev + ch[i];
//
//        }
//        System.out.println(rev);
//    }

//        StringBuffer sb = new StringBuffer(str);
//        System.out.println(sb.reverse());

        //Using Stack
    }


}
