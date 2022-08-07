package basicprac.arrays;

import java.util.HashMap;
import java.util.Map;

public class CheckFirstUnique {
//complexity is On2 we need to use hashmap

    public static int findFirstUnique(int[] arr) {

        Map<Integer, Integer> count = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (count.containsKey(arr[i])) {
                int occurence = count.get(arr[i]) + 1;
                count.put(arr[i], occurence);
            } else

                count.put(arr[i], 0);
        }

        for (int i = 0; i < arr.length; i++) {
            if (count.get(arr[i]) == 0)
            {
                return arr[i];
            }
        }

//        boolean isRepeated = false;
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    isRepeated = true;
//                    break;
//                }
//            }
//            if (isRepeated == false) {
//                return arr[i];
//            }
//            else
//            {
//                isRepeated = false;
//            }
//        }
        return-1;
}

    public static String arrayToString(int[] arr) {
        if (arr.length > 0) {
            String result = "";
            for (int i = 0; i < arr.length; i++) {
                result += arr[i] + "";
            }
            return result;
        } else {
            return "Empty Array!";
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 54, 7, 2, 6, 54};
   //     System.out.println("Array" + arrayToString(arr));


        int unique = findFirstUnique(arr);
        System.out.println("First Unique in an Array: " + unique);
    }
}
