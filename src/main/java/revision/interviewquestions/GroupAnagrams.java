package revision.interviewquestions;

import java.util.*;

public class GroupAnagrams {

    public static List<List<String>> groupAnagrams(String[] s) {
        List<List<String>> groupedanagrams = new ArrayList<>();
        Map<String, List<String>> hashmap = new HashMap<>();
        for (String current : s) {
            char[] ch = current.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if (!hashmap.containsKey(sorted)) {
                hashmap.put(sorted, new ArrayList<>());
            }
            hashmap.get(sorted).add(current);
        }
        groupedanagrams.addAll(hashmap.values());
        return groupedanagrams;

    }

    public static void main(String[] args) {
        String strs[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(strs);
        System.out.println(result);
    }

}
