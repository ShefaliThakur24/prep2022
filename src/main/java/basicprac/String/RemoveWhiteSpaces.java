package basicprac.String;

import java.util.Arrays;

public class RemoveWhiteSpaces {

    static boolean isWhiteChar(char c) {
        // there can be more white space characters
        // but for simplicity lets assume that we have
        // only two white space character
        // i.e. space and tab

        if (c == ' ' || c == '\t') {
            return true;
        } else
            return false;
    }

    static String removeWhiteSpaces(char[] str) {
//// return if string is null or length is equal to zero
        if (str.length == 0 || str == null || str[0] == '\0') {
            return "";
        }

        //We will use read, write pointers here. Write pointer will follow
        // the read pointer and only write characters read that are neither
        // a space (' ') nor a tab ('\t').
        int readPtr = 0;
        int WritePtr = 0;

        // iterate till read pointer is less than passed string length
        while (readPtr < str.length && str[readPtr] != '\0') {
            // if read pointer, i.e., current index value is not equal to space or tab,
            // copy it to the write pointer location and move the write pointer forward
            if (!isWhiteChar(str[readPtr])) {
                str[WritePtr] = str[readPtr];
                WritePtr++;
            }
            readPtr++;
        }
// returns string without spaces or tabs
        String ansStr = String.valueOf(Arrays.copyOfRange(str, 0, WritePtr));
        return ansStr;
    }

    public static void main(String[] args) {
        String str1 = "All greek to me.";
        System.out.println("1.    Actual string:            " + str1);
        char[] charStr = str1.toCharArray();
        System.out.println(" String without spaces or tabs: " + removeWhiteSpaces(charStr));
        System.out.println(
                "-----------------------------------------------------------------------------------------------------\n");
        String str2 = "We love Java";
        System.out.println("2.    Actual string:            " + str2);
        charStr = str2.toCharArray();
        System.out.println(" String without spaces or tabs: " + removeWhiteSpaces(charStr));
        System.out.println(
                "-----------------------------------------------------------------------------------------------------\n");
        String str3 = "You are amazing";
        System.out.println("3.    Actual string:            " + str3);
        charStr = str3.toCharArray();
        System.out.println(" String without spaces or tabs: " + removeWhiteSpaces(charStr));
        System.out.println(
                "-----------------------------------------------------------------------------------------------------\n");
    }
}

