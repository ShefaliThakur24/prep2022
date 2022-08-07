package basicprac.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FindDuplicates {

    public static void findDuplicatesLoops(int[] arr)

    {
        System.out.println("Finding duplicates using loop");
        for (int i=0;i<arr.length;i++){
            for(int j= i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                {
                    System.out.println(arr[j] + "");
                }
            }
        }
    }

    public static void findDuplicatesMap(int[] arr) {
        System.out.println("Finding duplicates using map");
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (Map.Entry entrySet : map.entrySet()) {
            if ((int) entrySet.getValue() > 1) {
                System.out.println(entrySet.getKey() + "");
            }
        }

    }

    public static void findDuplicatesSet(int[] arr) {
        System.out.println("Finding duplicates using set");
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.add(i) == false) {
                System.out.println(i + "");
            }
        }
    }

    public static void main(String[] args) {
        int numarr[] = {0, 4, 3, 2, 7, 8, 2, 3, 1};


        findDuplicatesSet(numarr);
//        findDuplicatesMap(numarr);
//        findDuplicatesLoops(numarr);

    }
}
