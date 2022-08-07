package basicprac.String;

import java.util.Scanner;

public class StringPermutation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
       printPermutations(str,"");
    }

    public static void printPermutations(String str, String asf) {
        if (str.length() == 0) {
            System.out.println(asf);
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String lpart = str.substring(0, i);
            String rpart = str.substring(i + 1);
            String rostr = lpart + rpart;
            printPermutations(rostr, asf + ch);


        }
    }
}
