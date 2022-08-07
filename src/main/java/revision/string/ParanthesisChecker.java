package revision.string;

import java.util.Stack;

public class ParanthesisChecker {

    public static void main(String[] args) {
        String s = "{[()]}";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            //extract each character
            char ch = s.charAt(i);
            if (stack.empty()) {
                stack.push(ch);

            }
            else if (ch == '{' || ch == '[' || ch == '(') {
                stack.push(ch);

            }
            else if (ch == '}' && stack.peek()=='{') {
                stack.pop();

            }
        }


    }
}
