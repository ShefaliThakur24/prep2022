package revision.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateCharacterInstringAndFirstNonRepeating {


    public static void printViaHashMap() {

        //Taking the input from system
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string");
        String inputString = scanner.nextLine();

        Map<Character, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < inputString.length(); i++) {
            Character ch = inputString.charAt(i);
            if (hashmap.containsKey(ch)) {
                hashmap.put(ch, hashmap.get(ch) + 1);
            } else {
                hashmap.put(ch, 1);
            }
        }

        //iterating through map to get key
        for (Map.Entry<Character, Integer> entry : hashmap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }

    }

    public static void getDuplicateCharater(String str) {

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            var ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else
                map.put(ch, 1);


        }
        //for iterating map
        for (Map.Entry entry : map.entrySet()) {
            if ((int) entry.getValue() > 1) {
                System.out.println(entry.getKey());

            }

        }


    }

    public static void main(String[] args) {
        String str = "allahabad";
        // getDuplicateCharater(str);
        printViaHashMap();
    }
}
