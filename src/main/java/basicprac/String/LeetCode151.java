package basicprac.String;

//reverse words in a String
public class LeetCode151 {

    public static String reverseWordByStringBuilder(String str) {
        String result = new String();
        int start = 0;
        int end = str.length();
        while (start < end) {
            while (start < end && str.charAt(start) == ' ')
                start++;
            // if(i>=n) break;
            int j = start + 1;
            while (j < end && str.charAt(j) != ' ') j++;
            String sub = str.substring(start, j);
            if (result.length() == 0) result = sub;
            else result = sub + " " + result;
            start = j + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        String str = " hello  world! ";
        System.out.println(reverseWordByStringBuilder(str));
    }

}
