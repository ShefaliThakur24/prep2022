package basicprac.String;

//Reverse Words in a String
//Two pointer technique;
public class LeetCode557 {

    static void reverse(char[] str, int start, int end) {
        while (start < end) {
            char temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;

        }
    }

    public static String reverseWords(String str) {
        if (str.length() == 0 || str == null) {
            return str;

        }

        char[] ch = str.toCharArray();
        int start = 0;
        int end = ch.length - 1;

        //to trim space characters from beginning
        while (start <= end && ch[start] == ' ') {
            start++;

        }
        //to trim space characters from end
        while (start <= end && ch[end] == ' ') {
            start--;

        }
        //Reverse words in a string

        reverse(ch, start, end);


        int i = 0;
        int j = 0;
        while (j <= str.length()) {
           //encountered word
            if (j == str.length() || ch[j] == ' ') {
                reverse(ch, i, j - 1);
                i = j + 1;
            }
            j++;
        }
        return new String(ch);
    }

    //as last word does not reverse so we need to set condition of j equal to str.length
    public static void main(String[] args) {
        String s = "Let's take leeetcode Contest";
        String rev = reverseWords(s);
        System.out.println(rev);

    }

}
