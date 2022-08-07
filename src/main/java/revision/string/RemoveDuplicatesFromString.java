package revision.string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
    public void removeDuplicates(String s) {
        int size = s.length();
        Set<Character> set = new LinkedHashSet<>();
        for (int i = 0; i < size; i++) {
            set.add(s.charAt(i));
        }

        for (Character c : set) {
            System.out.println(c);
        }

    }

    public static void main(String[] args) {
        String s = "geeksforgeeks";
        RemoveDuplicatesFromString rs = new RemoveDuplicatesFromString();
        rs.removeDuplicates(s);
    }
}
