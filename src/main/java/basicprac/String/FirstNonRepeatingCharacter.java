package basicprac.String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static void PrintViaHashMap() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");

        String str = in.nextLine();

        Map<Character, Integer> map = new LinkedHashMap<>(

        );
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        //As in case of Hashmap insertion order is not preserved so we will use linkedhashmap so in case of hashmap
        // we will use simple for loop for traversing
        //for(int j=0;j<str.length;j++){
        // ch=str.charAt[j]
        // if(map.get(ch)==1){
        // sout
        // break;}}
        for (Map.Entry<Character,Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
            {
                System.out.println(entry.getKey());
                break;

            }
        }
    }

    public static void main(String[] args) {
        PrintViaHashMap();
    }


}
