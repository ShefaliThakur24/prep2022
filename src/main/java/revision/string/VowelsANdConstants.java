package revision.string;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Set;

public class VowelsANdConstants {


    public static String removeVowels(String str) {
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u');
        StringBuilder sb = new StringBuilder();
        char ch[] = str.toCharArray();
        for (char c : ch) {
            if (!set.contains(c)) {
                sb.append(c);
            }

        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String inputString = scanner.nextLine();
        System.out.println(removeVowels(inputString));
    }
}
