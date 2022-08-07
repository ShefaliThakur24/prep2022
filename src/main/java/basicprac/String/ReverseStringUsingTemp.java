package basicprac.String;

public class ReverseStringUsingTemp {

    public static String reverseStr(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }
        char ch[] = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        String s = "Java Programming";
        System.out.println(reverseStr(s));

    }
}
