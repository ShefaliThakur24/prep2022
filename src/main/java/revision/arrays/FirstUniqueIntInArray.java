package revision.arrays;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueIntInArray {

    public static int findFirstUnique(int[] arr) {
        //If the element does not exist in the HashMap
        //Add that element with value = 0
        //or else update the number of occurrences of that element by adding 1
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (count.containsKey(arr[i])) {
                int occurence = count.get(arr[i]) + 1;
                count.put(arr[i], occurence);
            } else {
                count.put(arr[i], 0);
            }
        }
        //Traverse the array and check the number of occurrences
        //Return the first element with 0 occurences
        for (int i = 0; i < arr.length; i++) {
            if (count.get(arr[i]) == 0) {
                return arr[i];
            }
        }
        //If no such element is found, return -1
        return -1;
    }

    public static String ArrayToString(int[] arr) {
        if (arr.length > 0) {
            String res = "";
            for (int i = 0; i < arr.length; i++) {
                res += arr[i] + "";
            }
            return res;
        } else {
            return "Empty Array!";

        }
    }

    public static void main(String[] args) {

        int[] arr = {2, 54, 7, 2, 6, 54};

        int inique = findFirstUnique(arr);
        System.out.println(inique);
        System.out.println(ArrayToString(arr));

    }
}
