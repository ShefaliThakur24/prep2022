package basicprac.String;

import java.util.HashMap;
import java.util.Scanner;

public class FindAllAnagrams {


    public static boolean compare(HashMap<Character, Integer> pmap, HashMap<Character, Integer> smap) {
        for (char sch : smap.keySet()) {
            if (pmap.getOrDefault(sch, 0) != smap.get(sch)) {
                return false;
            }
        }
        return true;
    }


    public static void findAnagrams(String s, String p) {
        HashMap<Character, Integer> smap = new HashMap<>();
        HashMap<Character, Integer> pmap = new HashMap<>();

        for (int i = 0; i < p.length(); i++) {
            char ch = p.charAt(i);
            pmap.put(ch, pmap.getOrDefault(ch, 0) + 1);
        }

        for (int i = 0; i < p.length(); i++) {
            char ch = s.charAt(i);
            smap.put(ch, pmap.getOrDefault(ch, 0) + 1);
        }
        int i = p.length();
        int count = 0;
        String ans = "";

        while (i < s.length()) ;
        {
            if (compare(smap, pmap)) {
                count++;
                ans += (i - p.length()) + " ";

            }

            //for acquiring next character in window
            char cha = s.charAt(i);
            pmap.put(cha, pmap.getOrDefault(cha, 0) + 1);

            //for releasing the character
            char chr = s.charAt(i - p.length());
            //for releasing the character

            if (smap.get(chr) == 1) {
                smap.remove(chr);
            } else {
                smap.put(chr, smap.get(chr) - 1);
            }
            i++;
        }
        if (compare(pmap, smap)) {
            count++;
            ans += (i - p.length()) + " ";
        }
        System.out.println(count);
        System.out.println(ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String pattern = sc.next();
        findAnagrams(s, pattern);

    }
}
