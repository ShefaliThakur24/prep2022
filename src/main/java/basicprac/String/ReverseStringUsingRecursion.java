package basicprac.String;

public class ReverseStringUsingRecursion {

    private static String reverse(String s) {
        //Terminating condition
        if (s == null || s.length() <= 1) {
            return s;
        }
        //Recurcive call
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        String s = "Object";
        String revStr = reverse(s);
        System.out.println(revStr);
    }
}
